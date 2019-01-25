package Modelo;

public class Modelo {
	public Precio_Billetes precio_billetes;
	public GestorBD gestorBD;
	public Linea linea;
<<<<<<< HEAD
	public Hash hash;
=======
	public Pagar pagar;
>>>>>>> 32b102346dfbcabb9a5229fd3272f8d69728c197
	
	
	public Modelo() {
		this.gestorBD = new GestorBD();
		this.linea = new Linea();
		this.hash = new Hash();

	}
}
