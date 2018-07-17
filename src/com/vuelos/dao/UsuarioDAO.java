package com.vuelos.dao;

import java.util.List;

import com.vuelos.model.Usuarios;

public interface UsuarioDao {
	
	public void nuevoUsuario(Usuarios usuario);
	public void editarUsuario(Usuarios usuario);
	public void eliminarUsuario(Usuarios usuario);
	public List<Usuarios> listarUsuarios();


	
}
