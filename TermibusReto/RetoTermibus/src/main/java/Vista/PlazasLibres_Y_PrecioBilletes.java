package Vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
//import TermibusReto.Pago;


public class PlazasLibres_Y_PrecioBilletes extends JPanel {


	public PlazasLibres_Y_PrecioBilletes() {
		setLayout(null);
		
		
		JButton btnNewButton = new JButton("Reservar Otro Billete");
		btnNewButton.setBounds(10, 216, 190, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		//btnNewButton.addActionListener(new ActionListener() //{
			//public void actionPerformed(ActionEvent arg0) {
				// (PONER EL LINK DE MARIA DE PARADA DE ORIGEN Y TODO)
				/*
				 *
				Pago frame = new Pago();
				frame.setVisible(true);
				dispose();
			*/
				
		//	}
	//	});
		
		
		JLabel lblPlazasDisponibles = new JLabel("Plazas Disponibles");
		lblPlazasDisponibles.setBounds(38, 26, 156, 23);
		lblPlazasDisponibles.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblPlazasDisponibles);
		
		JLabel lblPrecioDelBillete = new JLabel("Precio Del billete");
		lblPrecioDelBillete.setBounds(276, 30, 148, 14);
		lblPrecioDelBillete.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblPrecioDelBillete);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 60, 190, 145);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(252, 60, 172, 145);
		contentPane.add(textPane_1);
		
		JButton btnNewButton_1 = new JButton("Realizar El Pago");
		//	btnNewButton_1.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent arg0) {
				//Pago frame = new Pago();
			//	frame.setVisible(true);
			//	dispose();
			//}
			//});
		btnNewButton_1.setBounds(252, 216, 172, 23);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton_1);
	//	public void actionPerformed(ActionEvent arg0) {
	/*
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				realizar_el_pago frame = new realizar_el_pago();
				frame.setVisible(true);
				dispose();
				
			
			}}
	
	*/
	
	
	}	
}
	
