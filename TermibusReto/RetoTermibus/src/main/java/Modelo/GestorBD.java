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
	private ResultSet result;
	

	public GestorBD() {
		conexion = null;
	}
	public void conectar()throws Exception {
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
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
			String sentencia="insert into cliente(DNI, Nombre, Apellidos, Fecha_nac, Sexo, Contraseña) "
					+ "values(\""+dni+"\", \""+nombre+"\", \""+apellidos+"\", \""+fecha_nac+"\", \""+sexo+"\", \""+password.toString()+"\")";
			System.out.println(sentencia);
			preparedstatement = conexion
					.prepareStatement(sentencia);
			
			//+  values(textFieldDNI.getText(), textFieldNombre.getText(), textFieldApellidos.getText(), 
			//	textFieldFecha_nac.getText(),buttongroup.getSelected(), passwordFieldCrearPass.getPassword());
		
					preparedstatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void cerrarConexion() {
		try {
			
			if(preparedstatement!=null) {
				preparedstatement.close();
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


