package lib.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lib.io.application;

public class ConnectionDB {
	public Connection conn = null;
	
	public ConnectionDB(){
		try{
			Class.forName(application.getProperty("driverDB"));
			conn = DriverManager.getConnection(application.getProperty("urlDB"), application.getProperty("userDB"),
					application.getProperty("passDB"));
		} catch(ClassNotFoundException e){
			System.out.println("Clase no encontrada: " + e.getMessage());
		} catch(SQLException e){
			System.out.println("Error Conexion: " + e.getMessage());
		}
	}
	public void close(){
		try{
			if(conn != null){
				conn.close();
			}
		} catch(SQLException e){
			System.out.println("Error cerrar conexion: " + e.getMessage());
		}
	}
}
