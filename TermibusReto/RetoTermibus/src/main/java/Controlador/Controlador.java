package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.text.Keymap;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {
	public Modelo modelo;
	public Vista vista;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		initializeEvents();
	}
	
	public void initializeEvents() {
		this.vista.bienvenida.btnBienvenida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String lineas = modelo.linea.ObtenerLineas();
				
				vista.ventana.setContentPane(vista.login);
				vista.ventana.setVisible(true);				
				//.panelLinea.MostrarLineas(lineas);
			}
		});
	}
	
	
	
	public void botonRegistro() {
		this.vista.login.btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.gestorBD.insertarUsuario(vista.login.textFieldDNI.getText(), vista.login.textFieldNombre.getText(), 
						vista.login.textFieldApellidos.getText(), vista.login.textFieldFecha_nac.getText(), 
						vista.login.textFieldSexo.getText(), vista.login.passwordFieldCrearPass.getPassword());
				
				modelo.gestorBD.cerrarConexion();
				
				vista.ventana.setContentPane(vista.lineas);
				vista.ventana.setVisible(true);
			}
		});
	}
	
}
