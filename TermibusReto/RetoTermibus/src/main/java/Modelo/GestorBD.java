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

	public boolean insertarUsuario1(String dni, String nombre, String apellidos, String fecha_nac, String sexo,
			String password) {
		String sentencia2 = "select * from cliente where DNI=\"" + dni + "\"";
		try {
			preparedstatement = conexion.prepareStatement(sentencia2);
			result = preparedstatement.executeQuery();
			if (result.next() == true) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean insertarUsuario2(String dni, String nombre, String apellidos, String fecha_nac, String sexo,
			String password) {

		String sentencia = "insert into cliente(DNI, Nombre, Apellidos, Fecha_nac, Sexo, Contraseña) " + "values(\""
				+ dni + "\", \"" + nombre + "\", \"" + apellidos + "\", \"" + fecha_nac + "\", \"" + sexo + "\", \""
				+ password + "\")";
		try {
			statement = conexion.createStatement();

			if (dni.equals("") || nombre.equals("") || apellidos.equals("") || fecha_nac.equals("") || sexo.equals("")
					|| password.equals("")) {
				return true;
			} else {
				System.out.println(sentencia);
				preparedstatement = conexion.prepareStatement(sentencia);
				preparedstatement.executeUpdate();
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean introducirLogin(String logindni, String loginpass) {

		String sentencia = "select DNI, Contraseña from cliente where DNI=\"" + logindni + "\" and Contraseña=\""
				+ loginpass + "\"";

		try {
			statement = conexion.createStatement();
			result = statement.executeQuery(sentencia);
			System.out.println(sentencia);
			return result.first();
		} catch (Exception error) {
			error.printStackTrace();
		}
		return false;
	}

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

	

	

	// Metodo llenar Combobox ParadasOrigen
	public ArrayList<Parada> seleccionarPO(ArrayList<Linea> misLineas) throws Exception {
		ArrayList<Parada> misParadas = new ArrayList<Parada>();

		try {
			// conectar();
			// Statements allow to issue SQL queries to the database
			statement = conexion.createStatement();
			// Con esto saco Cod_linea/cod_parada/Nombre parada --> SELECT linea.Cod_Linea,
			// linea_parada.Cod_Parada, parada.Nombre FROM linea INNER JOIN linea_parada ON
			// linea.Cod_Linea = linea_parada.Cod_Linea INNER JOIN parada ON
			// parada.Cod_Parada = linea_parada.Cod_Parada WHERE cod_linea = misLineas
			result = statement.executeQuery("SELECT Cod_Parada FROM linea-parada");// WHERE cod_linea = misLineas
			while (result.next()) {
				misParadas.add(new Parada(result.getInt("cod_parada"), result.getString("Nombre")));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// close();
		return misParadas;

	}

	// Metodo llenar Combobox ParadasDestino
	public ArrayList<Parada> seleccionarPD(ArrayList<Linea> misLineas) throws Exception {
		ArrayList<Parada> misParadas = new ArrayList<Parada>();

		try {
			// conectar();
			// Statements allow to issue SQL queries to the database
			statement = conexion.createStatement();
			// Result set get the result of the SQL query
			result = statement.executeQuery("SELECT Cod_Parada FROM linea-parada");// WHERE cod_linea = misLineas
			while (result.next()) {
				misParadas.add(new Parada(result.getInt("cod_parada"), result.getString("Nombre")));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// close();
		return misParadas;

	}

	// Metodo llenar Combobox Tipos de Autobus
	public ArrayList<Bus> seleccionarB() throws Exception {
		ArrayList<Bus> misBuses = new ArrayList<Bus>();

		try {
			// conectar();
			// Statements allow to issue SQL queries to the database
			statement = conexion.createStatement();
			// Result set get the result of the SQL query
			result = statement.executeQuery("SELECT * FROM linea_autobus");
			while (result.next()) {
				misBuses.add(new Bus(result.getInt("cod_linea"), result.getInt("cod_Bus")));

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
