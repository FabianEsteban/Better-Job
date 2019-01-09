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
import lib.classTI.curriculum;
import lib.classTI.educacion;
import lib.classTI.insertCurriculum;
import lib.classTI.loginApp;

public class HelloDB {
	
	@SuppressWarnings("finally")
	public static ArrayList<loginApp> getVariable() throws Exception {
		PreparedStatement ps = null;
		String sql = "";
		ArrayList<loginApp> data = new ArrayList<loginApp>();
		ConnectionDB db = new ConnectionDB();
		try{
			sql = "select usuario from login";
			
			ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				loginApp c = new loginApp();
				c.setUsuario(rs.getString("usuario"));
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
				us.setUsuario(rs.getString("usuario"));
				us.setPerfilText(rs.getString("perfilText"));
				us.setEstado(rs.getInt("estado"));
				us.setEstado_curriculum(rs.getInt("estado_curriculum"));
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
			sql = "INSERT into login (usuario, correo, pass, perfilText, estado, estado_curriculum) values ('"+data.getUsuario()+"', '"+data.getCorreo()+"', '"+data.getPass()+"', 'postulante', 1, 0)";
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
		String sql = "";
		String sql2 = "";
		String sql3 = "";
		String sql4 = "";
		String sql6 = "";
		String sql7 = "";
		String sql8 = "";
		ConnectionDB db = new ConnectionDB();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		try{
			sql = "INSERT into curriculum (rut, nombre, fecha_nacimiento, pais, estado_civil, direccion, region, comuna,"
					+ " telefono, correo, disponibilidad, nombre_recomendacion, empresa_recomendacion, telefono_recomendacion,"
					+ " mail_recomendacion, fecha_edit) values ('"+data.getRut()+"', '"+data.getNombre()+"',"
					+ " '"+data.getFecha_nacimiento()+"', '"+data.getPais()+"', '"+data.getEstado_civil()+"',"
					+ " '"+data.getDireccion()+"', '"+data.getRegion()+"', '"+data.getComuna()+"', '"+data.getTelefono()+"',"
					+ " '"+data.getCorreo()+"', '"+data.getDisponibilidad()+"', '"+data.getNombre_recomendacion()+"',"
					+ " '"+data.getEmpresa_recomendacion()+"', '"+data.getTelefono_recomendacion()+"',"
					+ " '"+data.getMail_recomendacion()+"', '"+dateFormat.format(date)+"')";
			sql2 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
					+ " values ('"+data.getRut()+"', '1', '"+data.getInstitucion_basica()+"', "
					+ "'', '"+data.getAno_basica()+"', '"+data.getAno_basica()+"', "
					+ "'')";
			ps2 = db.conn.prepareStatement(sql2);
			ps2.execute();
			if(data.getInstitucion_basica1() != ""){
				String sql5 = "";
				PreparedStatement ps5 = null;
				sql5 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '1', '"+data.getInstitucion_basica1()+"', "
						+ "'', '"+data.getAno_basica1()+"', '"+data.getAno_basica1()+"', "
						+ "'')";
				ps5 = db.conn.prepareStatement(sql5);
				ps5.execute();
			}
			if(data.getInstitucion_basica2() != ""){
				String sql10 = "";
				PreparedStatement ps10 = null;
				sql10 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '1', '"+data.getInstitucion_basica2()+"', "
						+ "'', '"+data.getAno_basica2()+"', '"+data.getAno_basica2()+"', "
						+ "'')";
				ps10 = db.conn.prepareStatement(sql10);
				ps10.execute();
			}
			sql4 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
					+ " values ('"+data.getRut()+"', '2', '"+data.getInstitucion_media()+"', "
					+ "'', '"+data.getAno_media()+"', '"+data.getAno_media()+"', "
					+ "'')";
			if(data.getInstitucion_media1() != ""){
				String sql9 = "";
				PreparedStatement ps9 = null;
				sql9 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '2', '"+data.getInstitucion_media1()+"', "
						+ "'', '"+data.getAno_media1()+"', '"+data.getAno_media1()+"', "
						+ "'')";
				ps9 = db.conn.prepareStatement(sql9);
				ps9.execute();
			}
			if(data.getInstitucion_media2() != ""){
				String sql11 = "";
				PreparedStatement ps11 = null;
				sql11 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '2', '"+data.getInstitucion_media2()+"', "
						+ "'', '"+data.getAno_media2()+"', '"+data.getAno_media2()+"', "
						+ "'')";
				ps11 = db.conn.prepareStatement(sql11);
				ps11.execute();
			}
			sql6 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
					+ " values ('"+data.getRut()+"', '3', '"+data.getUniversidad()+"', "
					+ "'"+data.getCarrera()+"', '"+data.getAno_universidad()+"', '"+data.getAno_universidad()+"', "
					+ "'')";
			if(data.getUniversidad1() != ""){
				String sql12 = "";
				PreparedStatement ps12 = null;
				sql12 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '3', '"+data.getUniversidad1()+"', "
						+ "'"+data.getCarrera1()+"', '"+data.getAno_universidad1()+"', '"+data.getAno_universidad1()+"', "
						+ "'')";
				ps12 = db.conn.prepareStatement(sql12);
				ps12.execute();
			}
			sql7 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
					+ " values ('"+data.getRut()+"', '4', '"+data.getUniversidad_postgrado()+"', "
					+ "'"+data.getPrograma_postgrado()+"', '"+data.getAno_postgrado()+"', '"+data.getAno_postgrado()+"', "
					+ "'')";
			if(data.getAno_postgrado1() != ""){
				String sql13 = "";
				PreparedStatement ps13 = null;
				sql13 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '4', '"+data.getUniversidad_postgrado1()+"', "
						+ "'"+data.getPrograma_postgrado1()+"', '"+data.getAno_postgrado1()+"', '"+data.getAno_postgrado1()+"', "
						+ "'')";
				ps13 = db.conn.prepareStatement(sql13);
				ps13.execute();
			}
			sql8 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
					+ " values ('"+data.getRut()+"', '5', '"+data.getUniversidad_curso()+"', "
					+ "'"+data.getNombre_curso()+"', '"+data.getAno_curso()+"', '"+data.getAno_curso()+"', "
					+ "'"+data.getHoras_curso()+"')";
			if(data.getUniversidad_curso1() != ""){
				String sql14 = "";
				PreparedStatement ps14 = null;
				sql14 = "INSERT into educacion (rut_usuario, nivel_edu, nombre_edu, carrera_edu, fecha_ini, fecha_final, horas_edu)"
						+ " values ('"+data.getRut()+"', '5', '"+data.getUniversidad_curso1()+"', "
						+ "'"+data.getNombre_curso1()+"', '"+data.getAno_curso1()+"', '"+data.getAno_curso1()+"', "
						+ "'"+data.getHoras_curso1()+"')";
				ps14 = db.conn.prepareStatement(sql14);
				ps14.execute();
			}
			sql3 = "INSERT into antecedentes (rut_usuario_ante, cargo, institucion, anos, descripcion) values "
					+ "('"+data.getRut()+"', '"+data.getCargo()+"', '"+data.getInstitucion()+"', '"+data.getAnos()+"', "
					+ "'"+data.getDescripcion()+"')";
			sql4 = "update titulo.login set estado_curriculum = 1 where usuario = '"+data.getRut()+"'";
			ps = db.conn.prepareStatement(sql);
			
			ps3 = db.conn.prepareStatement(sql3);
			ps4 = db.conn.prepareStatement(sql4);
			ps6 = db.conn.prepareStatement(sql6);
			ps7 = db.conn.prepareStatement(sql7);
			ps8 = db.conn.prepareStatement(sql8);
			ps.execute();
			
			ps3.execute();
			ps4.execute();
			ps6.execute();
			ps7.execute();
			ps8.execute();
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
	public static ArrayList<curriculum> getCurriculum(String rut) throws Exception{
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		PreparedStatement ps3 = null;
		String sql = "";
		String sql2 = "";
		String sql3 = "";
		ArrayList<curriculum> lista = new ArrayList<curriculum>();
		ArrayList<antecedentes> lista2 = new ArrayList<antecedentes>();
		ArrayList<educacion> lista3 = new ArrayList<educacion>();
		ConnectionDB db = new ConnectionDB();
		try {
			sql = "SELECT * from curriculum where rut = '"+rut+"'";
			sql2 = "SELECT * from titulo.antecedentes where rut_usuario_ante = '"+rut+"'";
			sql3 = "SELECT * from titulo.educacion where rut_usuario = '"+rut+"'";
			ps = db.conn.prepareStatement(sql);
			ps2 = db.conn.prepareStatement(sql2);
			ps3 = db.conn.prepareStatement(sql3);
			ResultSet rs = ps.executeQuery();
			ResultSet rs2 = ps2.executeQuery();
			ResultSet rs3 = ps3.executeQuery();
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
				while (rs2.next()) {
					antecedentes pm2 = new antecedentes();
					pm2.setCargo(rs2.getString("cargo"));
					pm2.setInstitucion(rs2.getString("institucion"));
					pm2.setAnos(rs2.getString("anos"));
					pm2.setDescripcion(rs2.getString("descripcion"));
					lista2.add(pm2);
					pm.setAntecedentes(lista2);
				}
				while (rs3.next()) {
					educacion pm3 = new educacion();
					pm3.setID_edu(rs3.getInt("ID_edu"));
					pm3.setNivel_edu(rs3.getInt("nivel_edu"));
					pm3.setNombre_edu(rs3.getString("nombre_edu"));
					pm3.setCarrera_edu(rs3.getString("carrera_edu"));
					pm3.setFecha_ini(rs3.getString("fecha_ini"));
					pm3.setFecha_final(rs3.getString("fecha_final"));
					pm3.setHoras_edu(rs3.getString("horas_edu"));
					lista3.add(pm3);
					pm.setEducacion(lista3);
				}
				
				lista.add(pm);
			}
			
			
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			ps.close();
			ps2.close();
			ps3.close();
			db.close();
		}
		return lista;

	}
	public static ArrayList<curriculum> getAllCurriculum() throws Exception{
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		PreparedStatement ps3 = null;
		String sql = "";
		String sql2 = "";
		String sql3 = "";
		ArrayList<curriculum> lista = new ArrayList<curriculum>();
		ArrayList<antecedentes> lista2 = new ArrayList<antecedentes>();
		ArrayList<educacion> lista3 = new ArrayList<educacion>();
		ConnectionDB db = new ConnectionDB();
		try {
			sql = "SELECT * from curriculum";
			sql2 = "SELECT * from titulo.antecedentes";
			sql3 = "SELECT * from titulo.educacion";
			ps = db.conn.prepareStatement(sql);
			ps2 = db.conn.prepareStatement(sql2);
			ps3 = db.conn.prepareStatement(sql3);
			ResultSet rs = ps.executeQuery();
			ResultSet rs2 = ps2.executeQuery();
			ResultSet rs3 = ps3.executeQuery();
			while (rs.next()) {
				curriculum pm = new curriculum();
				pm.setID(rs.getInt("ID"));
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
				while (rs2.next()) {
					antecedentes pm2 = new antecedentes();
					pm2.setCargo(rs2.getString("cargo"));
					pm2.setInstitucion(rs2.getString("institucion"));
					pm2.setAnos(rs2.getString("anos"));
					pm2.setDescripcion(rs2.getString("descripcion"));
					lista2.add(pm2);
					pm.setAntecedentes(lista2);
				}
				while (rs3.next()) {
					educacion pm3 = new educacion();
					pm3.setID_edu(rs3.getInt("ID_edu"));
					pm3.setNivel_edu(rs3.getInt("nivel_edu"));
					pm3.setNombre_edu(rs3.getString("nombre_edu"));
					pm3.setCarrera_edu(rs3.getString("carrera_edu"));
					pm3.setFecha_ini(rs3.getString("fecha_ini"));
					pm3.setFecha_final(rs3.getString("fecha_final"));
					pm3.setHoras_edu(rs3.getString("horas_edu"));
					lista3.add(pm3);
					pm.setEducacion(lista3);
				}
				
				lista.add(pm);
			}
			
		} catch (SQLException e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			ps.close();
			ps2.close();
			ps3.close();
			db.close();
		}
		return lista;

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
	}public static boolean updateNombre_edu (educacion data) throws Exception{
		
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
}

