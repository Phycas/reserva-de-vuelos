package com.vuelos.model;
// Generated 17-Jul-2018 15:04:21 by Hibernate Tools 5.1.7.Final

/**
 * Estadovuelos generated by hbm2java
 */
public class Estadovuelos implements java.io.Serializable {

	private int id;
	private String nombre;

	public Estadovuelos() {
	}

	public Estadovuelos(int id) {
		this.id = id;
	}

	public Estadovuelos(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
