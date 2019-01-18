package App;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		
		Controlador controlador = new Controlador(modelo, vista);
	}

}
