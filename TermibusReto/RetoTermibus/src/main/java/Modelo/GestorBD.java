package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonModel;

public class GestorBD {
	private Connection conexion;
	private Statement statement = null;
	private PreparedStatement preparedstatement = null;
	

	public GestorBD() {
		conexion = null;
	}
	public void conectar()throws Exception {
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

	
	public void insertarUsuario(String dni, String nombre, String apellidos, String fecha_nac, String sexo, char[] password) {
		try {
			statement = conexion.createStatement();
			
			preparedstatement = conexion
					.prepareStatement("insert into cliente(DNI, Nombre, Apellidos, Fecha_nac, Sexo, Contraseña) "
							+ "values(dni.getText(), nombre.getText(), apellidos.getText(), fecha_nac.getText(), "
							+ "sexo.getText(), password.getPassword()");
			
			//+  values(textFieldDNI.getText(), textFieldNombre.getText(), textFieldApellidos.getText(), 
			//	textFieldFecha_nac.getText(),buttongroup.getSelected(), passwordFieldCrearPass.getPassword());
		
					preparedstatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cerrarConexion() {
		try {
			
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


