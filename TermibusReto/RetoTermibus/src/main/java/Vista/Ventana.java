package Vista;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	public Ventana() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800,700);  
		this.setLocationRelativeTo(null);
	}
}