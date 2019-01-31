package Modelo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pagar {

	public static String Vueltas(Double cantidad, Double precio) {
		double precioIntroducido = 0.0;
		double importeRestante = 0.0;
		boolean pagado = false;
		double devolucion;

		String texto = "";
		devolucion = cantidad - precio;
		System.out.println(devolucion);
		int billete200 = 0, billete100 = 0, billete50 = 0, billete20 = 0, billete10 = 0, billete5 = 0, moneda2e = 0,
				moneda1e = 0, moneda50cent = 0, moneda20cent = 0, moneda10cent = 0, moneda5cent = 0, moneda2cent = 0,
				moneda1cent = 0;
		while (devolucion != 0) // Mientras el dinero a devolver no sea 0 calculará los billetes y monedas a
								// devolver
		{

			PrintStream textArea = null;
			if (devolucion >= 200) // Si el dinero a devolver es mayor o igual a 200 le devolverá un billete de
									// 200, y así con todas las monedas y billetes
			{
				devolucion = devolucion - 200;
				billete200 = billete200 + 1;
				texto += billete200 + "  x Billetes de 200\n";

			} else if (devolucion < 200 && devolucion >= 100) {
				devolucion = devolucion - 100;
				billete100 = billete100 + 1;
				texto += billete100 + "  x Billetes de 100\n";
			} else if (devolucion < 100 && devolucion >= 50) {
				devolucion = devolucion - 50;
				billete50 = billete50 + 1;
				texto += billete50 + "  x Billetes de 50\n";
			} else if (devolucion < 50 && devolucion >= 20) {
				devolucion = devolucion - 20;
				billete20 = billete20 + 1;
				texto += billete20 + "  x Billetes de 20\n";
			} else if (devolucion < 20 && devolucion >= 10) {
				devolucion = devolucion - 10;
				billete10 = billete10 + 1;
				texto += billete10 + "  x Billetes de 10\n";
			} else if (devolucion < 10 && devolucion >= 5) {
				devolucion = devolucion - 5;
				billete5 = billete5 + 1;
				texto += billete5 + "  x Billetes de 5\n";
			} else if (devolucion < 5 && devolucion >= 2) {
				devolucion = devolucion - 2;
				moneda2e = moneda2e + 1;
				texto += moneda2e + "  x Monedas de 2\n";
			} else if (devolucion < 2 && devolucion >= 1) {
				devolucion = devolucion - 1;
				moneda1e = moneda1e + 1;
				texto += moneda1e + "  x Monedas de 1\n";
			} else if (devolucion < 1 && devolucion >= 0.5) {
				devolucion = devolucion - 0.5;
				moneda50cent = moneda50cent + 1;
				texto += moneda50cent + "  x Monedas de 0.50\n";
			} else if (devolucion < 0.5 && devolucion >= 0.2) {
				devolucion = devolucion - 0.2;
				moneda20cent = moneda20cent + 1;
				texto += moneda20cent + "  x Monedas de 0.20\n";
			} else if (devolucion < 0.2 && devolucion >= 0.1) {
				devolucion = devolucion - 0.1;
				moneda10cent = moneda10cent + 1;
				texto += moneda10cent + "  x Monedas de 0.10\n";
			} else if (devolucion < 0.1 && devolucion >= 0.05) {
				devolucion = devolucion - 0.05;
				moneda5cent = moneda5cent + 1;
				texto += moneda5cent + "  x Monedas de 0.05\n";
			} else if (devolucion < 0.05 && devolucion >= 0.02) {
				devolucion = devolucion - 0.02;
				moneda2cent = moneda2cent + 1;
				texto += moneda2cent + "  x Monedas de 0.02\n";
			} else if (devolucion < 0.02 && devolucion >= 0.01) {
				devolucion = devolucion - 0.01;
				moneda1cent = moneda1cent + 1;
				textArea.append(moneda1cent + "  x Monedas de 0.01\n");
			} else // Si no se cumple ninguna condición y devolución es mayor o igual que 0.009
					// convertirá el dinero a devolver a 1 céntimo
			{
				if (devolucion >= 0.009) {
					devolucion = 0.01;
					devolucion = devolucion - 0.01;
					moneda1cent = moneda1cent + 1;
				} else // Si es emnor que 0.009 saldrá del bucle ignorando el resto de decimales
				{
					break;
				}

			}
		}
		return texto;
	}

	public void Imprimir() {

		try {
			// ruta relativa- buscar dónde deja el fichero
			// FileWriter fich = new FileWriter(".\\log.txt");

			// ruta absoluta - ¿qué pasa si no existe el directorio?
			// FileWriter fich = new FileWriter("C:\\temporal2\\log.txt");

			// nos aseguramos de que existe el directorio, si no es así
			// lo creamos
			Path path = Paths.get("c:\\TemporalReto");

			if (!Files.exists(path))
				Files.createDirectory(path);

			// Para abrir el fichero sobreescribiendo
			FileWriter fich = new FileWriter("C:\\TemporalReto\\log.txt");

			// Para abrir el fichero y añadir al final del mismo
			// FileWriter fich = new FileWriter("C:\\TemporalReto\\log.txt",true);

			// ¿Qué pasa si ejecutamos dos veces seguida el mismo programa
			// Esto es: ¿Se añaden nuevas líneas?
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Calendar cal = Calendar.getInstance();

			fich.write("Escribir ejecutado " + dateFormat.format(cal.getTime()) + "\r\n");

			fich.close();

		} catch (IOException ex) {
			// ex.getMessage()

			System.err.println("No se puede escribir en el archivo porque  "
					+ "no existe y no puede ser creado o no puede ser abierto o es un directorio");
			System.exit(-1);
		}

	}

}
