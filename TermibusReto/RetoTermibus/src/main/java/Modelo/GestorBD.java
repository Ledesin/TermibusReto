package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;


public class GestorBD {
	private Connection conexion;
	private Statement statement = null;
	private PreparedStatement preparedstatement = null;
	private ResultSet result;
	public Object dataSource;//ESTO LO HA PUESTO MARIA
	

	public GestorBD() {
		conexion = null;
		conectar();
	}
	
	public void conectar(){
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
			String passText=new String(password);
			
		try {
			statement = conexion.createStatement();
			String sentencia="insert into cliente(DNI, Nombre, Apellidos, Fecha_nac, Sexo, Contraseña) "
					+ "values(\""+dni+"\", \""+nombre+"\", \""+apellidos+"\", \""+fecha_nac+"\", \""+sexo+"\", \""+passText+"\")";
			System.out.println(sentencia);
			preparedstatement = conexion.prepareStatement(sentencia);
			
			//+  values(textFieldDNI.getText(), textFieldNombre.getText(), textFieldApellidos.getText(), 
			//	textFieldFecha_nac.getText(),buttongroup.getSelected(), passwordFieldCrearPass.getPassword());
		
					preparedstatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public JComboBox getLineasBD() {
		ResultSet rs = null;
		JComboBox cbox_lineas = null;
		try {
			statement = conexion.createStatement();
			String sentencia = "SELECT * FROM linea";
			System.out.println(sentencia);
			rs =  preparedstatement.executeQuery(sentencia);
			cbox_lineas.addItem("Seleccione una opción");
			while(rs.next()){
				cbox_lineas.addItem(rs.getString("Nombre"));  
			}
			return cbox_lineas;
		}catch(Exception e) {
			e.printStackTrace();
			return cbox_lineas;
		}
	}
	
	

	public boolean introducirLogin(String logindni, char[] pass) {
		String passText=new String(pass);
		String sentencia = "select * from cliente where DNI=\""+logindni+"\" and Contraseña=\""+passText+"\"";
		try {
			statement = conexion.createStatement();
			result = statement.executeQuery(sentencia);
			System.out.println(sentencia);
			return result.first();
		}catch(Exception error) {
		error.printStackTrace();
		}
		return false;
	}
	
	

	/*
	 * 
	 * public textPlazasDisponibles getPlazasLibresBD() {
		ResultSet rs = null;
		textPlazasDisponibles plazaslibres = null;
		try {
			statement = conexion.createStatement();
			String sentencia = "SELECT * FROM N_plazas";
			System.out.println(sentencia);
			rs =  preparedstatement.executeQuery(sentencia);
			plazaslibres.addItem("Seleccione una opción");
			while(rs.next()){
				cbox_lineas.addItem(rs.getString("Nombre"));  
			}
			return plazaslibres;
		}catch(Exception e) {
			e.printStackTrace();
			return plazaslibres;
		}
	}
	 * 
	 * 
	 * 
	 */

	
	
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


