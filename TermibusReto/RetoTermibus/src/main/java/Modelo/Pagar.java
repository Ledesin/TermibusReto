package Modelo;

import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.AbstractButton;


public class Pagar {
	
	double precioIntroducido = 0.0;
	double importeRestante = 0.0;
	boolean pagado = false;
	double devolucion;
	//double precioFinal;
	//public JTextField cantidadpago;
	//public JLabel lblHaIntroducido;
	
	public void Pagar(double precioFinal, JTextPane textPane, JLabel lblrestantePorIntroducir, JTextField cantidadpago, JPanel contentPane) {
		JLabel lbldineroSobrante = new JLabel();
		//JLabel lblrestantePorIntroducir = new JLabel();, JLabel lblHaIntroducido
		
			// Importe introducido por el usuario
			/*precioIntroducido = Double.parseDouble(cantidadpago.getText());
			System.out.println("Ha introducido: " + precioIntroducido);
			lblHaIntroducido = new JLabel("Ha introducido : " + precioIntroducido);
			lblHaIntroducido.setBounds(31, 92, 131, 14);
			contentPane.add(lblHaIntroducido);
			
			
			
			precioIntroducido = Double.parseDouble(cantidadpago.getText());
			System.out.println("Ha introducido: " + precioIntroducido);
			lblHaIntroducido = new JLabel("Ha introducido : " + precioIntroducido);
			lblHaIntroducido.setBounds(31, 92, 131, 14);
			contentPane.add(lblHaIntroducido);
			*/
			// Importe restante que debe introducir el usuario
			importeRestante = precioIntroducido - precioFinal;
			if (precioIntroducido < precioFinal) {
				importeRestante = importeRestante * -1;
			}
			lblrestantePorIntroducir.setText("Le falta por introducir: " + importeRestante + " . Introduzca una cantidad superior");
			lblrestantePorIntroducir.setBounds(31, 107, 380, 14);
			contentPane.add(lblrestantePorIntroducir);
			lblrestantePorIntroducir.setVisible(false);				

	
	
		// Aqui se le mostrara al Usuario el dinero que le sobra
	
	
		
	
	
	if (precioIntroducido < precioFinal) {
		lblrestantePorIntroducir.setVisible(true);
	}
	
	else {
		lbldineroSobrante.setVisible(true);
		if (precioIntroducido > precioFinal) {
			devolucion = importeRestante;
			int billete200=0, billete100=0, billete50=0, billete20=0, billete10=0, billete5=0, moneda2e=0, moneda1e=0, moneda50cent=0, moneda20cent=0, moneda10cent=0, moneda5cent=0, moneda2cent=0, moneda1cent=0;
			while (devolucion != 0) //Mientras el dinero a devolver no sea 0 calculará los billetes y monedas a devolver
			{
				
				PrintStream textArea = null;
				if (devolucion>=200) //Si el dinero a devolver es mayor o igual a 200 le devolverá un billete de 200, y así con todas las monedas y billetes
				{
					devolucion = devolucion - 200;
					billete200 = billete200 + 1;
					textArea.append(billete200 + "  x Billetes de 200\n");
					
				}	
				else if (devolucion < 200 && devolucion >= 100)
				{
					devolucion = devolucion - 100;
					billete100 = billete100 + 1;
					textArea.append(billete100 + "  x Billetes de 100\n");
				}
				else if (devolucion < 100 && devolucion >= 50)
				{
					devolucion = devolucion - 50;
					billete50 = billete50 + 1;
					textArea.append(billete50 + "  x Billetes de 50\n");
				}
				else if (devolucion < 50 && devolucion >= 20)
				{
					devolucion = devolucion - 20;
					billete20 = billete20 + 1;
					textArea.append(billete20 + "  x Billetes de 20\n");
				}
				else if (devolucion < 20 && devolucion >= 10)
				{
					devolucion = devolucion - 10;
					billete10 = billete10 + 1;
					textArea.append(billete10 + "  x Billetes de 10\n");
				}
				else if (devolucion < 10 && devolucion >= 5)
				{
					devolucion = devolucion - 5;
					billete5 = billete5 + 1;
					textArea.append(billete5 + "  x Billetes de 5\n");
				}
				else if (devolucion < 5 && devolucion >= 2)
				{
					devolucion = devolucion - 2;
					moneda2e = moneda2e + 1;
					textArea.append(moneda2e + "  x Monedas de 2\n");
				}
				else if (devolucion < 2 && devolucion >= 1)
				{
					devolucion = devolucion - 1;
					moneda1e = moneda1e + 1;
					textArea.append(moneda1e + "  x Monedas de 1\n");
				}
				else if (devolucion < 1 && devolucion >= 0.5)
				{
					devolucion = devolucion - 0.5;
					moneda50cent = moneda50cent + 1;
					textArea.append(moneda50cent + "  x Monedas de 0.50\n");
				}
				else if (devolucion < 0.5 && devolucion >= 0.2)
				{
					devolucion = devolucion - 0.2;
					moneda20cent = moneda20cent + 1;
					textArea.append(moneda20cent + "  x Monedas de 0.20\n");
				}
				else if (devolucion < 0.2 && devolucion >= 0.1)
				{
					devolucion = devolucion - 0.1;
					moneda10cent = moneda10cent + 1;
					textArea.append(moneda10cent + "  x Monedas de 0.10\n");
				}
				else if (devolucion < 0.1 && devolucion >= 0.05)
				{
					devolucion = devolucion - 0.05;
					moneda5cent = moneda5cent + 1;
					textArea.append(moneda5cent + "  x Monedas de 0.05\n");
				}
				else if (devolucion < 0.05 && devolucion >= 0.02)
				{
					devolucion = devolucion - 0.02;
					moneda2cent = moneda2cent + 1;
					textArea.append(moneda2cent + "  x Monedas de 0.02\n");
				}
				else if (devolucion < 0.02 && devolucion >= 0.01)
				{
					devolucion = devolucion - 0.01;
					moneda1cent = moneda1cent + 1;
					textArea.append(moneda1cent + "  x Monedas de 0.01\n");
				}
				else //Si no se cumple ninguna condición y devolución es mayor o igual que 0.009 convertirá el dinero a devolver a 1 céntimo
				{
					if (devolucion >= 0.009)
					{
						devolucion = 0.01;
						devolucion = devolucion-0.01;
						moneda1cent = moneda1cent + 1;
					}
					else //Si es emnor que 0.009 saldrá del bucle ignorando el resto de decimales
					{
						break;
					}
					
				}
			}
			//Aqui se imprimiran los billetes que hay que devolver de cada
			
		
		}

	

	}

}
	
	
	public double getImporteRestante() {
		return this.importeRestante;
	}
	
}