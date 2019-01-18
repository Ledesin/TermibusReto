package Vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class PlazasBilletes extends JPanel {

	/**
	 * Create the panel.
	 */
	public PlazasBilletes() {
		setLayout(null);

		JLabel lblPlazasDisponibles = new JLabel("Plazas Disponibles");
		lblPlazasDisponibles.setBounds(21, 9, 123, 17);
		lblPlazasDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblPlazasDisponibles);
		
		JLabel lblPrecioDelBillete = new JLabel("Precio Del billete");
		lblPrecioDelBillete.setBounds(149, 9, 111, 17);
		lblPrecioDelBillete.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblPrecioDelBillete);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(54, 34, 31, 25);
		add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(181, 34, 31, 25);
		add(textPane_1);
		
		JButton btnNewButton_1 = new JButton("Pagar");
		btnNewButton_1.setBounds(329, 264, 111, 25);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(btnNewButton_1);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 450, 300);
		add(lblFondo);
	}
}
