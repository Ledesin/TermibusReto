package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.text.Keymap;

import Modelo.Modelo;
import Vista.Vista;

public class ControladorMaria {
	public Modelo modelo;
	public Vista vista;
	
	public ControladorMaria(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		initializeEvents();
	}
	
	public void initializeEvents() {
		this.vista.bienvenida.btnBienvenida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String lineas = modelo.linea.ObtenerLineas();
				
				vista.ventana.setContentPane(vista.lineas);
				vista.ventana.setVisible(true);				
				//.panelLinea.MostrarLineas(lineas);
			}
		});
		
		
		
		this.vista.login.btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				modelo.gestorBD.insertarUsuario(vista.login.textFieldDNI.getText(), vista.login.textFieldNombre.getText(), 
						vista.login.textFieldApellidos.getText(), vista.login.textFieldFecha_nac.getText(), 
						vista.login.textFieldSexo.getText(), vista.login.passwordFieldCrearPass.getPassword());
				JOptionPane.showMessageDialog(null, "Usuario creado con exito, Logueate");				
			}
		});
		
		this.vista.login.btnLogin.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {

				//if login correct
				//JComboBox combo_lineas = modelo.gestorBD.getLineasBD();
				
				//else volver a pedirlo

				if(modelo.gestorBD.introducirLogin(vista.login.textFieldLoginDNI.getText(), vista.login.passwordFieldLoginPass.getPassword())==false) {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos...");
				}
				else {
					JOptionPane.showMessageDialog(null, "Logueado correctamente...");
					vista.ventana.setContentPane(vista.lineas);
					vista.ventana.setVisible(true);
				}
				 

			}
		});
		
		
		
	}
	
	
	
}
