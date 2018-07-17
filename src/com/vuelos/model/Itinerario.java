package com.vuelos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Itinerarios")
public class Itinerario {

    public Itinerario() {
    }

    private int id;

    private int vuelo_id;

    private int segmento;
    @Id
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVuelo_id() {
		return vuelo_id;
	}

	public void setVuelo_id(int vuelo_id) {
		this.vuelo_id = vuelo_id;
	}

	public int getSegmento() {
		return segmento;
	}

	public void setSegmento(int segmento) {
		this.segmento = segmento;
	}

}