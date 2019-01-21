package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorBD {
	private Connection conexion;
	private Statement statement = null;
	private PreparedStatement preparedstatement = null;
	private ResultSet resultSet = null;
	
	public GestorBD() {
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
		
		conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/termibus?serverTimezone=UTC", "root", "elorrieta");	
		if(conexion!=null) {
			statement = conexion.createStatement();
			System.out.println("Conexión establecida a la base de datos");
		}
		else 
			System.out.println("Conexión fallida");
			
		}
		catch(SQLException e) {e.printStackTrace();}
		catch(ClassNotFoundException e) {e.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
			
	}	
	
	public void insertarUsuario() {
		try {
			statement = conexion.createStatement();
			
			preparedstatement = conexion
					.prepareStatement("insert into cliente(DNI, Nombre, Apellidos, Fecha_nac, Sexo, Contraseña) values(\""")");
					
					preparedstatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cerrarConexion() {
		try {
			if(resultSet!=null) {
				resultSet.close();
			}
			if(statement!=null) {
				statement.close();
			}
			if(conexion!=null) {
				conexion.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
}


