package Vista;

import javax.swing.JPanel;

import Modelo.Bus;
import Modelo.Linea;
import Modelo.Parada;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Lineas extends JPanel {

	/**
	 * Create the panel.
	 */
	public JButton btnAceptar;
	public JComboBox comboBox = new JComboBox();
	JComboBox comboBoxParadaOrigen = new JComboBox();
	JComboBox comboBoxParadaDestino = new JComboBox();
	JComboBox comboBoxBus = new JComboBox();

	public Lineas() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setSize(800,700); 
 

		// COMBOBOX LINEAS
		JLabel lblEscoger = new JLabel("Escoge la linea");
		lblEscoger.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEscoger.setForeground(Color.WHITE);
		lblEscoger.setBounds(75, 192, 299, 32);
		add(lblEscoger);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 22));

		comboBox.setBounds(75, 240, 261, 32);
		add(comboBox);

		// COMBOBOX PARADA ORIGEN
		JLabel lblEscogeParadaOrigen = new JLabel("Escoge parada de origen");
		lblEscogeParadaOrigen.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEscogeParadaOrigen.setForeground(Color.WHITE);
		lblEscogeParadaOrigen.setBounds(68, 340, 357, 21);
		add(lblEscogeParadaOrigen);
		comboBoxParadaOrigen.setFont(new Font("Tahoma", Font.PLAIN, 22));

		comboBoxParadaOrigen.setBounds(68, 377, 306, 32);
		add(comboBoxParadaOrigen);

		// COMBOBOX PARADA DESTINO
		JLabel lblEscogeParadaDestino = new JLabel("Escoge parada de destino");
		lblEscogeParadaDestino.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEscogeParadaDestino.setForeground(Color.WHITE);
		lblEscogeParadaDestino.setBounds(437, 330, 348, 40);
		add(lblEscogeParadaDestino);
		comboBoxParadaDestino.setFont(new Font("Tahoma", Font.PLAIN, 22));

		comboBoxParadaDestino.setBounds(438, 377, 280, 32);
		add(comboBoxParadaDestino);

		// COMBOBOX TIPOS BUS
		JLabel lblNewLabel_1 = new JLabel("Tipo de Autobus");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(68, 484, 287, 32);
		add(lblNewLabel_1);
		comboBoxBus.setFont(new Font("Tahoma", Font.PLAIN, 22));

		comboBoxBus.setBounds(72, 526, 306, 32);
		add(comboBoxBus);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(646, 615, 89, 23);
		add(btnAceptar);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Lineas.class.getResource("/imagenes/luzazul.jpeg")));
		lblNewLabel.setBounds(0, 0, 800, 700);
		add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(489, 119, 69, 20);
		add(label);
		
	}

	public void llenarComboBoxLineas(ArrayList<Linea> misLineas) {

		for (int index = 0; index < misLineas.size(); index++) {
			comboBox.addItem(makeObj(misLineas.get(index).getNombre()));
		}

	}

	public void llenarComboBoxParadas(ArrayList<Parada> misParadas) {
		for (int index = 0; index < misParadas.size(); index++){
			comboBoxParadaOrigen.addItem(makeObj(misParadas.get(index).getNombre()));
			comboBoxParadaDestino.addItem(makeObj(misParadas.get(index).getNombre()));
		}
	}


	public void llenarComboBoxBus(ArrayList<Bus> misBuses) {
		for (int index = 0; index < misBuses.size(); index++){
			comboBoxBus.addItem(misBuses.get(index).getcod_Bus());
		}
	}
	//metodo que vacia los combobox antes de seleccionar otra linea
	public void vaciarComboBoxes(){
		comboBoxParadaOrigen.removeAllItems();
		comboBoxParadaDestino.removeAllItems();
		comboBoxBus.removeAllItems();
		
	}
	
	public String getLineaSeleccionada() {
		String lineaSeleccionada = comboBox.getSelectedItem().toString();
		return lineaSeleccionada;
	}

	private Object makeObj(final String item) {
		return new Object() {
			public String toString() {
				return item;
			}
		};
	}
	
	private Object makeObjint(final int itemint) {
		return new Object() {
			public int toint() {
				return itemint;
			}
		};
	}
}
