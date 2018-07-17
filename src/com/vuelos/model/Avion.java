package com.vuelos.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "Aviones")
public class Avion {

    public Avion() {
    }

    private int id;
    
    private int aerolinea_id;

    private String modelo;

    private int capacidad;

    private int numeroAsientos;

    private boolean bol_activo;

    private Set<Asiento> asientos; //asiento.avion
    @Id
    @Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAerolinea_id() {
		return aerolinea_id;
	}

	public void setAerolinea_id(int aerolinea_id) {
		this.aerolinea_id = aerolinea_id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	public boolean isBol_activo() {
		return bol_activo;
	}

	public void setBol_activo(boolean bol_activo) {
		this.bol_activo = bol_activo;
	}

	@Transient
	public Set<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(Set<Asiento> asientos) {
		this.asientos = asientos;
	}




}