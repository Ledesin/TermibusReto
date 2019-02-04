package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorBD {
	private Connection conexion;
	private Statement statement = null;
	private PreparedStatement preparedstatement = null;
	private ResultSet result;

	public GestorBD() {
		conexion = null;
		conectar();
	}

	public void conectar() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/termibus?serverTimezone=UTC", "root",
					"elorrieta");
			if (conexion != null) {
				statement = conexion.createStatement();
				System.out.println("Conexión establecida a la base de datos");
			} else
				System.out.println("Conexión fallida");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean comprobarUsuario(String dni, String nombre, String apellidos, String fecha_nac, String sexo,
			String password) {
		String sentencia = "select * from cliente where DNI=\"" + dni + "\"";
		try {
			preparedstatement = conexion.prepareStatement(sentencia);
			result = preparedstatement.executeQuery();
			if (result.next() == true) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean comprobarCampos(String dni, String nombre, String apellidos, String fecha_nac, String sexo,
			String password) {

		String sentencia = "insert into cliente(DNI, Nombre, Apellidos, Fecha_nac, Sexo, Contraseña) " + "values(\""
				+ dni + "\", \"" + nombre + "\", \"" + apellidos + "\", \"" + fecha_nac + "\", \"" + sexo + "\", \""
				+ password + "\")";
		try {
			statement = conexion.createStatement();
			preparedstatement = conexion.prepareStatement(sentencia);
			if (dni.equals("") || nombre.equals("") || apellidos.equals("") || fecha_nac.equals("") || sexo.equals("")
					|| password.equals("")) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean insertarUsuario(String dni, String nombre, String apellidos, String fecha_nac, String sexo,
			String password) {
		String sentencia = "insert into cliente(DNI, Nombre, Apellidos, Fecha_nac, Sexo, Contraseña) " + "values(\""
				+ dni + "\", \"" + nombre + "\", \"" + apellidos + "\", \"" + fecha_nac + "\", \"" + sexo + "\", \""
				+ password + "\")";
		try {
			statement = conexion.createStatement();
			preparedstatement = conexion.prepareStatement(sentencia);
			preparedstatement.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean comprobarBorrarUsuario(String logindni, String loginpass) {
		String sentencia = "select * from cliente where DNI=\"" + logindni + "\" and Contraseña=\"" + loginpass + "\"";
		try {
			statement = conexion.createStatement();
			result = statement.executeQuery(sentencia);
			if (result.next() == true) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void borrarUsuario(String logindni, String loginpass) {
		String sentencia = "delete from cliente where DNI=\"" + logindni + "\" and Contraseña=\"" + loginpass + "\"";
		try {
			statement = conexion.createStatement();
			preparedstatement = conexion.prepareStatement(sentencia);
			preparedstatement.executeUpdate();

		} catch (Exception error) {
			error.printStackTrace();

		}
	}

	public boolean introducirLogin(String logindni, String loginpass) {

		String sentencia = "select DNI, Contraseña from cliente where DNI=\"" + logindni + "\" and Contraseña=\""
				+ loginpass + "\"";

		try {
			statement = conexion.createStatement();
			result = statement.executeQuery(sentencia);
			return result.first();
		} catch (Exception error) {
			error.printStackTrace();
		}
		return false;
	}

	// Metodo llenar Combobox Lineas
		public ArrayList<Linea> seleccionar() throws Exception {
			ArrayList<Linea> misLineas = new ArrayList<Linea>();

			try {
				// conectar();
				// Statements allow to issue SQL queries to the database
				statement = conexion.createStatement();
				// Result set get the result of the SQL query
				result = statement.executeQuery("select * from linea");
				while (result.next()) {
					misLineas.add(new Linea(result.getString("Cod_Linea"), result.getString("Nombre")));

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			// close();
			return misLineas;
		}
		
		// Metodo obtener codigo de una linea
		public String seleccionarCodigoLinea(String nombreLinea) throws Exception {
			String codLinea = null;
			try {
				// conectar();
				// Statements allow to issue SQL queries to the database
				statement = conexion.createStatement();
				// Result set get the result of the SQL query
				String sentencia = "select Cod_Linea from linea where Nombre=\"" + nombreLinea + "\"";
				result = statement.executeQuery(sentencia);
				if(result.next()){
					codLinea = result.getString("Cod_Linea");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// close();
			return codLinea;
		}

		// Metodo llenar Combobox Paradas
		public ArrayList<Parada> seleccionarP(String codigoLinea) throws Exception {
			ArrayList<Parada> misParadas = new ArrayList<Parada>();

			try {
				// conectar();
				// Statements allow to issue SQL queries to the database
				statement = conexion.createStatement();

				String sentencia = "SELECT `parada`.`Cod_Parada`, `parada`.`Nombre`, `parada`.`Calle`, `parada`.`Latitud`, `parada`.`Longitud` FROM `linea-parada` INNER JOIN `parada` ON `linea-parada`.`Cod_Parada` = `parada`.`Cod_Parada` WHERE `linea-parada`.`Cod_Linea`=\""
						+ codigoLinea + "\"";

				result = statement.executeQuery(sentencia);
				while (result.next()) {
					misParadas.add(new Parada(result.getInt("Cod_Parada"), result.getString("Nombre"), result.getString("Calle"), result.getFloat("Latitud"), result.getFloat("Longitud")));

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			// close();
			return misParadas;

		}

	
		// Metodo llenar Combobox Tipos de Autobus
		public ArrayList<Bus> seleccionarB(String codigoLinea) throws Exception {
			ArrayList<Bus> misBuses = new ArrayList<Bus>();

			try {
				// conectar();
				// Statements allow to issue SQL queries to the database
				statement = conexion.createStatement();

				String sentencia = "SELECT `autobus`.`Cod_bus`, `autobus`.`N_plazas`, `autobus`.`Consumo_km`, `autobus`.`Color` FROM `linea_autobus` INNER JOIN `autobus` ON `linea_autobus`.`Cod_bus` = `autobus`.`Cod_bus` WHERE `linea_autobus`.`Cod_Linea`=\""
						+ codigoLinea + "\"";

				result = statement.executeQuery(sentencia);
				while (result.next()) {
					misBuses.add(new Bus(codigoLinea, result.getInt("Cod_bus"), result.getInt("N_plazas"), result.getFloat("Consumo_km"), result.getString("Color")));

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			// close();
			return misBuses;

		}

	public void cerrarConexion() {
		try {

			if (preparedstatement != null) {
				preparedstatement.close();
			}

			if (statement != null) {
				statement.close();
			}
			if (conexion != null) {
				conexion.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}