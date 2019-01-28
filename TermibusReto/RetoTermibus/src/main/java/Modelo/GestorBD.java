package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import Vista.Lineas;

public class GestorBD {
    private Connection conexion;
    private Statement statement = null;
    private PreparedStatement preparedstatement = null;
    private ResultSet result;
    

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
            if (dni.equals("") || nombre.equals("") || apellidos.equals("") || fecha_nac.equals("") || sexo.equals("") || passText.equals("")) {
            	JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos...");
            }else{
	            System.out.println(sentencia);
	            preparedstatement = conexion.prepareStatement(sentencia);
	            preparedstatement.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Usuario creado con exito, Logueate");
            }
            //+  values(textFieldDNI.getText(), textFieldNombre.getText(), textFieldApellidos.getText(), 
            //    textFieldFecha_nac.getText(),buttongroup.getSelected(), passwordFieldCrearPass.getPassword());
        
                   
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public ArrayList<Linea> getLineasBD() {
        //Metodo que devuelve todas las lineas de la BD
        ResultSet rs = null;
        String sentencia = "SELECT * FROM linea";
        ArrayList<Linea> todasLineas = new ArrayList<Linea>();
        try {
            statement = conexion.createStatement();
            System.out.println(sentencia);
            rs =  preparedstatement.executeQuery(sentencia);
            while(rs.next()) {
                String idLinea = rs.getString("Cod_Linea");
                String nombreLinea = rs.getString("Nombre");
                Linea l = new Linea(idLinea, nombreLinea);
                todasLineas.add(l);
            }
            return todasLineas;
        }catch(Exception e) {
            e.printStackTrace();
            return todasLineas;
        }
    }
    
    public ArrayList<Integer> getParadasBD(String idLineaEscogida) {
        //Metodo que devuelve todas las paradas de cada linea de la BD
        ResultSet rs = null;
        String sentencia = "SELECT Cod_Parada FROM linea-parada WHERE cod_linea = idLineaEscogida";
        ArrayList<Integer> todasParadas = new ArrayList<Integer>();
        try {
            statement = conexion.createStatement();
            System.out.println(sentencia);
            rs =  preparedstatement.executeQuery(sentencia);
            while(rs.next()) {
                Integer idParada = rs.getInt("Cod_Parada");
                todasParadas.add(idParada);
            }
            return todasParadas;
        }catch(Exception e) {
            e.printStackTrace();
            return todasParadas;
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



