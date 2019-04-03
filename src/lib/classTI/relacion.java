package lib.classTI;

public class relacion {
	public int id_relacion;
	public String empresa;
	public int postulante;
	public int estado;
	
	
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getId_relacion() {
		return id_relacion;
	}
	public void setId_relacion(int id_relacion) {
		this.id_relacion = id_relacion;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getPostulante() {
		return postulante;
	}
	public void setPostulante(int postulante) {
		this.postulante = postulante;
	}
}
