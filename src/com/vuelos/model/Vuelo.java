package com.vuelos.model;


import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Vuelos")
public class Vuelo {

    public Vuelo() {
    }
    
    private int id;

    private int aerolinea_id;

    private int tarifa_id_id;

    private int reserva_id;

    private int origen_id; //aeropuerto

    private int destino_id; //aeropuerto

    private Time horario;

    private boolean esItinerario;

    private boolean directo;

    private int tipoVuelo_id; 

    private boolean bol_activo;

    private int estadoVuelo_id;

    private int avion_id;

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

	public int getTarifa_id_id() {
		return tarifa_id_id;
	}

	public void setTarifa_id_id(int tarifa_id_id) {
		this.tarifa_id_id = tarifa_id_id;
	}

	public int getReserva_id() {
		return reserva_id;
	}

	public void setReserva_id(int reserva_id) {
		this.reserva_id = reserva_id;
	}

	public int getOrigen_id() {
		return origen_id;
	}

	public void setOrigen_id(int origen_id) {
		this.origen_id = origen_id;
	}

	public int getDestino_id() {
		return destino_id;
	}

	public void setDestino_id(int destino_id) {
		this.destino_id = destino_id;
	}

	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

	public boolean isEsItinerario() {
		return esItinerario;
	}

	public void setEsItinerario(boolean esItinerario) {
		this.esItinerario = esItinerario;
	}

	public boolean isDirecto() {
		return directo;
	}

	public void setDirecto(boolean directo) {
		this.directo = directo;
	}

	public int getTipoVuelo_id() {
		return tipoVuelo_id;
	}

	public void setTipoVuelo_id(int tipoVuelo_id) {
		this.tipoVuelo_id = tipoVuelo_id;
	}

	public boolean isBol_activo() {
		return bol_activo;
	}

	public void setBol_activo(boolean bol_activo) {
		this.bol_activo = bol_activo;
	}

	public int getEstadoVuelo_id() {
		return estadoVuelo_id;
	}

	public void setEstadoVuelo_id(int estadoVuelo_id) {
		this.estadoVuelo_id = estadoVuelo_id;
	}

	public int getAvion_id() {
		return avion_id;
	}

	public void setAvion_id(int avion) {
		this.avion_id = avion;
	}








}