package Modelo;

public class Modelo {
	public Precio_Billetes precio_billetes;
	public GestorBD gestorBD;
	public Linea linea;
	public Hash hash;
	
	
	public Modelo() {
		this.gestorBD = new GestorBD();
		this.linea = new Linea();
		this.hash = new Hash();

	}
}
