package Vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bienvenida extends JPanel {
	
	public JButton btnBienvenida = new JButton("");
	
	
	public Bienvenida() {
		setLayout(null);
		setSize(800,700);
		
		
		
		btnBienvenida.setIcon(new ImageIcon(Bienvenida.class.getResource("/imagenes/luzazul.jpeg")));
		btnBienvenida.setBounds(0, 0, 800, 700);
		add(btnBienvenida);
		
		
	}
}
