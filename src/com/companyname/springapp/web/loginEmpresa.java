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

@Controller
public class loginEmpresa extends HttpServlet {
	public HttpSession sesion;
	@RequestMapping(value = "/loginEmpresa", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView loginPage(Model model, HttpServletRequest request, HttpSession httpSession, HttpServletResponse response){
		Map<String, String[]> parameters = request.getParameterMap();

		try{
			sesion = request.getSession();
			String username = new String(parameters.get("username")[0].getBytes("ISO-8859-1"), "UTF-8");
			String pass = new String(parameters.get("password")[0].getBytes("ISO-8859-1"), "UTF-8");
			loginApp us = HelloDB.getLogin(username, pass);
			if(us != null){
				sesion.setAttribute("usuario", us);
				sesion.setAttribute("perfil", us.perfilText);
				sesion.setAttribute("estado", us.estado);
//				sesion.setAttribute("estado_curriculum", us.estado_curriculum);
				sesion.setAttribute("usuario", us.getUsuario());
				lib.security.session ses = new lib.security.session(httpSession);
				ses.setIdUser(us.getUsuario());
				ses.init();

				if(us.getPerfilText().equals("empresa")){
					return new ModelAndView("redirect:/titulo/admin_empresa");
				}
				return new ModelAndView("redirect:/titulo/perfil");	
			}
			else{
				System.out.println("Incorrecto");
				return new ModelAndView("loginEmpresa");
			}
		}catch(Exception ex){
			return new ModelAndView("loginEmpresa");
		}
		
	}

}
