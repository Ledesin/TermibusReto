package Vista;

import javax.swing.JPanel;

import Modelo.Linea;
import Modelo.Parada;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Lineas extends JPanel {

	/**
	 * Create the panel.
	 */
	public JButton btnAceptar;
	JComboBox comboBox = new JComboBox();
	JComboBox comboBoxParada = new JComboBox();
	JComboBox comboBoxParadaDestino = new JComboBox();
	JComboBox comboBoxBus = new JComboBox();

	public Lineas() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);

		// COMBOBOX LINEAS
		JLabel lblEscoger = new JLabel("Escoge la linea");
		lblEscoger.setForeground(Color.WHITE);
		lblEscoger.setBounds(144, 41, 154, 14);
		add(lblEscoger);

		comboBox.setBounds(145, 66, 153, 20);
		add(comboBox);

		// COMBOBOX PARADA ORIGEN
		JLabel lblEscogeParadaOrigen = new JLabel("Escoge Municipio Origen");
		lblEscogeParadaOrigen.setForeground(Color.WHITE);
		lblEscogeParadaOrigen.setBounds(21, 118, 130, 14);
		add(lblEscogeParadaOrigen);

		comboBoxParada.setBounds(20, 140, 153, 20);
		add(comboBoxParada);

		// COMBOBOX PARADA DESTINO
		JLabel lblEscogeParadaDestino = new JLabel("Escoge Municipio Destino");
		lblEscogeParadaDestino.setForeground(Color.WHITE);
		lblEscogeParadaDestino.setBounds(235, 118, 130, 14);
		add(lblEscogeParadaDestino);

		comboBoxParadaDestino.setBounds(234, 140, 153, 20);
		add(comboBoxParadaDestino);

		// COMBOBOX TIPOS BUS
		JLabel lblNewLabel_1 = new JLabel("Tipo de Autobus");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(21, 194, 101, 14);
		add(lblNewLabel_1);

		comboBoxBus.setBounds(21, 213, 153, 20);
		add(comboBoxBus);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(292, 234, 89, 23);
		add(btnAceptar);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Lineas.class.getResource("/imagenes/luzazul.jpeg")));
		lblNewLabel.setBounds(0, 0, 450, 300);
		add(lblNewLabel);
	}

	public void llenarComboBoxLineas(ArrayList<Linea> misLineas) {

		for (int index = 0; index < misLineas.size(); index++) {
			comboBox.addItem(makeObj(misLineas.get(index).getNombre()));
		}

	}

	public void llenarComboBoxParadas(ArrayList<Parada> misParadas) {
		for (int index = 0; index < misParadas.size(); index++)
			comboBoxParada.addItem(makeObj(misParadas.get(index).getNombre()));
	}

	public void llenarComboBoxParadasDestino(ArrayList<Parada> misParadas) {
		for (int index = 0; index < misParadas.size(); index++)
			comboBoxParadaDestino.addItem(makeObj(misParadas.get(index).getNombre()));
	}

	public void llenarComboBoxBus(ArrayList<Parada> misParadas) {
		for (int index = 0; index < misParadas.size(); index++)
			comboBoxBus.addItem(makeObj(misParadas.get(index).getNombre()));
	}

	private Object makeObj(final String item) {
		return new Object() {
			public String toString() {
				return item;
			}
		};
	}
}
