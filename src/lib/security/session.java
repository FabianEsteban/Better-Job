package lib.security;

import javax.servlet.http.HttpSession;

public class session {
	
	private HttpSession session;
	
	private int idUser;
	private int idPerfil;
	private String nombre;
	
	public int getIdUser(){
		int value = (Integer) session.getAttribute("idUser");
		return value;
	}
	public void setIdUser(String value){
		session.setAttribute("idUser", value);
	}
	public int getIdPerfil(){
		int value = (Integer) session.getAttribute("idPerfil");
		return value;
	}
	public void setIdPerfil(int value){
		session.setAttribute("idPerfil", value);
	}
	public String getNombre(){
		String value = (String) session.getAttribute("nombre");
		return value;
	}
	public void setNombre(String value){
		session.setAttribute("nombre", value);
	}
	
	
	
	
	
	public session(HttpSession httpSession){
		session = httpSession;
	}
	public void init(){
		session.setMaxInactiveInterval(30*60);
		session.setAttribute("login", "ok");
	}
	public void setValue(String key, String value){
		session.setAttribute(key, value);
	}
	public String getValue(String key){
		String value = (String) session.getAttribute(key);
		if(value==null){
			value="";
		}
		return value;
	}
	public boolean isValid(){
		boolean sw = true;
		String login = (String) session.getAttribute("login");
		if(login != null){
			sw = false;
		}
		return sw;
	}
	public void close(){
		session.invalidate();
	}
}
