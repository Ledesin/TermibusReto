package Modelo;

public class Modelo {
	public Precio_Billetes precio_billetes;
	public GestorBD gestorBD;
	public Linea linea;
	public Pagar pagar;

	
	
	public Modelo() {
		this.gestorBD = new GestorBD();
		
	}
}
