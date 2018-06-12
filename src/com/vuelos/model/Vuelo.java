package com.vuelos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vuelos")
public class Vuelo implements Serializable{
	
	private int id;
	private String horario;
	private String origen, destino;
	private boolean aTiempo, esDirecto;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public boolean isaTiempo() {
		return aTiempo;
	}
	public void setaTiempo(boolean aTiempo) {
		this.aTiempo = aTiempo;
	}
	public boolean isEsDirecto() {
		return esDirecto;
	}
	public void setEsDirecto(boolean esDirecto) {
		this.esDirecto = esDirecto;
	}
	

}
