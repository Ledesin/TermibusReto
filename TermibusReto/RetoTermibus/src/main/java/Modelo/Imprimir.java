package Modelo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Imprimir {
	public void Imprimir() {
	try {
		FileOutputStream os = new FileOutputStream("nombre_archivo.txt");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 
}
}
