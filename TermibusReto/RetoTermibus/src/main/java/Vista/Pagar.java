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
		public JButton btnPagar = new JButton("Pagar");
	public JTextPane textPane = new JTextPane();
	public  JLabel lblVueltas = new JLabel("Vueltas");
	public JTextField cantidadpago;
	public JLabel lblrestantePorIntroducir = new JLabel();
	public double precioTotal;
	public  JLabel lbIntroducido = new JLabel("Ha Introducido");
	public JButton Atras = new JButton("Atras");
	
		


	public Pagar() { 
		setLayout(null);
		setSize(800,700); 
		
		
			//el dinero que introduzca el usuario cantidad de dinero
			cantidadpago = new JTextField();
			cantidadpago.setBounds(84, 305, 243, 39);
			add(cantidadpago);
			cantidadpago.setColumns(10);
			lblVueltas.setForeground(Color.WHITE);
			
	
			lblVueltas.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//el label de donde esta escrito introduzca el dinero
			JLabel lblIntroduzcaElDinero = new JLabel("Introduzca el dinero");
			lblIntroduzcaElDinero.setForeground(Color.WHITE);
			lblIntroduzcaElDinero.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblIntroduzcaElDinero.setBounds(81, 249, 258, 39);
			add(lblIntroduzcaElDinero);
			
				
		
			// Aqui se le mostrara al Usuario el dinero que le sobra
			add(lblVueltas);
			lblVueltas.setBounds(81, 249, 258, 39);
		
			
			
			
				
			//boton imprimir 			
			imprimirtxt.setBounds(351, 598, 121, 23);
			add(imprimirtxt);
		
				
			
			//poton pagar
			btnPagar.setBounds(90, 598, 89, 23);
			add(btnPagar);
			
			//vueltas
			lblVueltas.setBounds(476, 249, 135, 44);
			
			
			Atras.setBounds(599, 598, 89, 23);
			add(Atras);
			
		
			
			JLabel lblFondoLogin = new JLabel("fondo");
			lblFondoLogin.setBackground(new Color(0, 102, 255));
			lblFondoLogin.setIcon(new ImageIcon(Login.class.getResource("/imagenes/luzazul.jpeg")));
			lblFondoLogin.setBounds(0, 0, 800, 700);
			add(lblFondoLogin);
			
					
			
			lblrestantePorIntroducir.setBounds(38, 74, 46, 14);
			add(lblrestantePorIntroducir);
			
			lbIntroducido.setBounds(281, 124, 76, 39);
			
			add(lbIntroducido);
			textPane.setBounds(464, 296, 224, 132);
			add(textPane);

	}	
}