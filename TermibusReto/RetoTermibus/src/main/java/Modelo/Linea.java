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

import javafx.scene.control.ComboBox;

public class Linea {
    
    private String id;
    private String nombre;
    
    public Linea(String pId, String pNombre) {
        this.id = pId;
        this.nombre = pNombre; 
    }

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}












