package com.vuelos.model;
// Generated 17-Jul-2018 15:04:21 by Hibernate Tools 5.1.7.Final

/**
 * Tipoclase generated by hbm2java
 */
public class Tipoclase implements java.io.Serializable {

	private int id;
	private String nombre;

	public Tipoclase() {
	}

	public Tipoclase(int id) {
		this.id = id;
	}

	public Tipoclase(int id, String nombre) {
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
