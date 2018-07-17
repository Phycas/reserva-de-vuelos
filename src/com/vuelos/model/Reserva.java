package com.vuelos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Reservas")
public class Reserva {

    public Reserva() {
    }

    private int id;
    
    //private Set<Asiento> asientos; //asiento.reserva

    private int costo;

   // private Set<Vuelo> vuelos; //vuelo.reserva

    private int numeroBoleto;

    private int usuario_id;
    @Id
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getNumeroBoleto() {
		return numeroBoleto;
	}

	public void setNumeroBoleto(int numeroBoleto) {
		this.numeroBoleto = numeroBoleto;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}



}