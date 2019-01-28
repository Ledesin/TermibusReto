package Modelo;

public class Billete {

	private int numBillete;
	private String fecha;
	private String linea;
	private String origen;
	private String destino;
	private int codAutobus;
	private int precio;
	
	
	public Billete() {
		
	}


	public int getNumBillete() {
		return numBillete;
	}


	public void setNumBillete(int numBillete) {
		this.numBillete = numBillete;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getLinea() {
		return linea;
	}


	public void setLinea(String linea) {
		this.linea = linea;
	}



	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public int getCodAutobus() {
		return codAutobus;
	}


	public void setCodAutobus(int codAutobus) {
		this.codAutobus = codAutobus;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
