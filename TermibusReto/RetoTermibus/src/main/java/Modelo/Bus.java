package Modelo;

public class Bus {
	private String cod_linea;
	private int cod_Bus;
	private int n_plazas;
	private float consumo_km;
	private String color;


	public Bus(String cod_linea, int cod_Bus, int n_plazas, float consumo_km, String color) {
		this.cod_linea = cod_linea;
		this.cod_Bus = cod_Bus;
		this.n_plazas = n_plazas;
		this.consumo_km = consumo_km;
		this.color = color;
	}

	public int getcod_Bus() {
		return cod_Bus;
	}

}