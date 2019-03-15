package lib.classTI;

import java.util.List;

public class curriculum {
	public int ID;
	public String rut;
	public String nombre;
	public String fecha_nacimiento;
	public String pais;
	public String estado_civil;
	public String direccion;
	public String region;
	public String comuna;
	public String telefono;
	public String correo;
	public String disponibilidad;
	public String nombre_recomendacion;
	public String empresa_recomendacion;
	public String telefono_recomendacion;
	public String mail_recomendacion;
	public String fecha_edit;
	public int evaluacion;
	List<antecedentes> antecedentes;
	List<educacion> educacion;
	List<universidades> universidades;
	List<carreras> carreras;
	
	
	
	
	
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public String getNombre_recomendacion() {
		return nombre_recomendacion;
	}
	public void setNombre_recomendacion(String nombre_recomendacion) {
		this.nombre_recomendacion = nombre_recomendacion;
	}
	public String getEmpresa_recomendacion() {
		return empresa_recomendacion;
	}
	public void setEmpresa_recomendacion(String empresa_recomendacion) {
		this.empresa_recomendacion = empresa_recomendacion;
	}
	public String getTelefono_recomendacion() {
		return telefono_recomendacion;
	}
	public void setTelefono_recomendacion(String telefono_recomendacion) {
		this.telefono_recomendacion = telefono_recomendacion;
	}
	public String getMail_recomendacion() {
		return mail_recomendacion;
	}
	public void setMail_recomendacion(String mail_recomendacion) {
		this.mail_recomendacion = mail_recomendacion;
	}
	public String getFecha_edit() {
		return fecha_edit;
	}
	public void setFecha_edit(String fecha_edit) {
		this.fecha_edit = fecha_edit;
	}
	public List<antecedentes> getAntecedentes() {
		return antecedentes;
	}
	public void setAntecedentes(List<antecedentes> antecedentes) {
		this.antecedentes = antecedentes;
	}
	public List<educacion> getEducacion() {
		return educacion;
	}
	public void setEducacion(List<educacion> educacion) {
		this.educacion = educacion;
	}
	public List<universidades> getUniversidades() {
		return universidades;
	}
	public void setUniversidades(List<universidades> universidades) {
		this.universidades = universidades;
	}
	public List<carreras> getCarreras() {
		return carreras;
	}
	public void setCarreras(List<carreras> carreras) {
		this.carreras = carreras;
	}
	public int getEvaluacion() {
		return evaluacion;
	}
	public void setEvaluacion(int evaluacion) {
		this.evaluacion = evaluacion;
	}
	
}
