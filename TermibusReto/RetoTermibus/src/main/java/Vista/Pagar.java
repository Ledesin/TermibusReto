package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;



public class Pagar extends JPanel {
	
	public JButton imprimirtxt = new JButton("Imprimir");
	public JButton btnNewButton = new JButton("Comprar Otro Billete");
	public JButton btnPagar = new JButton("Pagar");
	public JTextPane textPane = new JTextPane();
	
	public JTextField cantidadpago;
	public JLabel lblHaIntroducido;
	public double precioFinal;
	
	
	public JLabel lblrestantePorIntroducir;
	public JPanel contentPane;
	private final JLabel lblVueltas = new JLabel("Vueltas");

	/**
	 * Create the panel.
	 */
	public Pagar() { //double preciofinal
//	JLabel lbldineroSobrante = new JLabel();
//	JLabel lblrestantePorIntroducir = new JLabel();
		setLayout(null);
		
		
		cantidadpago = new JTextField();
		cantidadpago.setBounds(205, 56, 86, 20);
		add(cantidadpago);
		cantidadpago.setColumns(10);
		lblVueltas.setFont(new Font("Tahoma", Font.BOLD, 14));
			
		
			JLabel lblIntroduzcaElDinero = new JLabel("Introduzca El Dinero");
			lblIntroduzcaElDinero.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblIntroduzcaElDinero.setBounds(23, 57, 153, 14);
			add(lblIntroduzcaElDinero);
			
			/*cantidadpago = new JTextField();
			//contentPane.add(cantidadpago);
			add(cantidadpago);
			cantidadpago.setColumns(10);
			lblVueltas.setFont(new Font("Tahoma", Font.BOLD, 14));
			
			*/

			
		
			
			
		
			// Aqui se le mostrara al Usuario el dinero que le sobra
			add(lblVueltas);
			textPane = new JTextPane();
			textPane.setText("	Vueltas: " );
			textPane.setBounds(23, 124, 139, 132);
			add(textPane);
		//	contentPane.add(textPane);
			add(textPane);
			textPane.setVisible(false);
			
			
			
			
		btnNewButton.setBounds(281, 233, 139, 23);
		add(btnNewButton);
		
		
		
			
				
					
		imprimirtxt.setBounds(326, 139, 89, 23);
		add(imprimirtxt);
	
			
		
		
		btnPagar.setBounds(326, 55, 89, 23);
		add(btnPagar);
		lblVueltas.setBounds(36, 99, 86, 14);
		
	
		
		
		
		
		
		JLabel lblFondoLogin = new JLabel("fondo");
		lblFondoLogin.setBackground(new Color(0, 102, 255));
		lblFondoLogin.setIcon(new ImageIcon(Login.class.getResource("/imagenes/luzazul.jpeg")));
		lblFondoLogin.setBounds(0, 0, 450, 300);
		add(lblFondoLogin);

}	
}
