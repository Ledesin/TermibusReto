package Vista;

import javax.swing.JPanel;


public class Vista{
	public Ventana ventana = new Ventana();
	public Bienvenida bienvenida = new Bienvenida();
	public Login login = new Login();
	public PlazasBilletes plazasbilletes = new PlazasBilletes();
	
	public Vista() {
		mostrarPanel(bienvenida);
		ventana.setVisible(true);
	}
	
	public void mostrarPanel(JPanel Bienvenida) {
		ventana.setContentPane(Bienvenida);
	}
}

