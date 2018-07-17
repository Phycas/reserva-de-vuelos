package com.vuelos.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.vuelos.model.Usuario;
import com.vuelos.model.Vuelo;
import com.vuelos.util.HibernateUtil;

public class UsuarioDAO {

private Usuario usuario;
private Usuario nUsuario;
private List <Usuario> DAOtodos;

public void registrarUsuario(Usuario nu){
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	try {
		 nu.setClienteFrecuente(false);
		 nu.setFecha_Registro(new Date());
		 nu.setBol_activo(true);
		 session.beginTransaction();
		 session.merge(nu);
		 session.flush();
	     session.getTransaction().commit();
	} catch (Exception ex) {
		ex.printStackTrace();
		session.getTransaction().rollback();
	}
	session.close();
}
	
}
