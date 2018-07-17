package com.vuelos.util;

import org.hibernate.Session;

import com.vuelos.model.Vuelo;

public class generarVuelos {
	
	public static void main( String[] args )
    {
        System.out.println("Insertando Registro");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Vuelo vuelo = new Vuelo();
        vuelo.setId(1);
        session.save(vuelo);
        session.getTransaction().commit();
    }

}
