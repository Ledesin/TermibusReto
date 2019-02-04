package Modelo;

public class Parada {
	private int cod_parada;
	private String nombre;
	private String calle;
	private float latitud;
	private float longitud;
	
	
	public Parada(int cod_parada,String nombre, String calle, float latitud, float longitud) {
		this.cod_parada=cod_parada;
		this.nombre=nombre;
		this.calle = calle;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	/*public Parada (int cod_parada, String nombre) {
		this.cod_parada = cod_parada;
		this.nombre = nombre;
	}*/

	public int getcod_parada() {
		return cod_parada;
	}
	
	public String getNombre() {
		return nombre;
	}	
	
	public String getcalle() {
		return calle;
	}
	
	public float getlatitud() {
		return latitud;
	}
	
	public float getlongitud() {
		return longitud;
	}
}