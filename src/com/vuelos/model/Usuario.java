package com.vuelos.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuarios")
public class Usuario {

    public Usuario() {
    }
    
    public Usuario(String nombre) {
    	this.nombre = nombre;
    }

    private int id;

    private String rut;

    private String nombre;

    private String clave;

    private int tarjeta;

    private int fechaExpira;

   // private Set<Reserva> reservas; //reserva.usuario

    private Date fechaNacimiento;

    private Date fecha_Registro;

    private boolean clienteFrecuente;

    private boolean bol_activo;
    @Id
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(int tarjeta) {
		this.tarjeta = tarjeta;
	}

	public int getFechaExpira() {
		return fechaExpira;
	}

	public void setFechaExpira(int fechaExpira) {
		this.fechaExpira = fechaExpira;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFecha_Registro() {
		return fecha_Registro;
	}

	public void setFecha_Registro(Date fecha_Registro) {
		this.fecha_Registro = fecha_Registro;
	}

	public boolean isClienteFrecuente() {
		return clienteFrecuente;
	}

	public void setClienteFrecuente(boolean clienteFrecuente) {
		this.clienteFrecuente = clienteFrecuente;
	}

	public boolean isBol_activo() {
		return bol_activo;
	}

	public void setBol_activo(boolean bol_activo) {
		this.bol_activo = bol_activo;
	}

}