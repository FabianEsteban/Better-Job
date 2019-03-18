package com.companyname.springapp.web;

import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lib.classTI.loginApp;
import lib.db.HelloDB;

@Controller
public class login extends HttpServlet {
	public HttpSession sesion;
	@RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView loginPage(Model model, HttpServletRequest request, HttpSession httpSession, HttpServletResponse response){
		Map<String, String[]> parameters = request.getParameterMap();

		try{
			sesion = request.getSession();
			String username = new String(parameters.get("username")[0].getBytes("ISO-8859-1"), "UTF-8");
			String pass = new String(parameters.get("password")[0].getBytes("ISO-8859-1"), "UTF-8");
			loginApp us = HelloDB.getLogin(username, pass);
			if(us != null){
//				sesion.setAttribute("usuario", us);
				
//				sesion.setAttribute("estado", us.estado);
//				sesion.setAttribute("ingresado", us.ingresado);
//				sesion.setAttribute("estado_curriculum", us.estado_curriculum);
//				sesion.setAttribute("usuario", us.getUsuario());
				lib.security.session ses = new lib.security.session(httpSession);
//				ses.setIdUser(us.getUsuario());
				ses.setNombre(us.perfilText);
				ses.init();
				if(us.getIngresado() == 0){
					return new ModelAndView("redirect:/titulo/activar_cuenta");
				}
				if(us.getPerfilText().equals("postulante") && us.getEstado() == 1 && us.getEstado_curriculum() == 1){
					return new ModelAndView("redirect:/titulo/perfil");
				}
				if(us.getPerfilText().equals("postulante") && us.getEstado() == 1 && us.getEstado_curriculum() == 0){
					return new ModelAndView("redirect:/titulo/curriculum");
				}
				if(us.getPerfilText().equals("administrador")){
					return new ModelAndView("redirect:/titulo/admin_curriculum");
				}
				return new ModelAndView("redirect:/titulo/perfil");	
			}
			else{
				System.out.println("Incorrecto");

				return new ModelAndView("login");
			}
		}catch(Exception ex){
			return new ModelAndView("login");
		}
		
	}
	@RequestMapping("/exit")
	public ModelAndView exit(Model model, HttpSession httpSession){
		lib.security.session ses = new lib.security.session(httpSession);
		ses.close();
		return new ModelAndView("redirect:/titulo/inicio");
	}
}
