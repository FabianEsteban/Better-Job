package com.companyname.springapp.web;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lib.classTI.curriculum;
import lib.classTI.educacion;
import lib.classTI.insertCurriculum;
import lib.classTI.loginApp;
import lib.db.HelloDB;
import lib.security.session;

@Controller
public class HelloJson {
	@RequestMapping(value="/fabian/getDatos/", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ArrayList<loginApp>getVariable() throws Exception{
		ArrayList<loginApp> cl = new ArrayList<loginApp>();
		cl = HelloDB.getVariable();
		return cl;
	}
	@RequestMapping(value="/fabian/getDatosxPrivilegio/{privilegio}", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ArrayList<loginApp>getDatosxPrivilegio(@PathVariable String privilegio, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<loginApp> pm = new ArrayList<loginApp>();
		if(ses.isValid()){
			return pm;
		}
		pm = HelloDB.getDatosxPrivilegio(privilegio);
		return pm;
	}
	@RequestMapping(value="/fabian/getDatosxRut/{rut}", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ArrayList<loginApp>getDatosxRut(@PathVariable String rut, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<loginApp> pm = new ArrayList<loginApp>();
		if(ses.isValid()){
			return pm;
		}
		pm = HelloDB.getDatosxRut(rut);
		return pm;
	}
	@RequestMapping(value="/fabian/saveCuenta/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean saveCuenta(@RequestBody loginApp data) throws Exception{
		return HelloDB.saveCuenta(data);
	}
	@RequestMapping(value="/fabian/saveCurriculum/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean saveCurriculum(@RequestBody insertCurriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return false;
		}
		return HelloDB.saveCurriculum(data);
	}
	@RequestMapping(value = "/fabian/getCurriculum/{rut}", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<curriculum> getParametros(@PathVariable String rut, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<curriculum> pm = new ArrayList<curriculum>();
		if(ses.isValid()){
			return pm;
		}
		pm = HelloDB.getCurriculum(rut);
		return pm;
	}
	@RequestMapping(value = "/fabian/getAllCurriculum/", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<curriculum> getAllCurriculum(HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<curriculum> pm = new ArrayList<curriculum>();
		if(ses.isValid()){
			return pm;
		}
		pm = HelloDB.getAllCurriculum();
		return pm;
	}
	@RequestMapping(value = "/fabian/updateNombre/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateNombre(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return false;
		}
		return HelloDB.updateNombre(data);
	}
	@RequestMapping(value = "/fabian/updateFecha/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateFecha(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return false;
		}
		return HelloDB.updateFecha(data);
	}
	@RequestMapping(value = "/fabian/updateEstado/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateEstado(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return false;
		}
		return HelloDB.updateEstado(data);
	}
	@RequestMapping(value = "/fabian/updateEstadoLogin/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateEstadoLogin(@RequestBody loginApp data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return false;
		}
		return HelloDB.updateEstadoLogin(data);
	}
	@RequestMapping(value = "/fabian/updatePais/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updatePais(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return false;
		}
		return HelloDB.updatePais(data);
	}
	@RequestMapping(value = "/fabian/updateDireccion/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateDireccion(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return false;
		}
		return HelloDB.updateDireccion(data);
	}
	@RequestMapping(value = "/fabian/updateTelefono/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateTelefono(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return false;
		}
		return HelloDB.updateTelefono(data);
	}
	@RequestMapping(value = "/fabian/updateCorreo/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateCorreo(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return false;
		}
		return HelloDB.updateCorreo(data);
	}
	@RequestMapping(value = "/fabian/updateNombre_edu/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateNombre_edu(@RequestBody educacion data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return false;
		}
		return HelloDB.updateNombre_edu(data);
	}
}

