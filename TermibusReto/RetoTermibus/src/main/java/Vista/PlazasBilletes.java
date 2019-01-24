package Vista;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class PlazasBilletes extends JPanel {
	
	public JButton btnPagar = new JButton("Pagar");
	public JTextPane textPrecioBillete = new JTextPane();
	public JTextPane textPlazasDisponibles = new JTextPane();
	
	public PlazasBilletes() {
		
		setLayout(null);

		JLabel lblPlazasDisponibles = new JLabel("Plazas Disponibles");
		lblPlazasDisponibles.setBounds(56, 99, 123, 17);
		lblPlazasDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblPlazasDisponibles);
		
		JLabel lblPrecioDelBillete = new JLabel("Precio Del billete");
		lblPrecioDelBillete.setBounds(254, 99, 111, 17);
		lblPrecioDelBillete.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblPrecioDelBillete);
		
		JLabel lblPlazasBilletes = new JLabel("PLAZAS y PRECIO DEL BILLETE");
		lblPlazasBilletes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlazasBilletes.setBounds(117, 34, 199, 25);
		add(lblPlazasBilletes);
		
		textPlazasDisponibles.setBounds(56, 129, 101, 25);
		add(textPlazasDisponibles);
				
		textPrecioBillete.setBounds(264, 129, 84, 25);
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
