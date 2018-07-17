package com.vuelos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Asientos")
public class Asiento {

    public Asiento() {
    }

    private boolean libre;

    private int reserva_id;

    private int tipoClase_id;

    private int numero;
    @Id
	@Column(name = "id")
    private int id;

    private int avion_id;

    private boolean bol_activo;

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public int getReserva_id() {
		return reserva_id;
	}

	public void setReserva_id(int reserva_id) {
		this.reserva_id = reserva_id;
	}

	public int getTipoClase_id() {
		return tipoClase_id;
	}

	public void setTipoClase_id(int tipoClase_id) {
		this.tipoClase_id = tipoClase_id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAvion_id() {
		return avion_id;
	}

	public void setAvion_id(int avion_id) {
		this.avion_id = avion_id;
	}

	public boolean isBol_activo() {
		return bol_activo;
	}

	public void setBol_activo(boolean bol_activo) {
		this.bol_activo = bol_activo;
	}





}