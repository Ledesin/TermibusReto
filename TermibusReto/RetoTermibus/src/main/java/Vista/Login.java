package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Login extends JPanel {
	private JTextField textFieldDNI;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldFecha_nac;
	private JPasswordField passwordFieldCrearPass;
	private JLabel lblDNI;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblFecha_nac;
	private JLabel lblSexo;
	private JLabel lblCrearPass;
	private JTextField textFieldLoginDNI;
	private JTextField textFieldLoginPass;
	public JButton btnLogin;
	public JButton btnRegistro;
	private JLabel lblLoginDNI;
	private JLabel lblPasswordLogin;
	private JLabel lblNewLabel;
	private JLabel lblLogin;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(41, 67, 86, 20);
		add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(166, 67, 86, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setBounds(296, 67, 86, 20);
		add(textFieldApellidos);
		textFieldApellidos.setColumns(10);
		
		textFieldFecha_nac = new JTextField();
		textFieldFecha_nac.setBounds(41, 114, 86, 20);
		add(textFieldFecha_nac);
		textFieldFecha_nac.setColumns(10);
		
		ButtonGroup grupo = new ButtonGroup();		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setBackground(new Color(34, 113, 179));
		rdbtnHombre.setBounds(166, 113, 86, 23);
		add(rdbtnHombre);		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBackground(new Color(34, 113, 179));
		rdbtnMujer.setBounds(166, 139, 86, 23);
		add(rdbtnMujer);		
		grupo.add(rdbtnHombre);
		grupo.add(rdbtnMujer);
		
		passwordFieldCrearPass = new JPasswordField();
		passwordFieldCrearPass.setBounds(296, 114, 86, 20);
		add(passwordFieldCrearPass);
		
		lblDNI = new JLabel("DNI:");
		lblDNI.setBounds(41, 53, 46, 14);
		add(lblDNI);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(166, 53, 46, 14);
		add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(296, 53, 46, 14);
		add(lblApellidos);
		
		lblFecha_nac = new JLabel("Fecha Nac.:");
		lblFecha_nac.setBounds(41, 98, 59, 14);
		add(lblFecha_nac);
		
		lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(166, 98, 46, 14);
		add(lblSexo);
		
		lblCrearPass = new JLabel("Password:");
		lblCrearPass.setBounds(296, 98, 66, 14);
		add(lblCrearPass);
		
		textFieldLoginDNI = new JTextField();
		textFieldLoginDNI.setBounds(41, 231, 86, 20);
		add(textFieldLoginDNI);
		textFieldLoginDNI.setColumns(10);
		
		textFieldLoginPass = new JTextField();
		textFieldLoginPass.setBounds(166, 231, 86, 20);
		add(textFieldLoginPass);
		textFieldLoginPass.setColumns(10);
		
		btnRegistro = new JButton("Registrar");
		btnRegistro.setBackground(Color.GRAY);
		btnRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistro.setBounds(293, 159, 89, 23);
		add(btnRegistro);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBackground(Color.GRAY);
		btnLogin.setBounds(293, 230, 89, 23);
		add(btnLogin);
		
		lblLoginDNI = new JLabel("Usuario (DNI):");
		lblLoginDNI.setBounds(41, 217, 86, 14);
		add(lblLoginDNI);
		
		lblPasswordLogin = new JLabel("Password:");
		lblPasswordLogin.setBounds(166, 217, 66, 14);
		add(lblPasswordLogin);
		
		lblNewLabel = new JLabel("REGISTRO DE NUEVO USUARIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(117, 11, 197, 31);
		add(lblNewLabel);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLogin.setBounds(186, 185, 66, 18);
		add(lblLogin);
		
		JLabel lblFondoLogin = new JLabel("fondo");
		lblFondoLogin.setBackground(new Color(0, 102, 255));
		lblFondoLogin.setIcon(new ImageIcon(Login.class.getResource("/imagenes/luzazul.jpeg")));
		lblFondoLogin.setBounds(10, 11, 440, 289);
		add(lblFondoLogin);

		
	}
}
