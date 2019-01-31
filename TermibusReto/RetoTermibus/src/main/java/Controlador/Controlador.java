package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Modelo.Linea;
import Modelo.Modelo;
import Modelo.Pagar;
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

				vista.ventana.setContentPane(vista.login);
				vista.ventana.setVisible(true);

			}
		});

		this.vista.login.btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (modelo.gestorBD.insertarUsuario1(vista.login.textFieldDNI.getText(),
						vista.login.textFieldNombre.getText(), vista.login.textFieldApellidos.getText(),
						vista.login.textFieldFecha_nac.getText(), vista.login.sexo.getSelection().getActionCommand(),
						String.valueOf(vista.login.passwordFieldCrearPass.getPassword())) == true) {
					JOptionPane.showMessageDialog(null, "El DNI introducido ya existe...");
				} else if (modelo.gestorBD.insertarUsuario2(vista.login.textFieldDNI.getText(),
						vista.login.textFieldNombre.getText(), vista.login.textFieldApellidos.getText(),
						vista.login.textFieldFecha_nac.getText(), vista.login.sexo.getSelection().getActionCommand(),
						String.valueOf(vista.login.passwordFieldCrearPass.getPassword())) == true) {
					JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos...");
				} else {
					JOptionPane.showMessageDialog(null, "Usuario creado con exito, logueate...");
				}

			}
		});

		this.vista.login.btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (modelo.gestorBD.introducirLogin(vista.login.textFieldLoginDNI.getText(),
						String.valueOf(vista.login.passwordFieldLoginPass.getPassword())) == false) {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos...");
				} else {
					JOptionPane.showMessageDialog(null, "Logueado correctamente...");

					ArrayList<Linea> misLineas = new ArrayList<Linea>();

					try {
						misLineas = modelo.gestorBD.seleccionar();
					} catch (Exception e1) {

						e1.printStackTrace();
					}
					vista.ventana.setContentPane(vista.lineas);
					vista.lineas.llenarComboBoxLineas(misLineas);
					vista.ventana.setVisible(true);
					// .panelLinea.MostrarLineas(lineas);
				}

			}
		});

		
		  this.vista.lineas.btnAceptar.addActionListener(new ActionListener() { public
		  void actionPerformed(ActionEvent arg0) {
		  
		  vista.ventana.setContentPane(vista.plazasbilletes);
		  vista.ventana.setVisible(true); } });
		 

		this.vista.plazasbilletes.btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				vista.ventana.setContentPane(vista.pagar);
				vista.ventana.setVisible(true);
			}
		});

		this.vista.plazasbilletes.BOTONcoprarOtroBillete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// link de maria
				ArrayList<Linea> misLineas = new ArrayList<Linea>();

				try {
					misLineas = modelo.gestorBD.seleccionar();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				vista.ventana.setContentPane(vista.lineas);
				vista.lineas.llenarComboBoxLineas(misLineas);
				vista.ventana.setVisible(true);
				// .panelLinea.MostrarLineas(lineas);
			}
		});
		

		this.vista.pagar.btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Double.valueOf(vista.pagar.cantidadpago.getText()) < Double
						.parseDouble(vista.plazasbilletes.textPrecioBillete.getText())) {
					JOptionPane.showMessageDialog(vista.pagar, "Importe insuficiente");
				} else
					vista.pagar.textPane.setText(Pagar.Vueltas(Double.valueOf(vista.pagar.cantidadpago.getText()),
							Double.valueOf(vista.plazasbilletes.textPrecioBillete.getText())));
			}
		});

		this.vista.pagar.imprimirtxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.ventana.setContentPane(vista.pagar.imprimirtxt);	
				vista.ventana.setVisible(true);
			}
		});
		
		this.vista.pagar.Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.ventana.setContentPane(vista.plazasbilletes);	
				vista.ventana.setVisible(true);	
			}
		});

	}

}
