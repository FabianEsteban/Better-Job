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
    public ModelAndView admin_seguimiento(Model model, HttpSession httpSession){
    	session ses = new session(httpSession);
    	if(ses.isValid()){
    		return new ModelAndView("redirect:/titulo/login");
    	}
    	model.addAttribute("active_seguimiento", "active");
        model.addAttribute("javaScriptPage", "admin_seguimiento");    
        return new ModelAndView("admin_seguimiento");
    }
}