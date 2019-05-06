package com.companyname.springapp.web;

import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lib.classTI.loginApp;
import lib.db.HelloDB;
import lib.security.session;

@Controller
public class loginEmpresa extends HttpServlet {
	public HttpSession sesion;
	@RequestMapping(value = "/loginEmpresa", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView loginPage(Model model, HttpServletRequest request, HttpSession httpSession, HttpServletResponse response){
		Map<String, String[]> parameters = request.getParameterMap();

		try{
//			sesion = request.getSession();
			String username = new String(parameters.get("username")[0].getBytes("ISO-8859-1"), "UTF-8");
			String pass = new String(parameters.get("password")[0].getBytes("ISO-8859-1"), "UTF-8");
			loginApp us = HelloDB.getLogin(username, pass);
			if(us != null){
//				sesion.setAttribute("usuario", us);
//				sesion.setAttribute("perfil", us.perfilText);
//				sesion.setAttribute("estado", us.estado);
//				sesion.setAttribute("estado_curriculum", us.estado_curriculum);
//				sesion.setAttribute("usuario", us.getUsuario());
				lib.security.session ses = new lib.security.session(httpSession);
//				lib.security.SessionCounter ses2 = new lib.security.SessionCounter(httpSession);
				ses.setPrivilegio(us.perfilText);
				ses.setRut(us.usuario);
				

				if(us.getPerfilText().equals("empresa") && us.getEstado() == 0){
//					ses2.sessionCreated(sesion);
					ses.init();
					return new ModelAndView("redirect:/titulo/admin_empresa");
				}
				else {
					return new ModelAndView("loginEmpresa");
				}
//				return new ModelAndView("redirect:/titulo/perfil");	
			}
			else{
				model.addAttribute("error", "*Datos incorrectos");
				return new ModelAndView("loginEmpresa");
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
				return new ModelAndView("loginEmpresa");
			}
		}
		
	}

}
