package com.vuelos.dao;

import java.util.List;

import com.vuelos.model.Vuelos;

public interface VuelosDao {

	public void nuevo(Vuelos vuelo);
	public void editar(Vuelos vuelo);
	public void eliminar(Vuelos vuelo);
	public List<Vuelos> listarVuelos();
	
}
