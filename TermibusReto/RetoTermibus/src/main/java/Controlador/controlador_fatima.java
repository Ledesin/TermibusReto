package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import Modelo.Modelo;
import Vista.Vista;

public class controlador_fatima {

	public Modelo modelo;
	public Vista vista;
	
	public controlador_fatima(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		initializeEvents();
	}

public void initializeEvents() {
	this.vista.bienvenida.btnBienvenida.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//String lineas = modelo.linea.ObtenerLineas();
			
			vista.ventana.setContentPane(vista.pagar);
			vista.ventana.setVisible(true);				
			//.panelLinea.MostrarLineas(lineas);
		}
	});

	
	
	
	this.vista.pagar.btnPagar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			modelo.pagar.Pagar(vista.pagar.precioFinal, vista.pagar.textPane, vista.pagar.lblrestantePorIntroducir,
				vista.pagar.cantidadpago, vista.pagar.contentPane);
			//, vista.pagar.lblHaIntroducido
			
			vista.pagar.textPane.setText(Double.toString(modelo.pagar.getImporteRestante()));
			//vista.pagar.textPane(vista.pagar.);
			
		
		}
	});
			

	
	
		this.vista.pagar.imprimirtxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	
	
	
		this.vista.pagar.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//link de maria 
			}
			});
		
		
		
		
		this.vista.login.btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if login correct
				lblPlazasDisponibles plazaslibres = modelo.gestorBD.getLineasBD();
				
				//else volver a pedirlo
			}
		});
	
	
	
}	
	
}
