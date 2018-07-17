package com.vuelos.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Aeropuertos")
public class Aeropuerto {

    public Aeropuerto() {
    }

    private int id;

    private String nombre;

    private int ciudad;

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

	public int getCiudad() {
		return ciudad;
	}

	public void setCiudad(int ciudad) {
		this.ciudad = ciudad;
	}

	public boolean isBol_activo() {
		return bol_activo;
	}

	public void setBol_activo(boolean bol_activo) {
		this.bol_activo = bol_activo;
	}
}