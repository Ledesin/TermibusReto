package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JLayeredPane;
//import TermibusReto.Pago;


public class PlazasLibres_Y_PrecioBilletes extends JFrame {
	private JLayeredPane contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlazasLibres_Y_PrecioBilletes frame = new PlazasLibres_Y_PrecioBilletes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PlazasLibres_Y_PrecioBilletes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JLayeredPane();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Reserbar Otro Billete");
		btnNewButton.setBounds(10, 216, 190, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// (PONER EL LINK DE MARIA DE PARADA DE ORIGEN Y TODO)
				/*
				 *
				Pago frame = new Pago();
				frame.setVisible(true);
				dispose();
			*/
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
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
	
