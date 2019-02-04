package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Modelo.Bus;
import Modelo.Linea;
import Modelo.Modelo;
import Modelo.Pagar;
import Modelo.Parada;
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

				if (modelo.gestorBD.comprobarUsuario(vista.login.textFieldDNI.getText(),
						vista.login.textFieldNombre.getText(), vista.login.textFieldApellidos.getText(),
						vista.login.textFieldFecha_nac.getText(), vista.login.sexo.getSelection().getActionCommand(),
						String.valueOf(vista.login.passwordFieldCrearPass.getPassword())) == true) {
					JOptionPane.showMessageDialog(null, "El DNI introducido ya existe...");
				} else if (modelo.gestorBD.comprobarCampos(vista.login.textFieldDNI.getText(),
						vista.login.textFieldNombre.getText(), vista.login.textFieldApellidos.getText(),
						vista.login.textFieldFecha_nac.getText(), vista.login.sexo.getSelection().getActionCommand(),
						String.valueOf(vista.login.passwordFieldCrearPass.getPassword())) == true) {
					JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos...");
				} else if (modelo.gestorBD.insertarUsuario(vista.login.textFieldDNI.getText(),
						vista.login.textFieldNombre.getText(), vista.login.textFieldApellidos.getText(),
						vista.login.textFieldFecha_nac.getText(), vista.login.sexo.getSelection().getActionCommand(),
						String.valueOf(vista.login.passwordFieldCrearPass.getPassword())) == true) {
					JOptionPane.showMessageDialog(null, "Usuario creado con exito, logueate...");
				}
			}
		});

		this.vista.login.btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (modelo.gestorBD.comprobarBorrarUsuario(vista.login.textFieldLoginDNI.getText(),
						String.valueOf(vista.login.passwordFieldLoginPass.getPassword())) == true) {
					modelo.gestorBD.borrarUsuario(vista.login.textFieldLoginDNI.getText(),
							String.valueOf(vista.login.passwordFieldLoginPass.getPassword()));
					JOptionPane.showMessageDialog(null, "Usuario borrado correctamente...");
				} else {
					JOptionPane.showMessageDialog(null, "El usuario no existe...");
				}
			}
		});

		// BOTON VISTA LOGIN
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

		// BOTON COMBOBOX VISTA LINEAS
		this.vista.lineas.comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {

					ArrayList<Parada> misParadas = new ArrayList<Parada>();
					ArrayList<Bus> misBuses = new ArrayList<Bus>();
					ArrayList<Parada> misParadasOrdenadas = new ArrayList<Parada>();

					try {
						String nombreLineaSeleccionada = vista.lineas.getLineaSeleccionada();
						String codLineaSeleccionada = modelo.gestorBD.seleccionarCodigoLinea(nombreLineaSeleccionada);
						misParadas = modelo.gestorBD.seleccionarP(codLineaSeleccionada);
						misParadasOrdenadas = ordenarParadas(misParadas);

						// misParadasD =
						// modelo.gestorBD.seleccionarPD(misLineas);
						misBuses = modelo.gestorBD.seleccionarB(codLineaSeleccionada);
					} catch (Exception e1) {

						e1.printStackTrace();
					}
					vista.lineas.vaciarComboBoxes();// metodo para vaciar los
													// combobox antes de
													// selecionar otra linea
					vista.lineas.llenarComboBoxParadas(misParadasOrdenadas);
					vista.lineas.llenarComboBoxBus(misBuses);
					vista.ventana.setVisible(true);
				}
			
			}
			//METODO ORDENAR PARADAS
			public ArrayList<Parada> ordenarParadas(ArrayList<Parada> misParadas) {
				/*for(int i=0; i<(misParadas.length-1), i++){
					for(int j=0; j<(misParadas.length-1)j++){
						if(distanciaCoordenada)
					}
				}*/

				return misParadas;
			}
		});

		

		// BOTON ACEPTAR VISTA LINEAS
		this.vista.lineas.btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				vista.ventana.setContentPane(vista.plazasbilletes);
				vista.ventana.setVisible(true);
				
			}
		});

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