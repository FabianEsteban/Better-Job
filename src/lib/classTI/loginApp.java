package lib.classTI;

import java.util.List;


public class loginApp {
	public int id;
	public String usuario;
	public String correo;
	public String pass;
//	public int perfil;
	public String perfilText;
//	public String telefono;
	public int estado;
	public int estado_curriculum;
	public int ingresado;
	public String last_login;
	public String fecha_registro;
//	List<meses> meses;
	
//	public List<meses> getMeses() {
//		return meses;
//	}
//	public void setMeses(List<meses> meses) {
//		this.meses = meses;
//	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public String getLast_login() {
		return last_login;
	}
	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getUsuario(){
		return usuario;
	}
	public void setUsuario(String usuario){
		this.usuario = usuario;
	}
	public String getCorreo(){
		return correo;
	}
	public void setCorreo(String correo){
		this.correo = correo;
	}
	public String getPass(){
		return pass;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
//	public int getPerfil(){
//		return perfil;
//	}
//	public void setPerfil(int perfil){
//		this.perfil = perfil;
//	}
	public String getPerfilText(){
		return perfilText;
	}
	public void setPerfilText(String perfilText){
		this.perfilText = perfilText;
	}
//	public String getTelefono(){
//		return telefono;
//	}
//	public void setTelefono(String telefono){
//		this.telefono = telefono;
//	}
	public int getEstado(){
		return estado;
	}
	public void setEstado(int estado){
		this.estado = estado;
	}
	public int getEstado_curriculum(){
		return estado_curriculum;
	}
	public void setEstado_curriculum(int estado_curriculum){
		this.estado_curriculum = estado_curriculum;
	}
	public int getIngresado(){
		return ingresado;
	}
	public void setIngresado(int ingresado){
		this.ingresado = ingresado;
	}
}
