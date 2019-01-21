package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorBD {

	private Connection connect;

	
	public void gestorDB() {
		connect=null;
	}
	public void conectar() throws Exception {
	    try {
	        // This will load the MySQL driver, each DB has its own driver
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        
	        // Setup the connection with the DB
	        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/termibus?serverTimezone=UTC","root","elorrieta");
	        Statement sentencia = connect.createStatement();
	       
	    } catch (Exception e) {
	        
	    	e.printStackTrace();
	    } 
	
	}
	
	
}
