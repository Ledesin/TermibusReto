package Vista;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class PlazasBilletes extends JPanel {
	//VAMOS A CREAR TODAS LAS VENTANAS COMO JPANEL, YA ESTAN TODAS CONECTADAS A LA CLASE VISTA
	public JButton btnPagar = new JButton("Pagar");
	
	public PlazasBilletes() {
		
		setLayout(null);

		JLabel lblPlazasDisponibles = new JLabel("Plazas Disponibles");
		lblPlazasDisponibles.setBounds(56, 99, 123, 17);
		lblPlazasDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblPlazasDisponibles);
		
		JLabel lblPrecioDelBillete = new JLabel("Precio Del billete");
		lblPrecioDelBillete.setBounds(185, 99, 111, 17);
		lblPrecioDelBillete.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblPrecioDelBillete);
		
		JLabel lblPlazasBilletes = new JLabel("PLAZAS y PRECIO DEL BILLETE");
		lblPlazasBilletes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlazasBilletes.setBounds(118, 11, 199, 25);
		add(lblPlazasBilletes);
		
		JTextPane textPlazasDisponibles = new JTextPane();
		textPlazasDisponibles.setBounds(91, 116, 40, 25);
		add(textPlazasDisponibles);
		
		JTextPane textPrecioBillete = new JTextPane();
		textPrecioBillete.setBounds(213, 116, 40, 25);
		add(textPrecioBillete);
		
		btnPagar.setBounds(329, 264, 111, 25);
		btnPagar.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(btnPagar);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Bienvenida.class.getResource("/imagenes/luzazul.jpeg")));
		lblFondo.setBounds(0, 0, 450, 300);
		add(lblFondo);
	}
}
