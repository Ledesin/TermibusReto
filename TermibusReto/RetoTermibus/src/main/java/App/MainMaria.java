package App;

import Controlador.ControladorMaria;
import Modelo.Modelo;
import Vista.Vista;

public class MainMaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		
		ControladorMaria controlador_Maria = new ControladorMaria(modelo, vista);
	}

}
