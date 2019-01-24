package App;

import Controlador.controlador_fatima;
import Modelo.Modelo;
import Vista.Vista;

public class MainFatima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		
		controlador_fatima controlador_fatima = new controlador_fatima(modelo, vista);
		
		
		

	}

}
