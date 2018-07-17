package com.vuelos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ciudades")
public class Ciudad {

    public Ciudad() {
    }

    private int id;

    private String nombre;

    private boolean bol_activo;

    @Id
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isBol_activo() {
		return bol_activo;
	}

	public void setBol_activo(boolean bol_activo) {
		this.bol_activo = bol_activo;
	}


}