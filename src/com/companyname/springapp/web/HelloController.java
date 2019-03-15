package com.companyname.springapp.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lib.db.HelloDB;
import lib.security.session;

@Controller
public class HelloController {


	@RequestMapping("/inicio")
    public ModelAndView inicio(Model model){
    	
    	model.addAttribute("javaScriptPage", "inicio");
        
        return new ModelAndView("inicio");
    }
	
    @RequestMapping("/perfil")
    public ModelAndView perfil(Model model, HttpSession httpSession){
    	session ses = new session(httpSession);
    	if(ses.isValid()){
    		return new ModelAndView("redirect:/titulo/login");
    	}
    	model.addAttribute("active_perfil", "active");
        model.addAttribute("javaScriptPage", "perfil");  
        return new ModelAndView("perfil");
    }
    
    @RequestMapping("/activar_cuenta")
    public ModelAndView activar_cuenta(Model model, HttpSession httpSession){
    	session ses = new session(httpSession);
    	if(ses.isValid()){
    		return new ModelAndView("redirect:/titulo/activar_cuenta");
    	}
    	model.addAttribute("activar_cuenta", "active");
        model.addAttribute("javaScriptPage", "activar_cuenta");    
        return new ModelAndView("activar_cuenta");
    }
    
    @RequestMapping("/curriculum")
    public ModelAndView curriculum(Model model, HttpSession httpSession){
    	session ses = new session(httpSession);
    	if(ses.isValid()){
    		return new ModelAndView("redirect:/titulo/login");
    	}
    	model.addAttribute("active_curriculum", "active");
        model.addAttribute("javaScriptPage", "curriculum");    
        return new ModelAndView("curriculum");
    }

    @RequestMapping("/registrar")
    public ModelAndView registrar(Model model){

        model.addAttribute("javaScriptPage", "registrar");      
        return new ModelAndView("registrar");
    }
    
    @RequestMapping("/admin_curriculum")
    public ModelAndView admin_curriculum(Model model, HttpSession httpSession){
    	session ses = new session(httpSession);
    	if(ses.isValid()){
    		return new ModelAndView("redirect:/titulo/login");
    	}
    	model.addAttribute("active_curriculum", "active");
        model.addAttribute("javaScriptPage", "admin_curriculum");    
        return new ModelAndView("admin_curriculum");
    }
    @RequestMapping("/admin_administrador")
    public ModelAndView admin_administrador(Model model, HttpSession httpSession){
    	session ses = new session(httpSession);
    	if(ses.isValid()){
    		return new ModelAndView("redirect:/titulo/login");
    	}
    	model.addAttribute("active_administrador", "active");
        model.addAttribute("javaScriptPage", "admin_administrador"); 
        return new ModelAndView("admin_administrador");
    }
    @RequestMapping("/admin_seguimiento")
    public ModelAndView admin_seguimiento(@RequestParam(name = "rut") String rut, Model model, HttpSession httpSession){
    	session ses = new session(httpSession);
    	if(ses.isValid()){
    		return new ModelAndView("redirect:/titulo/login");
    	}
    	model.addAttribute("active_seguimiento", "active");
        model.addAttribute("javaScriptPage", "admin_seguimiento");   
        model.addAttribute("rut", rut);
        return new ModelAndView("admin_seguimiento");
    }
    @RequestMapping("/admin_empresa")
    public ModelAndView empresa(Model model, HttpSession httpSession){
    	session ses = new session(httpSession);
    	if(ses.isValid()){
    		return new ModelAndView("redirect:/titulo/login");
    	}
    	model.addAttribute("active_empresa", "active");
        model.addAttribute("javaScriptPage", "admin_empresa");    
        return new ModelAndView("admin_empresa");
    }
    @RequestMapping("/postulantes")
    public ModelAndView postulantes(Model model, HttpSession httpSession){
    	session ses = new session(httpSession);
    	if(ses.isValid()){
    		return new ModelAndView("redirect:/titulo/login");
    	}
    	model.addAttribute("active_postulantes", "active");
        model.addAttribute("javaScriptPage", "postulantes");    
        return new ModelAndView("postulantes");
    }
}