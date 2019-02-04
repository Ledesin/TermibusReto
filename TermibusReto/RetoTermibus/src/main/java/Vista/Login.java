package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Login extends JPanel {
	
	public JFormattedTextField textFieldDNI;
	public JFormattedTextField textFieldNombre;
	public JFormattedTextField textFieldApellidos;
	public JFormattedTextField textFieldFecha_nac;
	public ButtonGroup sexo;
	public JRadioButton rdbtnHombre;
	public JRadioButton rdbtnMujer;
	public JPasswordField passwordFieldCrearPass;
	public JFormattedTextField textFieldLoginDNI;
	public JPasswordField passwordFieldLoginPass;
	public JButton btnLogin;
	public JButton btnRegistro;	
	public JButton btnBorrar;
	private JLabel lblLoginDNI;
	private JLabel lblPasswordLogin;
	private JLabel lblNewLabel;
	private JLabel lblLogin;
	private JLabel lblDNI;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblFecha_nac;
	private JLabel lblSexo;
	private JLabel lblCrearPass;	

	public Login() {
		setLayout(null);
		setSize(800,700); 
		
		
		
		
		MaskFormatter formatterdni = null;
		try {
			formatterdni = new MaskFormatter("########U");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		formatterdni.setPlaceholderCharacter('_');
		textFieldDNI = new JFormattedTextField(formatterdni);
		textFieldDNI.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldDNI.setBounds(603, 222, 178, 31);
		add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		
		
		textFieldNombre = new JFormattedTextField();
		textFieldNombre.setFont(new Font("Tahoma", Font.BOLD, 25));
		textFieldNombre.setBounds(192, 217, 225, 31);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		
		
		textFieldApellidos = new JFormattedTextField();
		textFieldApellidos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldApellidos.setBounds(192, 270, 225, 31);
		add(textFieldApellidos);
		textFieldApellidos.setColumns(10);
		
				
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		textFieldFecha_nac = new JFormattedTextField(df);
		textFieldFecha_nac.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldFecha_nac.setBounds(192, 327, 225, 31);
		add(textFieldFecha_nac);
		textFieldFecha_nac.setColumns(10);
		try
		{
		    MaskFormatter dateMask = new MaskFormatter("####/##/##");
		    dateMask.install(textFieldFecha_nac);		   
		}
		catch(ParseException ex)
		{
		    ex.printStackTrace();
		}
		
		sexo = new ButtonGroup();
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setBounds(192, 382, 109, 23);
		rdbtnHombre.setActionCommand("V");
		add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(308, 382, 109, 23);
		rdbtnMujer.setActionCommand("M");
		add(rdbtnMujer);
		sexo.add(rdbtnHombre);
		sexo.add(rdbtnMujer);

		passwordFieldCrearPass = new JPasswordField();
		passwordFieldCrearPass.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordFieldCrearPass.setBounds(603, 279, 178, 31);
		add(passwordFieldCrearPass);
		passwordFieldCrearPass.setColumns(10);
		
		lblDNI = new JLabel("DNI:");
		lblDNI.setForeground(Color.WHITE);
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDNI.setBounds(464, 219, 74, 37);
		add(lblDNI);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNombre.setBounds(35, 215, 131, 35);
		add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblApellidos.setBounds(35, 272, 143, 27);
		add(lblApellidos);
		
		lblFecha_nac = new JLabel("Fecha Nac:");
		lblFecha_nac.setForeground(Color.WHITE);
		lblFecha_nac.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFecha_nac.setBounds(35, 327, 152, 31);
		add(lblFecha_nac);
		
		lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSexo.setBounds(35, 374, 133, 31);
		add(lblSexo);
		
		lblCrearPass = new JLabel("Password:");
		lblCrearPass.setForeground(Color.WHITE);
		lblCrearPass.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCrearPass.setBounds(461, 275, 152, 38);
		add(lblCrearPass);
		
		
		MaskFormatter formatterdnilogin = null;
		try {
			formatterdnilogin = new MaskFormatter("########U");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		formatterdnilogin.setPlaceholderCharacter('_');
		textFieldLoginDNI = new JFormattedTextField(formatterdnilogin);
		textFieldLoginDNI.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldLoginDNI.setBounds(44, 610, 196, 31);
		add(textFieldLoginDNI);
		textFieldLoginDNI.setColumns(10);
		
		
		
		passwordFieldLoginPass = new JPasswordField();
		passwordFieldLoginPass.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordFieldLoginPass.setBounds(291, 610, 192, 31);
		add(passwordFieldLoginPass);
		passwordFieldLoginPass.setColumns(10);
		
		btnRegistro = new JButton("Registrar");
		btnRegistro.setBackground(Color.GRAY);
		btnRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistro.setBounds(564, 365, 89, 23);
		add(btnRegistro);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBackground(Color.GRAY);
		btnLogin.setBounds(547, 618, 89, 23);
		btnLogin.setIcon(new ImageIcon("/imagenes/loginbtn.png"));
		add(btnLogin);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBorrar.setBounds(670, 620, 89, 23);
		add(btnBorrar);
		
		lblLoginDNI = new JLabel("Usuario (DNI):");
		lblLoginDNI.setForeground(Color.WHITE);
		lblLoginDNI.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblLoginDNI.setBounds(44, 577, 196, 25);
		add(lblLoginDNI);
		
		lblPasswordLogin = new JLabel("Password:");
		lblPasswordLogin.setForeground(Color.WHITE);
		lblPasswordLogin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPasswordLogin.setBounds(291, 578, 192, 25);
		add(lblPasswordLogin);
		
		lblNewLabel = new JLabel("REGISTRO DE NUEVO USUARIO");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(35, 128, 582, 31);
		add(lblNewLabel);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblLogin.setBounds(39, 506, 131, 39);
		add(lblLogin);
		
		JLabel lblFondoLogin = new JLabel("fondo");
		lblFondoLogin.setBackground(new Color(0, 102, 255));
		lblFondoLogin.setIcon(new ImageIcon(Login.class.getResource("/imagenes/luzazul.jpeg")));
		lblFondoLogin.setBounds(0, -2, 803, 701);
		add(lblFondoLogin);
		
	}
}
