package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Registro {

	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.print("\nConectando a base de datos...");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Termibus", "root", "elorrieta");
		
		} catch(SQLException se) {
	        se.printStackTrace();
	    } catch(Exception e) {
	        e.printStackTrace();
	    
    }
}
