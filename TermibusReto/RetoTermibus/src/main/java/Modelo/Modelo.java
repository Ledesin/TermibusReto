package Modelo;

public class Modelo {
	public Precio_Billetes precio_billetes;
	public GestorBD gestorBD;
	public UsuarioLogin usuariologin;
	
	public Modelo() {
		this.gestorBD = new GestorBD();
		this.usuariologin = new UsuarioLogin();
		
	}

}
