package lib.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lib.io.application;

public class ConnectionDB {
	public Connection conn = null;
	
	public ConnectionDB(){
//		if (System.getProperty("RDS_HOSTNAME") != null) {
//			try{
//				Class.forName("com.mysql.jdbc.Driver");
//				String dbName = "betterjob";
//				String userName = "FabianEsteban";
//				String password = "97892312";
//				String hostname = "oregon-betterjob.cenkbvs0hxqx.us-west-2.rds.amazonaws.com";
//				String port = "3306";
//				String dbName = System.getProperty("RDS_DB_NAME");
//				String userName = System.getProperty("RDS_USERNAME");
//				String password = System.getProperty("RDS_PASSWORD");
//				String hostname = System.getProperty("RDS_HOSTNAME");
//				String port = System.getProperty("RDS_PORT");
//				String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
//				conn = DriverManager.getConnection(jdbcUrl);
//			} catch(ClassNotFoundException e){
//				System.out.println("Clase no encontrada: " + e.getMessage());
//			} catch(SQLException e){
//				System.out.println("Error Conexion: " + e.getMessage());
//			}
//		}
			
			
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
