package com.vuelos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Tarifas")
public class Tarifa {

    public Tarifa() {
    }

    private int id;
    
    private int ciudadOrigen_id; //ciudad

    private int ciudadDestino_id;	//ciudad

    private int valorDirecto;

    private int valorItinerario;

    private boolean bol_activo;
    @Id
   	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCiudadOrigen_id() {
		return ciudadOrigen_id;
	}

	public void setCiudadOrigen_id(int ciudadOrigen_id) {
		this.ciudadOrigen_id = ciudadOrigen_id;
	}

	public int getCiudadDestino_id() {
		return ciudadDestino_id;
	}

	public void setCiudadDestino_id(int ciudadDestino_id) {
		this.ciudadDestino_id = ciudadDestino_id;
	}

	public int getValorDirecto() {
		return valorDirecto;
	}

	public void setValorDirecto(int valorDirecto) {
		this.valorDirecto = valorDirecto;
	}

	public int getValorItinerario() {
		return valorItinerario;
	}

	public void setValorItinerario(int valorItinerario) {
		this.valorItinerario = valorItinerario;
	}

	public boolean isBol_activo() {
		return bol_activo;
	}

	public void setBol_activo(boolean bol_activo) {
		this.bol_activo = bol_activo;
	}

    



}