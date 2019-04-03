package lib.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import lib.classTI.antecedentes;
import lib.classTI.carreras;
import lib.classTI.comuna;
import lib.classTI.curriculum;
import lib.classTI.educacion;
import lib.classTI.insertCurriculum;
import lib.classTI.loginApp;
import lib.classTI.region;
import lib.classTI.relacion;
import lib.classTI.universidades;

public class HelloDB {
	
	@SuppressWarnings("finally")
	public static ArrayList<loginApp> getVariable() throws Exception {
		PreparedStatement ps = null;
		String sql = "";
		ArrayList<loginApp> data = new ArrayList<loginApp>();
		ConnectionDB db = new ConnectionDB();
		try{
			sql = "select ID, usuario, correo, perfilText, estado from login";
			
			ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				loginApp c = new loginApp();
				c.setId(rs.getInt("ID"));
				c.setUsuario(rs.getString("usuario"));
				c.setCorreo(rs.getString("correo"));
				c.setPerfilText(rs.getString("perfilText"));
				c.setEstado(rs.getInt("estado"));
				data.add(c);
			}
			rs.close();
			ps.close();
			db.conn.close();
		}catch(Exception ex){
			System.out.println("Error getclase:"+ex.getMessage());
		}
		finally{
			ps.close();
			db.close();

		return data;
		}
	}
	
	@SuppressWarnings("finally")
	public static ArrayList<loginApp> getPass(String rut) throws Exception {
		PreparedStatement ps = null;
		String sql = "";
		ArrayList<loginApp> data = new ArrayList<loginApp>();
		ConnectionDB db = new ConnectionDB();
		try{
			sql = "select pass, estado_curriculum from login where usuario = '"+rut+"'";
			
			ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				loginApp c = new loginApp();
				c.setPass(rs.getString("pass"));
				c.setEstado_curriculum(rs.getInt("estado_curriculum"));
				data.add(c);
			}
			rs.close();
			ps.close();
			db.conn.close();
		}catch(Exception ex){
			System.out.println("Error getclase:"+ex.getMessage());
		}
		finally{
			ps.close();
			db.close();

		return data;
		}
	}
	
	@SuppressWarnings("finally")
	public static ArrayList<universidades> getUniversidades() throws Exception {
		PreparedStatement ps = null;
		String sql = "";
		ArrayList<universidades> data = new ArrayList<universidades>();
		ConnectionDB db = new ConnectionDB();
		try{
			sql = "select * from universidades";
			
			ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				universidades c = new universidades();
				c.setId_universidad(rs.getInt("id_universidad"));
				c.setUniversidad(rs.getString("universidad"));
				data.add(c);
			}
			rs.close();
			ps.close();
			db.conn.close();
		}catch(Exception ex){
			System.out.println("Error getclase:"+ex.getMessage());
		}
		finally{
			ps.close();
			db.close();

		return data;
		}
	}
	
	@SuppressWarnings("finally")
	public static ArrayList<carreras> getCarreras() throws Exception {
		PreparedStatement ps = null;
		String sql = "";
		ArrayList<carreras> data = new ArrayList<carreras>();
		ConnectionDB db = new ConnectionDB();
		try{
			sql = "select * from carreras";
			
			ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				carreras c = new carreras();
				c.setId_carrera(rs.getInt("id_carrera"));
				c.setCarrera(rs.getString("carrera"));
				data.add(c);
			}
			rs.close();
			ps.close();
			db.conn.close();
		}catch(Exception ex){
			System.out.println("Error getclase:"+ex.getMessage());
		}
		finally{
			ps.close();
			db.close();

		return data;
		}
	}
	@SuppressWarnings("finally")
	public static ArrayList<region> getRegiones() throws Exception {
		PreparedStatement ps = null;
		String sql = "";
		ArrayList<region> data = new ArrayList<region>();
		ConnectionDB db = new ConnectionDB();
		try{
			sql = "select * from regiones";
			
			ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				region c = new region();
				c.setIdregiones(rs.getInt("idregiones"));
				c.setRegion(rs.getString("region"));
				data.add(c);
			}
			rs.close();
			ps.close();
			db.conn.close();
		}catch(Exception ex){
			System.out.println("Error getclase:"+ex.getMessage());
		}
		finally{
			ps.close();
			db.close();

		return data;
		}
	}
	@SuppressWarnings("finally")
	public static ArrayList<comuna> getComunas(int region) throws Exception {
		PreparedStatement ps = null;
		String sql = "";
		ArrayList<comuna> data = new ArrayList<comuna>();
		ConnectionDB db = new ConnectionDB();
		try{
			sql = "select * from titulo.comunas where region = "+region+"";
			
			ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				comuna c = new comuna();
				c.setIdcomunas(rs.getInt("idcomunas"));
				c.setRegion(rs.getInt("region"));
				c.setComuna(rs.getString("comuna"));
				data.add(c);
			}
			rs.close();
			ps.close();
			db.conn.close();
		}catch(Exception ex){
			System.out.println("Error getclase:"+ex.getMessage());
		}
		finally{
			ps.close();
			db.close();

		return data;
		}
	}
	@SuppressWarnings("finally")
	public static ArrayList<loginApp> getDatosxPrivilegio(String privilegio) throws Exception {
		PreparedStatement ps = null;
		String sql = "";
		ArrayList<loginApp> data = new ArrayList<loginApp>();
		ConnectionDB db = new ConnectionDB();
		try{
			sql = "select ID, usuario, correo, perfilText, estado from login where perfilText = '"+privilegio+"'";
			
			ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				loginApp c = new loginApp();
				c.setId(rs.getInt("ID"));
				c.setUsuario(rs.getString("usuario"));
				c.setCorreo(rs.getString("correo"));
				c.setPerfilText(rs.getString("perfilText"));
				c.setEstado(rs.getInt("estado"));
				data.add(c);
			}
			rs.close();
			ps.close();
			db.conn.close();
		}catch(Exception ex){
			System.out.println("Error getclase:"+ex.getMessage());
		}
		finally{
			ps.close();
			db.close();

		return data;
		}
	}
	
	@SuppressWarnings("finally")
	public static ArrayList<loginApp> getDatosxRut(String rut) throws Exception {
		PreparedStatement ps = null;
		String sql = "";
		ArrayList<loginApp> data = new ArrayList<loginApp>();
		ConnectionDB db = new ConnectionDB();
		try{
			sql = "select ID, usuario, correo, perfilText, estado from login where usuario = '"+rut+"'";
			
			ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				loginApp c = new loginApp();
				c.setId(rs.getInt("ID"));
				c.setUsuario(rs.getString("usuario"));
				c.setCorreo(rs.getString("correo"));
				c.setPerfilText(rs.getString("perfilText"));
				c.setEstado(rs.getInt("estado"));
				data.add(c);
			}
			rs.close();
			ps.close();
			db.conn.close();
		}catch(Exception ex){
			System.out.println("Error getclase:"+ex.getMessage());
		}
		finally{
			ps.close();
			db.close();

		return data;
		}
	}

	public static loginApp getLogin(String user, String pass) {
		ConnectionDB db = new ConnectionDB();
		Statement stmt = null;
		String sql = "";
		loginApp us = null;
		try{
			sql = "SELECT * FROM login where usuario = '"+user+"' and pass='"+pass+"'";
			stmt = db.conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()){
				us = new loginApp();
				us.setId(rs.getInt("id"));
				us.setUsuario(rs.getString("usuario"));
				us.setCorreo(rs.getString("correo"));
				us.setPerfilText(rs.getString("perfilText"));
				us.setEstado(rs.getInt("estado"));
				us.setEstado_curriculum(rs.getInt("estado_curriculum"));
				us.setIngresado(rs.getInt("ingresado"));
			}
			insertLog(us.getUsuario());
			stmt.close();
			rs.close();
			db.conn.close();
		}catch(Exception ex){
			System.out.println("Error getLogin: "+ex.getMessage());
		}finally{
			db.close();
		}
		return us;
	}

	public static void insertLog(String id_user) throws Exception {
		ConnectionDB db = new ConnectionDB();
		PreparedStatement ps = null;
		String log = "";
		try{
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			String fecha = dateFormat.format(date).toString().replaceAll("/","-");
			log = "INSERT historial_login(id_user, hora_fecha) VALUES ('"+id_user+"', '"+fecha+"')";
			ps = db.conn.prepareStatement(log);
			ps.execute();
			ps.close();
			db.conn.close();
		}catch(Exception ex){
			System.out.println("Error: "+ ex.getMessage());
		}finally{
			db.close();
		}
	}

	public static boolean saveCuenta(loginApp data) throws Exception{
		PreparedStatement ps = null;
		String sql = "";
		ConnectionDB db = new ConnectionDB();
		
		try{
			sql = "INSERT into login (usuario, correo, pass, perfilText, estado, estado_curriculum, ingresado) "
					+ "values ('"+data.getUsuario()+"', '"+data.getCorreo()+"', '"+data.getPass()+"', '"+data.getPerfilText()+"', 0, 0, 1)";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			return true;
		}
		catch(SQLException e){
			System.out.println("Error: "+e.getMessage());
		}
		catch(Exception e){
			System.out.println("Error: "+ e.getMessage());
		}
		finally{
			ps.close();
			db.close();
		}
		return false;
	}
	public static boolean saveEnlace(relacion data) throws Exception{
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		PreparedStatement ps3 = null;
		String sql = "";
		String sql2 = "";
		String sql3 = "";
		ConnectionDB db = new ConnectionDB();
		
		try{
			sql2 = "select * from relacion where empresa = '"+data.getEmpresa()+"' and postulante = '"+data.getPostulante()+"'";
			ps2 = db.conn.prepareStatement(sql2);
			ResultSet rs2 = ps2.executeQuery();
			if(!rs2.isBeforeFirst()){
				sql = "INSERT into relacion (empresa, postulante, estado_relacion) "
						+ "values ('"+data.getEmpresa()+"', '"+data.getPostulante()+"', 1)";
				ps = db.conn.prepareStatement(sql);
				ps.execute();
				return true;
			}
			else {
				sql3 = "update relacion set estado_relacion = 1 where empresa = '"+data.getEmpresa()+"' and postulante = '"+data.getPostulante()+"'";
				ps3 = db.conn.prepareStatement(sql3);
				ps3.execute();
				return true;
			}
			
		}
		catch(SQLException e){
			System.out.println("Error: "+e.getMessage());
		}
		catch(Exception e){
			System.out.println("Error: "+ e.getMessage());
		}
		finally{
//			ps.close();
			db.close();
		}
		return false;
	}
	public static boolean saveCuentaxAdmin(loginApp data) throws Exception{
		PreparedStatement ps = null;
		String sql = "";
		ConnectionDB db = new ConnectionDB();
		
		try{
			sql = "INSERT into login (usuario, correo, pass, perfilText, estado, estado_curriculum, ingresado) "
					+ "values ('"+data.getUsuario()+"', '"+data.getCorreo()+"', '"+data.getPass()+"', '"+data.getPerfilText()+"', 0, 0, 0)";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			return true;
		}
		catch(SQLException e){
			System.out.println("Error: "+e.getMessage());
		}
		catch(Exception e){
			System.out.println("Error: "+ e.getMessage());
		}
		finally{
			ps.close();
			db.close();
		}
		return false;
	}
	public static boolean saveCurriculum(insertCurriculum data) throws Exception{
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		PreparedStatement ps3 = null;
		PreparedStatement ps4 = null;
		PreparedStatement ps6 = null;
		PreparedStatement ps7 = null;
		PreparedStatement ps8 = null;
		PreparedStatement ps19 = null;
		String sql = "";
		String sql2 = "";
		String sql3 = "";
		String sql19 = "";
		String sql4 = "";
		String sql6 = "";
		String sql7 = "";
		String sql8 = "";
		ConnectionDB db = new ConnectionDB();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		try{
//			******************************* CURRICULUM ************************
			sql = "INSERT into curriculum (rut, nombre, fecha_nacimiento, pais, estado_civil, direccion, region, comuna,"
					+ " telefono, correo, disponibilidad, nombre_recomendacion, empresa_recomendacion, telefono_recomendacion,"
					+ " mail_recomendacion, fecha_edit, evaluacion) values ('"+data.getRut()+"', '"+data.getNombre()+"',"
					+ " '"+data.getFecha_nacimiento()+"', '"+data.getPais()+"', '"+data.getEstado_civil()+"',"
					+ " '"+data.getDireccion()+"', '"+data.getRegion()+"', '"+data.getComuna()+"', '"+data.getTelefono()+"',"
					+ " '"+data.getCorreo()+"', '"+data.getDisponibilidad()+"', '"+data.getNombre_recomendacion()+"',"
					+ " '"+data.getEmpresa_recomendacion()+"', '"+data.getTelefono_recomendacion()+"',"
					+ " '"+data.getMail_recomendacion()+"', '"+dateFormat.format(date)+"', 0)";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			
			
//			******************************* BASICA ************************
			sql2 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
					+ " values ('"+data.getRut()+"', '1', '"+data.getInstitucion_basica()+"', "
					+ "'', '"+data.getAno_basica()+"', '"+data.getAno_basica()+"', "
					+ "'')";
			ps2 = db.conn.prepareStatement(sql2);
			ps2.execute();
			
			if(data.getInstitucion_basica1() != null){
				System.out.println("entra");
				String sql5 = "";
				PreparedStatement ps5 = null;
				sql5 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '1', '"+data.getInstitucion_basica1()+"', "
						+ "'', '"+data.getAno_basica1()+"', '"+data.getAno_basica1()+"', "
						+ "'')";
				ps5 = db.conn.prepareStatement(sql5);
				ps5.execute();
			}
			if(data.getInstitucion_basica2() != null){
				String sql10 = "";
				PreparedStatement ps10 = null;
				sql10 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '1', '"+data.getInstitucion_basica2()+"', "
						+ "'', '"+data.getAno_basica2()+"', '"+data.getAno_basica2()+"', "
						+ "'')";
				ps10 = db.conn.prepareStatement(sql10);
				ps10.execute();
			}
			
//			******************************* MEDIA ************************
			sql4 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
					+ " values ('"+data.getRut()+"', '2', '"+data.getInstitucion_media()+"', "
					+ "'', '"+data.getAno_media()+"', '"+data.getAno_media()+"', "
					+ "'')";
			ps4 = db.conn.prepareStatement(sql4);
			ps4.execute();

			if(data.getInstitucion_media1() != null){
				String sql9 = "";
				PreparedStatement ps9 = null;
				sql9 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '2', '"+data.getInstitucion_media1()+"', "
						+ "'', '"+data.getAno_media1()+"', '"+data.getAno_media1()+"', "
						+ "'')";
				ps9 = db.conn.prepareStatement(sql9);
				ps9.execute();
			}
			if(data.getInstitucion_media2() != null){
				String sql11 = "";
				PreparedStatement ps11 = null;
				sql11 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '2', '"+data.getInstitucion_media2()+"', "
						+ "'', '"+data.getAno_media2()+"', '"+data.getAno_media2()+"', "
						+ "'')";
				ps11 = db.conn.prepareStatement(sql11);
				ps11.execute();
			}
			
//			******************************* UNIVERSIDAD ************************
			sql6 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
					+ " values ('"+data.getRut()+"', '3', '"+data.getUniversidad()+"', "
					+ "'"+data.getCarrera()+"', '"+data.getAno_universidad()+"', '"+data.getAno_universidad()+"', "
					+ "'')";
			ps6 = db.conn.prepareStatement(sql6);
			ps6.execute();
			
			if(data.getUniversidad1() != null){
				String sql12 = "";
				PreparedStatement ps12 = null;
				sql12 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '3', '"+data.getUniversidad1()+"', "
						+ "'"+data.getCarrera1()+"', '"+data.getAno_universidad1()+"', '"+data.getAno_universidad1()+"', "
						+ "'')";
				ps12 = db.conn.prepareStatement(sql12);
				ps12.execute();
			}
			
//			******************************* POSTGRADO ************************
			sql7 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
					+ " values ('"+data.getRut()+"', '4', '"+data.getUniversidad_postgrado()+"', "
					+ "'"+data.getPrograma_postgrado()+"', '"+data.getAno_postgrado()+"', '"+data.getAno_postgrado()+"', "
					+ "'')";
			ps7 = db.conn.prepareStatement(sql7);
			ps7.execute();
			
			if(data.getAno_postgrado1() != null){
				String sql13 = "";
				PreparedStatement ps13 = null;
				sql13 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '4', '"+data.getUniversidad_postgrado1()+"', "
						+ "'"+data.getPrograma_postgrado1()+"', '"+data.getAno_postgrado1()+"', '"+data.getAno_postgrado1()+"', "
						+ "'')";
				ps13 = db.conn.prepareStatement(sql13);
				ps13.execute();
			}
			
//			******************************* CURSO ************************		
			sql8 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
					+ " values ('"+data.getRut()+"', '5', '"+data.getUniversidad_curso()+"', "
					+ "'"+data.getNombre_curso()+"', '"+data.getAno_curso()+"', '"+data.getAno_curso()+"', "
					+ "'"+data.getHoras_curso()+"')";
			ps8 = db.conn.prepareStatement(sql8);
			ps8.execute();
			
			if(data.getUniversidad_curso1() != null){
				String sql14 = "";
				PreparedStatement ps14 = null;
				sql14 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '5', '"+data.getUniversidad_curso1()+"', "
						+ "'"+data.getNombre_curso1()+"', '"+data.getAno_curso1()+"', '"+data.getAno_curso1()+"', "
						+ "'"+data.getHoras_curso1()+"')";
				ps14 = db.conn.prepareStatement(sql14);
				ps14.execute();
			}
			
//			******************************* ANTECEDENTES ************************	
			sql3 = "INSERT into antecedentes (rut_usuario_ante, cargo, institucion, anos, descripcion) values "
					+ "('"+data.getRut()+"', '"+data.getCargo()+"', '"+data.getInstitucion()+"', '"+data.getAnos()+"', "
					+ "'"+data.getDescripcion()+"')";
			ps3 = db.conn.prepareStatement(sql3);
			ps3.execute();
			
//			***********************************************************************
			
			sql19 = "update titulo.login set estado_curriculum = 1 where usuario = '"+data.getRut()+"'";
			ps19 = db.conn.prepareStatement(sql19);
			ps19.execute();
		
			
			return true;
		}
		catch(SQLException e){
			System.out.println("Error: "+e.getMessage());
		}
		catch(Exception e){
			System.out.println("Error: "+ e.getMessage());
		}
		finally{
			ps.close();
			ps2.close();
			ps3.close();
			ps4.close();
			ps6.close();
			ps7.close();
			ps8.close();

			db.close();
		}
		return false;
	}
	public static ArrayList<curriculum> getCurriculumxRut(String rut) throws Exception{
		PreparedStatement ps = null;

		String sql = "";

		ArrayList<curriculum> lista = new ArrayList<curriculum>();
		ArrayList<antecedentes> lista2 = new ArrayList<antecedentes>();
		ArrayList<educacion> lista3 = new ArrayList<educacion>();
		ArrayList<universidades> lista4 = new ArrayList<universidades>();
		ArrayList<carreras> lista5 = new ArrayList<carreras>();
		ArrayList<relacion> lista6 = new ArrayList<relacion>();
		ArrayList<loginApp> lista7 = new ArrayList<loginApp>();
		ConnectionDB db = new ConnectionDB();
		try {
			sql = "select * from titulo.curriculum\r\n" + 
					"left join titulo.educacion \r\n" + 
					"on titulo.curriculum.rut = titulo.educacion.rut_usuario\r\n" + 
					"left join titulo.universidades\r\n" + 
					"on titulo.educacion.nombre_edu = titulo.universidades.id_universidad\r\n" + 
					"left join titulo.carreras\r\n" + 
					"on titulo.educacion.carrera_edu = titulo.carreras.id_carrera\r\n" + 
					"left join titulo.login\r\n" + 
					"on titulo.login.usuario = titulo.curriculum.rut\r\n" + 
					"left join titulo.relacion\r\n" + 
					"on titulo.relacion.postulante = titulo.login.id\r\n" + 
					"where nivel_edu = 3 and titulo.login.usuario = '"+rut+"'\r\n" + 
					"order by evaluacion desc";
			
			ps = db.conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				curriculum pm = new curriculum();
				pm.setRut(rs.getString("rut"));
				pm.setNombre(rs.getString("nombre"));
				pm.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
				pm.setPais(rs.getString("pais"));
				pm.setEstado_civil(rs.getString("estado_civil"));
				pm.setDireccion(rs.getString("direccion"));
				pm.setTelefono(rs.getString("telefono"));
				pm.setCorreo(rs.getString("correo"));
				pm.setFecha_edit(rs.getString("fecha_edit"));
				pm.setRegion(rs.getString("region"));
				pm.setComuna(rs.getString("comuna"));
				pm.setNombre_recomendacion(rs.getString("nombre_recomendacion"));
				pm.setEmpresa_recomendacion(rs.getString("empresa_recomendacion"));
				pm.setTelefono_recomendacion(rs.getString("telefono_recomendacion"));
				pm.setMail_recomendacion(rs.getString("mail_recomendacion"));
				pm.setDisponibilidad(rs.getString("disponibilidad"));
				pm.setEvaluacion(rs.getInt("evaluacion"));
				

//				antecedentes pm2 = new antecedentes();
//				pm2.setCargo(rs.getString("cargo"));
//				pm2.setInstitucion(rs.getString("institucion"));
//				pm2.setAnos(rs.getString("anos"));
//				pm2.setDescripcion(rs.getString("descripcion"));
//				lista2.add(pm2);
//				pm.setAntecedentes(lista2);
			

				educacion pm3 = new educacion();
				pm3.setID_edu(rs.getInt("ID_edu"));
				pm3.setNivel_edu(rs.getInt("nivel_edu"));
				pm3.setNombre_edu(rs.getString("nombre_edu"));
				pm3.setCarrera_edu(rs.getString("carrera_edu"));
				pm3.setFecha_ini(rs.getString("fecha_ini"));
				pm3.setFecha_final(rs.getString("fecha_final"));
				pm3.setHoras_edu(rs.getString("horas_edu"));
				lista3.add(pm3);
				pm.setEducacion(lista3);
				
				universidades pm4 = new universidades();
				pm4.setId_universidad(rs.getInt("id_universidad"));
				pm4.setUniversidad(rs.getString("universidad"));
				lista4.add(pm4);
				pm.setUniversidades(lista4);
			
				
				carreras pm5 = new carreras();
				pm5.setId_carrera(rs.getInt("id_carrera"));
				pm5.setCarrera(rs.getString("carrera"));
				lista5.add(pm5);
				pm.setCarreras(lista5);
				
				
				relacion pm6 = new relacion();
				pm6.setEmpresa(rs.getString("empresa"));
				pm6.setPostulante(rs.getInt("postulante"));
				pm6.setEstado(rs.getInt("estado_relacion"));
				lista6.add(pm6);
				pm.setRelacion(lista6);
				
				
				
				loginApp pm7 = new loginApp();
				pm7.setId(rs.getInt("id"));
				lista7.add(pm7);
				pm.setLoginApp(lista7);
				
				
				lista.add(pm);
			}
			
			
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			ps.close();
			db.close();
		}
		return lista;

	}
	public static ArrayList<educacion> getCurriculumxRutMedia(String rut) throws Exception{
		PreparedStatement ps = null;

		String sql = "";

		ArrayList<educacion> lista = new ArrayList<educacion>();

		ConnectionDB db = new ConnectionDB();
		try {
			sql = "select nombre_edu, fecha_ini, fecha_final from titulo.educacion where rut_usuario = '"+rut+"' and nivel_edu = 2";
			
			ps = db.conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				educacion pm = new educacion();
				pm.setNombre_edu(rs.getString("nombre_edu"));
				pm.setFecha_ini(rs.getString("fecha_ini"));
				pm.setFecha_final(rs.getString("fecha_final"));
							
				lista.add(pm);
			}
			
			
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			ps.close();
			db.close();
		}
		return lista;

	}
	public static ArrayList<educacion> getCurriculumxRutBasica(String rut) throws Exception{
		PreparedStatement ps = null;

		String sql = "";

		ArrayList<educacion> lista = new ArrayList<educacion>();

		ConnectionDB db = new ConnectionDB();
		try {
			sql = "select nombre_edu, fecha_ini, fecha_final from titulo.educacion where rut_usuario = '"+rut+"' and nivel_edu = 1";
			
			ps = db.conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				educacion pm = new educacion();
				pm.setNombre_edu(rs.getString("nombre_edu"));
				pm.setFecha_ini(rs.getString("fecha_ini"));
				pm.setFecha_final(rs.getString("fecha_final"));
							
				lista.add(pm);
			}
			
			
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			ps.close();
			db.close();
		}
		return lista;

	}
	public static ArrayList<educacion> getCurriculumxRutUniversitaria(String rut) throws Exception{
		PreparedStatement ps = null;

		String sql = "";

		ArrayList<educacion> lista = new ArrayList<educacion>();

		ConnectionDB db = new ConnectionDB();
		try {
			sql = "select nombre_edu, fecha_ini, fecha_final, carrera_edu, universidad, carrera\r\n" + 
					"from titulo.educacion \r\n" + 
					"left join titulo.universidades\r\n" + 
					"on nombre_edu = id_universidad\r\n" + 
					"left join titulo.carreras\r\n" + 
					"on carrera_edu = id_carrera\r\n" + 
					"where rut_usuario = '"+rut+"' and nivel_edu = 3";
			
			ps = db.conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				educacion pm = new educacion();
				pm.setNombre_edu(rs.getString("nombre_edu"));
				pm.setFecha_ini(rs.getString("fecha_ini"));
				pm.setFecha_final(rs.getString("fecha_final"));
				pm.setCarrera_edu(rs.getString("carrera_edu"));
				pm.setUniversidad(rs.getString("universidad"));
				pm.setCarrera(rs.getString("carrera"));
							
				lista.add(pm);
			}
			
			
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			ps.close();
			db.close();
		}
		return lista;

	}
	public static ArrayList<educacion> getCurriculumxRutPostgrado(String rut) throws Exception{
		PreparedStatement ps = null;

		String sql = "";

		ArrayList<educacion> lista = new ArrayList<educacion>();

		ConnectionDB db = new ConnectionDB();
		try {
			sql = "select nombre_edu, fecha_ini, fecha_final, carrera_edu, universidad \r\n" + 
					"from titulo.educacion \r\n" + 
					"left join titulo.universidades\r\n" + 
					"on nombre_edu = id_universidad\r\n" + 
					"where rut_usuario = '"+rut+"' and nivel_edu = 4";
			
			ps = db.conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				educacion pm = new educacion();
				pm.setNombre_edu(rs.getString("nombre_edu"));
				pm.setFecha_ini(rs.getString("fecha_ini"));
				pm.setFecha_final(rs.getString("fecha_final"));
				pm.setCarrera_edu(rs.getString("carrera_edu"));
				pm.setUniversidad(rs.getString("universidad"));
							
				lista.add(pm);
			}
			
			
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			ps.close();
			db.close();
		}
		return lista;

	}
	public static ArrayList<educacion> getCurriculumxRutCursos(String rut) throws Exception{
		PreparedStatement ps = null;

		String sql = "";

		ArrayList<educacion> lista = new ArrayList<educacion>();

		ConnectionDB db = new ConnectionDB();
		try {
			sql = "select nombre_edu, carrera_edu, horas_edu, universidad\r\n" + 
					"from titulo.educacion \r\n" + 
					"left join titulo.universidades\r\n" + 
					"on nombre_edu = id_universidad\r\n" + 
					"where rut_usuario = '"+rut+"' and nivel_edu = 5";
			
			ps = db.conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				educacion pm = new educacion();
				pm.setNombre_edu(rs.getString("nombre_edu"));
				pm.setCarrera_edu(rs.getString("carrera_edu"));
				pm.setHoras_edu(rs.getString("horas_edu"));
				pm.setUniversidad(rs.getString("universidad"));
							
				lista.add(pm);
			}
			
			
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			ps.close();
			db.close();
		}
		return lista;

	}
	public static ArrayList<antecedentes> getCurriculumxRutAntecedentes(String rut) throws Exception{
		PreparedStatement ps = null;

		String sql = "";

		ArrayList<antecedentes> lista = new ArrayList<antecedentes>();

		ConnectionDB db = new ConnectionDB();
		try {
			sql = "select cargo, institucion, anos, descripcion from titulo.antecedentes where rut_usuario_ante = '"+rut+"'";
			
			ps = db.conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				antecedentes pm = new antecedentes();
				pm.setCargo(rs.getString("cargo"));
				pm.setInstitucion(rs.getString("institucion"));
				pm.setAnos(rs.getString("anos"));
				pm.setDescripcion(rs.getString("descripcion"));
							
				lista.add(pm);
			}
			
			
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			ps.close();
			db.close();
		}
		return lista;

	}
	public static ArrayList<curriculum> getCurriculumxUniversidad(int cod_universidad) throws Exception{
		PreparedStatement ps = null;

		String sql = "";

		ArrayList<curriculum> lista = new ArrayList<curriculum>();
		ArrayList<antecedentes> lista2 = new ArrayList<antecedentes>();
		ArrayList<educacion> lista3 = new ArrayList<educacion>();
		ArrayList<universidades> lista4 = new ArrayList<universidades>();
		ArrayList<carreras> lista5 = new ArrayList<carreras>();
		ArrayList<relacion> lista6 = new ArrayList<relacion>();
		ArrayList<loginApp> lista7 = new ArrayList<loginApp>();
		ConnectionDB db = new ConnectionDB();
		try {
			sql = "select * from titulo.curriculum\r\n" + 
					"left join titulo.educacion\r\n" + 
					"on titulo.curriculum.rut = titulo.educacion.rut_usuario\r\n" + 
					"left join titulo.universidades\r\n" + 
					"on titulo.educacion.nombre_edu = titulo.universidades.id_universidad\r\n" + 
					"left join titulo.carreras\r\n" + 
					"on titulo.educacion.carrera_edu = titulo.carreras.id_carrera\r\n" +
					"left join titulo.login\r\n" + 
					"on titulo.login.usuario = titulo.curriculum.rut\r\n" + 
					"left join titulo.relacion\r\n" + 
					"on titulo.relacion.postulante = titulo.login.id\r\n" + 
					"where nivel_edu = 3 and titulo.universidades.id_universidad = "+cod_universidad+"\r\n" +
					"order by evaluacion desc";

			ps = db.conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				curriculum pm = new curriculum();
				pm.setRut(rs.getString("rut"));
				pm.setNombre(rs.getString("nombre"));
				pm.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
				pm.setPais(rs.getString("pais"));
				pm.setEstado_civil(rs.getString("estado_civil"));
				pm.setDireccion(rs.getString("direccion"));
				pm.setTelefono(rs.getString("telefono"));
				pm.setCorreo(rs.getString("correo"));
				pm.setFecha_edit(rs.getString("fecha_edit"));
				pm.setRegion(rs.getString("region"));
				pm.setComuna(rs.getString("comuna"));
				pm.setNombre_recomendacion(rs.getString("nombre_recomendacion"));
				pm.setEmpresa_recomendacion(rs.getString("empresa_recomendacion"));
				pm.setTelefono_recomendacion(rs.getString("telefono_recomendacion"));
				pm.setMail_recomendacion(rs.getString("mail_recomendacion"));
				pm.setDisponibilidad(rs.getString("disponibilidad"));
				pm.setEvaluacion(rs.getInt("evaluacion"));

//					antecedentes pm2 = new antecedentes();
//					pm2.setCargo(rs.getString("cargo"));
//					pm2.setInstitucion(rs.getString("institucion"));
//					pm2.setAnos(rs.getString("anos"));
//					pm2.setDescripcion(rs.getString("descripcion"));
//					lista2.add(pm2);
//					pm.setAntecedentes(lista2);
				

					educacion pm3 = new educacion();
					pm3.setID_edu(rs.getInt("ID_edu"));
					pm3.setNivel_edu(rs.getInt("nivel_edu"));
					pm3.setNombre_edu(rs.getString("nombre_edu"));
					pm3.setCarrera_edu(rs.getString("carrera_edu"));
					pm3.setFecha_ini(rs.getString("fecha_ini"));
					pm3.setFecha_final(rs.getString("fecha_final"));
					pm3.setHoras_edu(rs.getString("horas_edu"));
					lista3.add(pm3);
					pm.setEducacion(lista3);
					
					universidades pm4 = new universidades();
					pm4.setId_universidad(rs.getInt("id_universidad"));
					pm4.setUniversidad(rs.getString("universidad"));
					lista4.add(pm4);
					pm.setUniversidades(lista4);
				
					
					carreras pm5 = new carreras();
					pm5.setId_carrera(rs.getInt("id_carrera"));
					pm5.setCarrera(rs.getString("carrera"));
					lista5.add(pm5);
					pm.setCarreras(lista5);
					
					relacion pm6 = new relacion();
					pm6.setEmpresa(rs.getString("empresa"));
					pm6.setPostulante(rs.getInt("postulante"));
					pm6.setEstado(rs.getInt("estado_relacion"));
					lista6.add(pm6);
					pm.setRelacion(lista6);
					
					
					
					loginApp pm7 = new loginApp();
					pm7.setId(rs.getInt("id"));
					lista7.add(pm7);
					pm.setLoginApp(lista7);
				
				
				lista.add(pm);
			}
			
			
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			ps.close();
			db.close();
		}
		return lista;

	}
	public static ArrayList<curriculum> getCurriculumxCarrera(int cod_carrera) throws Exception{
		PreparedStatement ps = null;

		String sql = "";

		ArrayList<curriculum> lista = new ArrayList<curriculum>();
		ArrayList<antecedentes> lista2 = new ArrayList<antecedentes>();
		ArrayList<educacion> lista3 = new ArrayList<educacion>();
		ArrayList<universidades> lista4 = new ArrayList<universidades>();
		ArrayList<carreras> lista5 = new ArrayList<carreras>();
		ArrayList<relacion> lista6 = new ArrayList<relacion>();
		ArrayList<loginApp> lista7 = new ArrayList<loginApp>();
		ConnectionDB db = new ConnectionDB();
		try {
			sql = "select * from titulo.curriculum\r\n" + 
					"left join titulo.educacion\r\n" + 
					"on titulo.curriculum.rut = titulo.educacion.rut_usuario\r\n" + 
					"left join titulo.universidades\r\n" + 
					"on titulo.educacion.nombre_edu = titulo.universidades.id_universidad\r\n" + 
					"left join titulo.carreras\r\n" + 
					"on titulo.educacion.carrera_edu = titulo.carreras.id_carrera\r\n" + 
					"left join titulo.login\r\n" + 
					"on titulo.login.usuario = titulo.curriculum.rut\r\n" + 
					"left join titulo.relacion\r\n" + 
					"on titulo.relacion.postulante = titulo.login.id\r\n" + 
					"where nivel_edu = 3 and titulo.carreras.id_carrera = "+cod_carrera+"\r\n" +
					"order by evaluacion desc";

			ps = db.conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				curriculum pm = new curriculum();
				pm.setRut(rs.getString("rut"));
				pm.setNombre(rs.getString("nombre"));
				pm.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
				pm.setPais(rs.getString("pais"));
				pm.setEstado_civil(rs.getString("estado_civil"));
				pm.setDireccion(rs.getString("direccion"));
				pm.setTelefono(rs.getString("telefono"));
				pm.setCorreo(rs.getString("correo"));
				pm.setFecha_edit(rs.getString("fecha_edit"));
				pm.setRegion(rs.getString("region"));
				pm.setComuna(rs.getString("comuna"));
				pm.setNombre_recomendacion(rs.getString("nombre_recomendacion"));
				pm.setEmpresa_recomendacion(rs.getString("empresa_recomendacion"));
				pm.setTelefono_recomendacion(rs.getString("telefono_recomendacion"));
				pm.setMail_recomendacion(rs.getString("mail_recomendacion"));
				pm.setDisponibilidad(rs.getString("disponibilidad"));
				pm.setEvaluacion(rs.getInt("evaluacion"));

//					antecedentes pm2 = new antecedentes();
//					pm2.setCargo(rs.getString("cargo"));
//					pm2.setInstitucion(rs.getString("institucion"));
//					pm2.setAnos(rs.getString("anos"));
//					pm2.setDescripcion(rs.getString("descripcion"));
//					lista2.add(pm2);
//					pm.setAntecedentes(lista2);
				

					educacion pm3 = new educacion();
					pm3.setID_edu(rs.getInt("ID_edu"));
					pm3.setNivel_edu(rs.getInt("nivel_edu"));
					pm3.setNombre_edu(rs.getString("nombre_edu"));
					pm3.setCarrera_edu(rs.getString("carrera_edu"));
					pm3.setFecha_ini(rs.getString("fecha_ini"));
					pm3.setFecha_final(rs.getString("fecha_final"));
					pm3.setHoras_edu(rs.getString("horas_edu"));
					lista3.add(pm3);
					pm.setEducacion(lista3);
					
					universidades pm4 = new universidades();
					pm4.setId_universidad(rs.getInt("id_universidad"));
					pm4.setUniversidad(rs.getString("universidad"));
					lista4.add(pm4);
					pm.setUniversidades(lista4);
				
					
					carreras pm5 = new carreras();
					pm5.setId_carrera(rs.getInt("id_carrera"));
					pm5.setCarrera(rs.getString("carrera"));
					lista5.add(pm5);
					pm.setCarreras(lista5);
					
					relacion pm6 = new relacion();
					pm6.setEmpresa(rs.getString("empresa"));
					pm6.setPostulante(rs.getInt("postulante"));
					pm6.setEstado(rs.getInt("estado_relacion"));
					lista6.add(pm6);
					pm.setRelacion(lista6);
					
					
					
					loginApp pm7 = new loginApp();
					pm7.setId(rs.getInt("id"));
					lista7.add(pm7);
					pm.setLoginApp(lista7);
				
				
				lista.add(pm);
			}
			
			
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			ps.close();
			db.close();
		}
		return lista;

	}
	public static ArrayList<curriculum> getAllCurriculum() throws Exception{
		PreparedStatement ps = null;

		String sql = "";

		ArrayList<curriculum> lista = new ArrayList<curriculum>();
		ArrayList<antecedentes> lista2 = new ArrayList<antecedentes>();
		ArrayList<educacion> lista3 = new ArrayList<educacion>();
		ArrayList<universidades> lista4 = new ArrayList<universidades>();
		ArrayList<carreras> lista5 = new ArrayList<carreras>();
		ArrayList<relacion> lista6 = new ArrayList<relacion>();
		ArrayList<loginApp> lista7 = new ArrayList<loginApp>();
		ConnectionDB db = new ConnectionDB();
		try {
			sql = "select * from titulo.curriculum\r\n" + 
					"left join titulo.educacion\r\n" + 
					"on titulo.curriculum.rut = titulo.educacion.rut_usuario\r\n" + 
					"left join titulo.universidades\r\n" + 
					"on titulo.educacion.nombre_edu = titulo.universidades.id_universidad\r\n" + 
					"left join titulo.carreras\r\n" + 
					"on titulo.educacion.carrera_edu = titulo.carreras.id_carrera\r\n" +
					"left join titulo.login\r\n" + 
					"on titulo.login.usuario = titulo.curriculum.rut\r\n" + 
					"left join titulo.relacion\r\n" + 
					"on titulo.relacion.postulante = titulo.login.id\r\n" +
					"where nivel_edu = 3\r\n" +
					"order by evaluacion desc";
			ps = db.conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				curriculum pm = new curriculum();
				pm.setID_curriculum(rs.getInt("ID_curriculum"));
				pm.setRut(rs.getString("rut"));
				pm.setNombre(rs.getString("nombre"));
				pm.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
				pm.setPais(rs.getString("pais"));
				pm.setEstado_civil(rs.getString("estado_civil"));
				pm.setDireccion(rs.getString("direccion"));
				pm.setTelefono(rs.getString("telefono"));
				pm.setCorreo(rs.getString("correo"));
				pm.setFecha_edit(rs.getString("fecha_edit"));
				pm.setRegion(rs.getString("region"));
				pm.setComuna(rs.getString("comuna"));
				pm.setNombre_recomendacion(rs.getString("nombre_recomendacion"));
				pm.setEmpresa_recomendacion(rs.getString("empresa_recomendacion"));
				pm.setTelefono_recomendacion(rs.getString("telefono_recomendacion"));
				pm.setMail_recomendacion(rs.getString("mail_recomendacion"));
				pm.setDisponibilidad(rs.getString("disponibilidad"));
				pm.setEvaluacion(rs.getInt("evaluacion"));

//				antecedentes pm2 = new antecedentes();
//				pm2.setCargo(rs.getString("cargo"));
//				pm2.setInstitucion(rs.getString("institucion"));
//				pm2.setAnos(rs.getString("anos"));
//				pm2.setDescripcion(rs.getString("descripcion"));
//				lista2.add(pm2);
//				pm.setAntecedentes(lista2);
			

				educacion pm3 = new educacion();
				pm3.setID_edu(rs.getInt("ID_edu"));
				pm3.setNivel_edu(rs.getInt("nivel_edu"));
				pm3.setNombre_edu(rs.getString("nombre_edu"));
				pm3.setCarrera_edu(rs.getString("carrera_edu"));
				pm3.setFecha_ini(rs.getString("fecha_ini"));
				pm3.setFecha_final(rs.getString("fecha_final"));
				pm3.setHoras_edu(rs.getString("horas_edu"));
				lista3.add(pm3);
				pm.setEducacion(lista3);
			
			

				universidades pm4 = new universidades();
				pm4.setId_universidad(rs.getInt("id_universidad"));
				pm4.setUniversidad(rs.getString("universidad"));
				lista4.add(pm4);
				pm.setUniversidades(lista4);
			
		

				carreras pm5 = new carreras();
				pm5.setId_carrera(rs.getInt("id_carrera"));
				pm5.setCarrera(rs.getString("carrera"));
				lista5.add(pm5);
				pm.setCarreras(lista5);
				
				
				relacion pm6 = new relacion();
				pm6.setEmpresa(rs.getString("empresa"));
				pm6.setPostulante(rs.getInt("postulante"));
				pm6.setEstado(rs.getInt("estado_relacion"));
				lista6.add(pm6);
				pm.setRelacion(lista6);
				
				
				
				loginApp pm7 = new loginApp();
				pm7.setId(rs.getInt("id"));
				lista7.add(pm7);
				pm.setLoginApp(lista7);
				
				
				lista.add(pm);
				
			}
			
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			ps.close();
			db.close();
		}
		return lista;

	}
	@SuppressWarnings("finally")
	public static ArrayList<relacion> getRelacion(int postulante) throws Exception {
		PreparedStatement ps = null;
		String sql = "";
		ArrayList<relacion> data = new ArrayList<relacion>();
		ConnectionDB db = new ConnectionDB();
		try{
			sql = "select * from relacion where postulante = "+postulante+" and estado_relacion = 1";
			
			ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				relacion c = new relacion();
				c.setId_relacion(rs.getInt("id_relacion"));
				c.setEmpresa(rs.getString("empresa"));
				c.setPostulante(rs.getInt("postulante"));

				data.add(c);
			}
			rs.close();
			ps.close();
			db.conn.close();
		}catch(Exception ex){
			System.out.println("Error getclase:"+ex.getMessage());
		}
		finally{
			ps.close();
			db.close();

		return data;
		}
	}
	public static boolean updateEvaluacion (curriculum data) throws Exception{
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		PreparedStatement ps = null;
		String sql = "";
		ConnectionDB db = new  ConnectionDB();
		try {			
			sql = "UPDATE titulo.curriculum set evaluacion = "+data.evaluacion+" where rut='"+data.rut+"'";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}finally {
			ps.close();
			db.close();
		}
		return false;
	}
	public static boolean updateNombre (curriculum data) throws Exception{
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		PreparedStatement ps = null;
		String sql = "";
		ConnectionDB db = new  ConnectionDB();
		try {			
			sql = "UPDATE titulo.curriculum set nombre = '"+data.nombre+"', fecha_edit = '"+dateFormat.format(date)+"' where rut='"+data.rut+"'";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}finally {
			ps.close();
			db.close();
		}
		return false;
	}
	public static boolean updateFecha (curriculum data) throws Exception{
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		PreparedStatement ps = null;
		String sql = "";
		ConnectionDB db = new  ConnectionDB();
		try {			
			sql = " UPDATE curriculum set fecha = '"+data.fecha_nacimiento+"', fecha_edit = '"+dateFormat.format(date)+"' where rut='"+data.rut+"'";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}finally {
			ps.close();
			db.close();
		}
		return false;
	}
	public static boolean updateEstado (curriculum data) throws Exception{
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		PreparedStatement ps = null;
		String sql = "";
		ConnectionDB db = new  ConnectionDB();
		try {			
			sql = " UPDATE curriculum set estado_civil = '"+data.estado_civil+"', fecha_edit = '"+dateFormat.format(date)+"' where rut='"+data.rut+"'";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}finally {
			ps.close();
			db.close();
		}
		return false;
	}
	
public static boolean updateEstadoLogin (loginApp data) throws Exception{
		
		PreparedStatement ps = null;
		String sql = "";
		ConnectionDB db = new  ConnectionDB();
		try {			
			sql = " UPDATE login set estado = '"+data.estado+"' where ID = '"+data.id+"'";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}finally {
			ps.close();
			db.close();
		}
		return false;
	}

	public static boolean updatePais (curriculum data) throws Exception{
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		PreparedStatement ps = null;
		String sql = "";
		ConnectionDB db = new  ConnectionDB();
		try {			
			sql = " UPDATE curriculum set pais = '"+data.pais+"', fecha_edit = '"+dateFormat.format(date)+"' where rut='"+data.rut+"'";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}finally {
			ps.close();
			db.close();
		}
		return false;
	}
	public static boolean updateDireccion (curriculum data) throws Exception{
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		PreparedStatement ps = null;
		String sql = "";
		ConnectionDB db = new  ConnectionDB();
		try {			
			sql = " UPDATE curriculum set direccion = '"+data.direccion+"', fecha_edit = '"+dateFormat.format(date)+"' where rut='"+data.rut+"'";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}finally {
			ps.close();
			db.close();
		}
		return false;
	}
	public static boolean updateTelefono (curriculum data) throws Exception{
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		PreparedStatement ps = null;
		String sql = "";
		ConnectionDB db = new  ConnectionDB();
		try {			
			sql = " UPDATE curriculum set telefono = '"+data.telefono+"', fecha_edit = '"+dateFormat.format(date)+"' where rut='"+data.rut+"'";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}finally {
			ps.close();
			db.close();
		}
		return false;
	}
	public static boolean updateCorreo (curriculum data) throws Exception{
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		PreparedStatement ps = null;
		String sql = "";
		ConnectionDB db = new  ConnectionDB();
		try {			
			sql = " UPDATE curriculum set correo = '"+data.correo+"', fecha_edit = '"+dateFormat.format(date)+"' where rut='"+data.rut+"'";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}finally {
			ps.close();
			db.close();
		}
		return false;
	}
	public static boolean updateNombre_edu (educacion data) throws Exception{
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		String sql = "";
		String sql2 = "";
		ConnectionDB db = new  ConnectionDB();
		try {			
			sql = " UPDATE educacion set nombre_edu = '"+data.nombre_edu+"' where rut_usuario='"+data.rut_usuario+"' "
					+ "and ID_edu = "+data.ID_edu+"";
			sql2 = "UPDATE curriculum set fecha_edit = '"+dateFormat.format(date)+"' where  rut = '"+data.rut_usuario+"'";
			ps2 = db.conn.prepareStatement(sql2);
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			ps2.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}finally {
			ps.close();
			ps2.close();
			db.close();
		}
		return false;
	}
public static boolean updatePass (loginApp data) throws Exception{
		
		PreparedStatement ps = null;
		String sql = "";
		ConnectionDB db = new  ConnectionDB();
		try {			
			sql = " UPDATE login set pass = '"+data.pass+"', ingresado = 1 where usuario='"+data.usuario+"'";
			ps = db.conn.prepareStatement(sql);
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}finally {
			ps.close();
			db.close();
		}
		return false;
	}
}

