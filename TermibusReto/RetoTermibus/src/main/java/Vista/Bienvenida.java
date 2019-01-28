package Vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bienvenida extends JPanel {
	
	public JButton btnBienvenida = new JButton("");
	
	public Bienvenida() {
		setLayout(null);
		
		btnBienvenida.setIcon(new ImageIcon(Bienvenida.class.getResource("/imagenes/luzazul.jpeg")));
		btnBienvenida.setBounds(0, 0, 450, 300);
		add(btnBienvenida);
		
		
	}
}
