package Modelo;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Linea {
	
	GestorBD metodoBD = new GestorBD();


	public ComboBoxModel consultar_lineas(JComboBox cbox_lineas){

	//Creamos objeto tipo Connection    
	java.sql.Connection conectar = null;    
	PreparedStatement pst = null;
	ResultSet result = null;

	//Creamos la Consulta SQL
	String SSQL = "SELECT * FROM linea";

	try {
	       
	   //Establecemos conexión con la BD 
		conectar = ((java.sql.Statement) metodoBD.dataSource).getConnection();  
	   //Preparamos la consulta SQL
	   pst = conectar.prepareStatement(SSQL);
	   //Ejecutamos la consulta
	   result = pst.executeQuery();
	   
	   //LLenamos nuestro ComboBox
	   cbox_lineas.addItem("Seleccione una opciónn");
	   
	   while(result.next()){
	   
		   cbox_lineas.addItem(result.getString("nombre linea"));
	   
	   }
	   
	    
	} catch (SQLException e) {

	    JOptionPane.showMessageDialog(null, e);
	    
	}finally{

	    if(conectar!=null){
	        
	        try {
	        
	            conectar.close();
	            result.close();
	            
	            conectar=null;
	            result=null;
	            
	        } catch (SQLException ex) {
	            
	            JOptionPane.showMessageDialog(null, ex);
	        
	        }
	    
	    }

	}
	return null;
	    

	}
}




