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

import lib.classTI.antecedentes;
import lib.classTI.carreras;
import lib.classTI.curriculum;
import lib.classTI.educacion;
import lib.classTI.insertCurriculum;
import lib.classTI.loginApp;
import lib.classTI.relacion;
import lib.classTI.universidades;
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
	@RequestMapping(value="/fabian/getPass/{rut}", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ArrayList<loginApp>getPass(@PathVariable String rut, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<loginApp> pm = new ArrayList<loginApp>();
		if(ses.isValid()){
			pm = HelloDB.getPass(rut);
			return pm;
		}
		
		return pm;
	}
	@RequestMapping(value="/fabian/getUniversidades/", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ArrayList<universidades>getUniversidades() throws Exception{
		ArrayList<universidades> cl = new ArrayList<universidades>();
		cl = HelloDB.getUniversidades();
		return cl;
	}
	@RequestMapping(value="/fabian/getCarreras/", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ArrayList<carreras>getCarreras() throws Exception{
		ArrayList<carreras> cl = new ArrayList<carreras>();
		cl = HelloDB.getCarreras();
		return cl;
	}
	@RequestMapping(value="/fabian/getDatosxPrivilegio/{privilegio}", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ArrayList<loginApp>getDatosxPrivilegio(@PathVariable String privilegio, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<loginApp> pm = new ArrayList<loginApp>();
		if(ses.isValid()){
			pm = HelloDB.getDatosxPrivilegio(privilegio);
			return pm;
		}
		
		return pm;
	}
	@RequestMapping(value="/fabian/getDatosxRut/{rut}", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ArrayList<loginApp>getDatosxRut(@PathVariable String rut, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<loginApp> pm = new ArrayList<loginApp>();
		if(ses.isValid()){
			pm = HelloDB.getDatosxRut(rut);
			return pm;
		}
		
		return pm;
	}
	@RequestMapping(value="/fabian/saveCuenta/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean saveCuenta(@RequestBody loginApp data) throws Exception{
		return HelloDB.saveCuenta(data);
	}
	@RequestMapping(value="/fabian/saveEnlace/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean saveEnlace(@RequestBody relacion data) throws Exception{
		return HelloDB.saveEnlace(data);
	}
	@RequestMapping(value="/fabian/saveCuentaxAdmin/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean saveCuentaxAdmin(@RequestBody loginApp data) throws Exception{
		return HelloDB.saveCuentaxAdmin(data);
	}
	@RequestMapping(value="/fabian/saveCurriculum/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean saveCurriculum(@RequestBody insertCurriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return HelloDB.saveCurriculum(data);
			
		}
		return false;
	}
	@RequestMapping(value = "/fabian/getCurriculumxRut/{rut}", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<curriculum> getCurriculumxRut(@PathVariable String rut, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<curriculum> pm = new ArrayList<curriculum>();
		if(ses.isValid()){
			pm = HelloDB.getCurriculumxRut(rut);
			return pm;
		}
		return pm;
	}
	@RequestMapping(value = "/fabian/getCurriculumxRutBasica/{rut}", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<educacion> getCurriculumxRutBasica(@PathVariable String rut, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<educacion> pm = new ArrayList<educacion>();
		if(ses.isValid()){
			pm = HelloDB.getCurriculumxRutBasica(rut);
			return pm;
		}
		return pm;
	}
	@RequestMapping(value = "/fabian/getCurriculumxRutMedia/{rut}", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<educacion> getCurriculumxRutMedia(@PathVariable String rut, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<educacion> pm = new ArrayList<educacion>();
		if(ses.isValid()){
			pm = HelloDB.getCurriculumxRutMedia(rut);
			return pm;
		}
		return pm;
	}
	@RequestMapping(value = "/fabian/getCurriculumxRutUniversitaria/{rut}", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<educacion> getCurriculumxRutUniversitaria(@PathVariable String rut, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<educacion> pm = new ArrayList<educacion>();
		if(ses.isValid()){
			pm = HelloDB.getCurriculumxRutUniversitaria(rut);
			return pm;
		}
		return pm;
	}
	@RequestMapping(value = "/fabian/getCurriculumxRutPostgrado/{rut}", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<educacion> getCurriculumxRutPostgrado(@PathVariable String rut, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<educacion> pm = new ArrayList<educacion>();
		if(ses.isValid()){
			pm = HelloDB.getCurriculumxRutPostgrado(rut);
			return pm;
		}
		return pm;
	}
	@RequestMapping(value = "/fabian/getCurriculumxRutCursos/{rut}", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<educacion> getCurriculumxRutCursos(@PathVariable String rut, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<educacion> pm = new ArrayList<educacion>();
		if(ses.isValid()){
			pm = HelloDB.getCurriculumxRutCursos(rut);
			return pm;
		}
		return pm;
	}
	@RequestMapping(value = "/fabian/getCurriculumxRutAntecedentes/{rut}", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<antecedentes> getCurriculumxRutAntecedentes(@PathVariable String rut, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<antecedentes> pm = new ArrayList<antecedentes>();
		if(ses.isValid()){
			pm = HelloDB.getCurriculumxRutAntecedentes(rut);
			return pm;
		}
		return pm;
	}
	@RequestMapping(value = "/fabian/getCurriculumxUniversidad/{cod_universidad}", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<curriculum> getCurriculumxUniversidad(@PathVariable int cod_universidad, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<curriculum> pm = new ArrayList<curriculum>();
		if(ses.isValid()){
			pm = HelloDB.getCurriculumxUniversidad(cod_universidad);
			return pm;
		}
		
		return pm;
	}
	@RequestMapping(value = "/fabian/getCurriculumxCarrera/{cod_carrera}", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<curriculum> getCurriculumxCarrera(@PathVariable int cod_carrera, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<curriculum> pm = new ArrayList<curriculum>();
		if(ses.isValid()){
			pm = HelloDB.getCurriculumxCarrera(cod_carrera);
			return pm;
		}
		
		return pm;
	}
	@RequestMapping(value = "/fabian/getAllCurriculum/", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<curriculum> getAllCurriculum(HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<curriculum> pm = new ArrayList<curriculum>();
		if(ses.isValid()){
			pm = HelloDB.getAllCurriculum();
			return pm;
		}
		
		return pm;
	}
	@RequestMapping(value = "/fabian/getRelacion/{postulante}", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ArrayList<relacion> getRelacion(@PathVariable int postulante,HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		ArrayList<relacion> pm = new ArrayList<relacion>();
		if(ses.isValid()){
			pm = HelloDB.getRelacion(postulante);
			return pm;
		}
		
		return pm;
	}
	@RequestMapping(value = "/fabian/updateNombre/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateNombre(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return HelloDB.updateNombre(data);
			
		}
		return false;
	}
	@RequestMapping(value = "/fabian/updateFecha/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateFecha(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return HelloDB.updateFecha(data);
			
		}
		return false;
	}
	@RequestMapping(value = "/fabian/updateEstado/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateEstado(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return HelloDB.updateEstado(data);
			
		}
		return false;
	}
	@RequestMapping(value = "/fabian/updateEstadoLogin/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateEstadoLogin(@RequestBody loginApp data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return HelloDB.updateEstadoLogin(data);
			
		}
		return false;
	}
	@RequestMapping(value = "/fabian/updatePais/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updatePais(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return HelloDB.updatePais(data);
			
		}
		return false;
	}
	@RequestMapping(value = "/fabian/updateDireccion/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateDireccion(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return HelloDB.updateDireccion(data);
			
		}
		return false;
	}
	@RequestMapping(value = "/fabian/updateTelefono/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateTelefono(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return HelloDB.updateTelefono(data);
			
		}
		return false;
	}
	@RequestMapping(value = "/fabian/updateCorreo/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateCorreo(@RequestBody curriculum data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return HelloDB.updateCorreo(data);
			
		}
		return false;
	}
	@RequestMapping(value = "/fabian/updateNombre_edu/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updateNombre_edu(@RequestBody educacion data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return HelloDB.updateNombre_edu(data);
			
		}
		return false;
	}
	@RequestMapping(value = "/fabian/updatePass/", method = {RequestMethod.PUT}, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean updatePass(@RequestBody loginApp data, HttpSession httpSession) throws Exception{
		session ses = new session(httpSession);
		if (ses.isValid()) {
			return HelloDB.updatePass(data);
			
		}
		return false;
	}
}

