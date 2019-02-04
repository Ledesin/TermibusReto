package Modelo;

import java.sql.Date;
import java.sql.Time;

public class Billete {

	private int cod_Billete;
	private int n_Trayecto;
	private String cod_Linea;
	private int cod_Bus;
	private int cod_ParadaInicio;
	private int cod_ParadaFin;
	private Date fecha;
	private Time hora;
	private String dni;
	private float precio;
	
	
	public Billete() {
		
	}

	public int getcod_Billete() {
		return cod_Billete;
	}


	public void setcod_Billete(int cod_Billete) {
		this.cod_Billete = cod_Billete;
	}


	public int getn_Trayecto() {
		return n_Trayecto;
	}


	public void setn_Trayecto(int n_Trayecto) {
		this.n_Trayecto = n_Trayecto;
	}


	public String getcod_Linea() {
		return cod_Linea;
	}


	public void setcod_Linea(String cod_Linea) {
		this.cod_Linea = cod_Linea;
	}


	public int getcod_Bus() {
		return cod_Bus;
	}


	public void setcod_Bus(int cod_Bus) {
		this.cod_Bus = cod_Bus;
	}


	public int getcod_ParadaInicio() {
		return cod_ParadaInicio;
	}


	public void setcod_ParadaInicio(int cod_ParadaInicio) {
		this.cod_ParadaInicio = cod_ParadaInicio;
	}


	public int getcod_ParadaFin() {
		return cod_ParadaFin;
	}


	public void setcod_ParadaFin(int cod_ParadaFin) {
		this.cod_ParadaFin = cod_ParadaFin;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Time getHora() {
		return hora;
	}


	public void setHora(Time hora) {
		this.hora = hora;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String logindni) {
		this.dni = logindni;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
	