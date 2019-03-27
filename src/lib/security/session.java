package lib.security;

import javax.servlet.http.HttpSession;

public class session {
	
	private HttpSession session;
	
	
	public int getId(){
		int value = (Integer) session.getAttribute("id");
		return value;
	}
	public void setId(int value){
		session.setAttribute("id", value);
	}
	public String getRut(){
		String value = (String) session.getAttribute("rut");
		return value;
	}
	public void setRut(String value){
		session.setAttribute("rut", value);
	}
	public String getCorreo(){
		String value = (String) session.getAttribute("correo");
		return value;
	}
	public void setCorreo(String value){
		session.setAttribute("correo", value);
	}
	public int getEstado_Curriculum(){
		int value = (Integer) session.getAttribute("estado_curriculum");
		return value;
	}
	public void setEstado_Curriculum(int value){
		session.setAttribute("estado_curriculum", value);
	}
	public String getPrivilegio(){
		String value = (String) session.getAttribute("privilegio");
		return value;
	}
	public void setPrivilegio(String value){
		session.setAttribute("privilegio", value);
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
			sw = true;
		}
		else {
			sw = false;
		}
		return sw;
	}
	public void close(){
		session.invalidate();
	}
}
