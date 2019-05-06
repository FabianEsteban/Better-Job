package com.companyname.springapp.web;

import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSessionEvent;

//import javax.servlet.http.HttpSessionEvent;
//import javax.swing.JOptionPane;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lib.classTI.loginApp;
import lib.db.HelloDB;
import lib.security.session;



@Controller
public class login extends HttpServlet {
//	public HttpSession sesion;
	
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView loginPage(Model model, HttpServletRequest request, HttpSession httpSession, HttpServletResponse response){
		Map<String, String[]> parameters = request.getParameterMap();
		
		try{
//			HttpSession sesion = request.getSession();
//			httpSession.invalidate();
			String username = new String(parameters.get("username")[0].getBytes("ISO-8859-1"), "UTF-8");
			String pass = new String(parameters.get("password")[0].getBytes("ISO-8859-1"), "UTF-8");
			loginApp us = HelloDB.getLogin(username, pass);
			if(us != null){
//				sesion.setAttribute("usuario", us);
//				sesion.setAttribute("estado", us.estado);
//				sesion.setAttribute("ingresado", us.ingresado);
//				sesion.setAttribute("estado_curriculum", us.estado_curriculum);
//				sesion.setAttribute("usuario", us.getUsuario());
//				httpSession = request.getSession();
				lib.security.session ses = new lib.security.session(httpSession);
//				lib.security.SessionCounter ses2 = new lib.security.SessionCounter(httpSession);
//				ses.setIdUser(us.getUsuario());
				ses.setPrivilegio(us.perfilText);
				ses.setRut(us.usuario);
				ses.setCorreo(us.correo);
				ses.setId(us.id);
				ses.setEstado_Curriculum(us.estado_curriculum);
				

				if(us.getIngresado() == 0 && us.getEstado() == 0){	
//					ses2.sessionCreated(sesion);
					ses.init();
					return new ModelAndView("redirect:/titulo/activar_cuenta");
				}
				if(us.getPerfilText().equals("postulante") && us.getEstado() == 0 && us.getEstado_curriculum() == 1){
//					ses2.sessionCreated(sesion);
					ses.init();
					return new ModelAndView("redirect:/titulo/perfil");
				}
				if(us.getPerfilText().equals("postulante") && us.getEstado() == 0 && us.getEstado_curriculum() == 0){
//					ses2.sessionCreated(sesion);
					ses.init();
					return new ModelAndView("redirect:/titulo/curriculum");
				}
				if(us.getPerfilText().equals("administrador") && us.getEstado() == 0){
					ses.init();
					return new ModelAndView("redirect:/titulo/dashboards");
				}

				return new ModelAndView("redirect:/titulo/login");	
			}
			else{
				model.addAttribute("error", "*Datos incorrectos");
				return new ModelAndView("login");
			}
		}catch(Exception ex){
			session ses = new session(httpSession);
			if(ses.isValid() && ses.getPrivilegio().equals("postulante")){
				model.addAttribute("rut", ses.getRut());
	    		model.addAttribute("estado_curriculum", ses.getEstado_Curriculum());
	    		model.addAttribute("active_perfil", "active");
	            model.addAttribute("javaScriptPage", "perfil");  
	            return new ModelAndView("perfil");
			}
			else if(ses.isValid() && ses.getPrivilegio().equals("administrador")){
				model.addAttribute("active_curriculum", "active");
	            model.addAttribute("javaScriptPage", "admin_curriculum");    
	            return new ModelAndView("admin_curriculum");
			}
			else if(ses.isValid() && ses.getPrivilegio().equals("empresa")){
	    		model.addAttribute("rut", ses.getRut());
	    		model.addAttribute("active_empresa", "active");
	            model.addAttribute("javaScriptPage", "admin_empresa");    
	            return new ModelAndView("admin_empresa");
			}
			else {
				return new ModelAndView("login");
			}
		}
		
	}

}
