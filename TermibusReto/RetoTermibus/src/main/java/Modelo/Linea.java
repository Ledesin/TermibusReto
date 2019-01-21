package Modelo;

import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.istack.internal.logging.Logger;

public class Linea extends JPanel {

	static void RecogerLineas() {
		try {
			Object modelo;
			modelo.removeAllElements(); //eliminamos los elementos
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from lineas");
			while(rs.next()) {
			modelo.addElement(rs.getString("Linea"));
			}
			combo.setModel(modelo); //seteamos el modelo ys e cargaran los datos
			}catch(SQLException ex) {
				Logger.getLogger(Alta.class.getName()).log(Level.SEVERE, null, ex);
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}


