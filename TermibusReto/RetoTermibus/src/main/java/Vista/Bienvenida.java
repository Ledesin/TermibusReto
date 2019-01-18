package Vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bienvenida extends JPanel {

	/**
	 * Create the panel.
	 */
	public Bienvenida() {
		setLayout(null);
		
		JLabel lblBienvenida1 = new JLabel("Logo");
		lblBienvenida1.setIcon(new ImageIcon(Bienvenida.class.getResource("/imagenes/logo-termibus.png")));
		lblBienvenida1.setBounds(75, 48, 303, 117);
		add(lblBienvenida1);
		
		JLabel lblBienvenida2 = new JLabel("Pulsa para acceder al Menu");
		lblBienvenida2.setBounds(143, 176, 131, 21);
		add(lblBienvenida2);
		
		JButton btnBienvenida = new JButton("");
		btnBienvenida.setSelectedIcon(null);
		btnBienvenida.setIcon(new ImageIcon(Bienvenida.class.getResource("/imagenes/luzazul.jpeg")));
		btnBienvenida.setBounds(0, 0, 450, 300);
		add(btnBienvenida);
		
		
	}
}
