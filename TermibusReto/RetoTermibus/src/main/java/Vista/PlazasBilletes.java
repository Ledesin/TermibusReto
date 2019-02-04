package Vista;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlazasBilletes extends JPanel {
	
	public JButton btnPagar = new JButton("Pagar");
	public JTextField textPrecioBillete = new JTextField();
	public JTextField textPlazasDisponibles = new JTextField();
	public JLabel lblPlazasDisponibles = new JLabel("Plazas Disponibles");
	public JButton BOTONcoprarOtroBillete = new JButton("Comprar Otro Billete");
	public JLabel lblPlazasBilletes = new JLabel("PLAZAS Y PRECIO DEL BILLETE");
	public JLabel lblTipoDeBillete = new JLabel("Tipo De Billete");
	public JLabel lblPrecioDelBillete = new JLabel("Precio Del billete");
	public JRadioButton rdbtnIda = new JRadioButton("Ida");
	public JRadioButton rdbtnVuelta = new JRadioButton("Vuelta");
	public JLabel lblDa = new JLabel("D\u00EDa");
	public 	JLabel lblMes = new JLabel("Mes");
	public JComboBox comboBoxDias = new JComboBox();
	public JComboBox comboBoxMes = new JComboBox();
	
	public PlazasBilletes() {
		
		setLayout(null);
		setSize(800,700);

		//jlabel plazas libres texto solo
		lblPlazasDisponibles.setForeground(Color.WHITE);
		lblPlazasDisponibles.setBounds(47, 304, 254, 31);
		lblPlazasDisponibles.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(lblPlazasDisponibles);
		
		// jlabel precio del billete texto solo
		lblPrecioDelBillete.setForeground(Color.WHITE);
		lblPrecioDelBillete.setBounds(446, 311, 246, 24);
		lblPrecioDelBillete.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(lblPrecioDelBillete);
		
		//titulo
		lblPlazasBilletes.setForeground(Color.WHITE);
		lblPlazasBilletes.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblPlazasBilletes.setBounds(141, 200, 542, 55);
		add(lblPlazasBilletes);
		
		//texto para escribirbir 
		textPlazasDisponibles.setBounds(293, 304, 90, 31);
		add(textPlazasDisponibles);
		//texto para escribirbir 	
		textPrecioBillete.setBounds(671, 304, 90, 31);
		add(textPrecioBillete);
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		// el boton para hir la del pagar
		btnPagar.setBounds(447, 632, 90, 25);
		btnPagar.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(btnPagar);
		
		//tipo de billete texto solo 
		lblTipoDeBillete.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTipoDeBillete.setForeground(Color.WHITE);
		lblTipoDeBillete.setBounds(47, 420, 263, 30);
		add(lblTipoDeBillete);
		
		
		//el radio de ida 
		rdbtnIda.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnIda.setBounds(247, 424, 84, 23);
		add(rdbtnIda);
		
		
		//el radio de buelta
		rdbtnVuelta.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnVuelta.setBounds(344, 424, 84, 23);
		add(rdbtnVuelta);
		
		
		//texto dia
		lblDa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDa.setForeground(Color.WHITE);
		lblDa.setBounds(47, 509, 84, 30);
		add(lblDa);
		
		
		//texto mes 
		lblMes.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMes.setForeground(Color.WHITE);
		lblMes.setBounds(178, 511, 84, 22);
		add(lblMes);
		
	
		// elegir dias 
		comboBoxDias.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBoxDias.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDias.setBounds(47, 548, 90, 20);
		add(comboBoxDias);
		//elegit mes
		
		comboBoxMes.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marza", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Sebtimpre", "Octubre", "Noviembre", "Deciembre"}));
		comboBoxMes.setBounds(170, 548, 90, 20);
		add(comboBoxMes);
		BOTONcoprarOtroBillete.setFont(new Font("Tahoma", Font.BOLD, 12));
		

		BOTONcoprarOtroBillete.setBounds(585, 633, 163, 23);
		add(BOTONcoprarOtroBillete);
		
		
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Bienvenida.class.getResource("/imagenes/luzazul.jpeg")));
		lblFondo.setBounds(0, 0, 800, 700);
		add(lblFondo);
	}
}