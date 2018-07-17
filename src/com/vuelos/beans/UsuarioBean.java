package com.vuelos.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.vuelos.dao.UsuarioDAO;
import com.vuelos.model.Usuario;

@ManagedBean(name = "usuarioBean")
@ViewScoped
public class UsuarioBean implements Serializable{
	
	private List <Usuario> listaUsuarios;
	private List <Usuario> listaBusqueda;
	Usuario usuario = new Usuario();
	Usuario nusuario = new Usuario();
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public void registrarUsuario() {
		usuarioDAO.registrarUsuario(nusuario);
		nusuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getNusuario() {
		return nusuario;
	}

	public void setNusuario(Usuario nusuario) {
		this.nusuario = nusuario;
	}

}
