package Vista;

import Modelo.GestorBD;
import Modelo.Linea;
import Modelo.Parada;

import javax.swing.JPanel;
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
	public Lineas() {

		setBackground(Color.LIGHT_GRAY);
		setLayout(null);

		// <<<<<<<<<<<<<<<<<<<<<<<<COMBOBOX LINEA>>>>>>>>>>>>>>>>>>>>>>>>

		// arrayList BD
		ArrayList<Linea> todasLineas = new ArrayList<Linea>();
		GestorBD db = new GestorBD();
		// Recojo todas las lineas
		todasLineas = db.getLineasBD();

		JLabel lblEscoger = new JLabel("Escoge la linea");
		lblEscoger.setForeground(Color.WHITE);
		lblEscoger.setBounds(144, 41, 154, 14);
		add(lblEscoger);

		JComboBox comboBoxLineas = new JComboBox();
		comboBoxLineas.setBounds(145, 66, 153, 20);
		for (int index = 0; index < todasLineas.size(); index++) {
			// Por cada linea recojo su codigo y su nombre
			Linea lineaActual = todasLineas.get(index);
			String idLinea = lineaActual.getId();
			String nombreLinea = lineaActual.getNombre();
			// Concatenacion de el codigo y el nombre
			String mensaje = idLinea + " .- " + nombreLinea;
			comboBoxLineas.addItem(mensaje);
		}
		add(comboBoxLineas);

		// Guardo la linea escogida por el usuario
		String lineaEscogida = comboBoxLineas.getSelectedItem().toString();
		// Guardo por separado el id de la linea
		String idLineaEscogida = lineaEscogida.substring(0, 2);

		// <<<<<<<<<<<<<<<<<<<<<<<<COMBOBOX PARADA ORIGEN>>>>>>>>>>>>>>>>>>>>>>>>

		// arrayList BD
		ArrayList<Integer> todasParadas = new ArrayList<Integer>();
		// Recojo todas las paradas
		todasParadas = db.getParadasBD(idLineaEscogida);

		JLabel lblEscogeParadaOrigen = new JLabel("Escoge parada origen");
		lblEscogeParadaOrigen.setForeground(Color.WHITE);
		lblEscogeParadaOrigen.setBounds(21, 118, 154, 14);
		add(lblEscogeParadaOrigen);

		JComboBox comboBoxParadasOri = new JComboBox();
		comboBoxParadasOri.setBounds(20, 140, 153, 20);
		for (int index = 0; index < todasParadas.size(); index++) {
			// recojo las paradas
			int idParada = todasParadas.get(index);

			comboBoxLineas.addItem(idParada);
		}

		add(comboBoxParadasOri);

		// <<<<<<<<<<<<<<<<<<<<<<<<COMBOBOX PARADA DESTINO>>>>>>>>>>>>>>>>>>>>>>>>

		JLabel lblEscogeParadaDestino = new JLabel("Escoge parada destino");
		lblEscogeParadaDestino.setForeground(Color.WHITE);
		lblEscogeParadaDestino.setBounds(235, 118, 168, 14);
		add(lblEscogeParadaDestino);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
		comboBox_2.setBounds(234, 140, 153, 20);
		add(comboBox_2);

		// <<<<<<<<<<<<<<<<<<<<<<<<INTODUCIR FECHA VIAJE>>>>>>>>>>>>>>>>>>>>>>>>

		JLabel lblEscogeLaFecha = new JLabel("Escoge la fecha del viaje:");
		lblEscogeLaFecha.setForeground(Color.WHITE);
		lblEscogeLaFecha.setBounds(21, 191, 175, 14);
		add(lblEscogeLaFecha);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBox_3.setBounds(22, 235, 33, 20);
		add(comboBox_3);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(292, 234, 89, 23);
		add(btnNewButton);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo",
				"Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
		comboBox_4.setBounds(65, 235, 60, 20);
		add(comboBox_4);

		JLabel lblDa = new JLabel("D\u00EDa");
		lblDa.setForeground(Color.WHITE);
		lblDa.setBounds(21, 215, 28, 14);
		add(lblDa);

		JLabel lblMes = new JLabel("Mes");
		lblMes.setForeground(Color.WHITE);
		lblMes.setBounds(68, 216, 28, 14);
		add(lblMes);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Lineas.class.getResource("/imagenes/luzazul.jpeg")));
		lblNewLabel.setBounds(0, 0, 434, 300);
		add(lblNewLabel);
	}

	private void consultarLineas() {
		GestorBD miGestorBD = new GestorBD();
		ArrayList<Linea> listaLineas = miLinea.consultaLineaBD();
	}

}
