package Model;

import java.util.*;

public class Usuario {

    public Usuario() {
    }

    private int id;

    private String rut;

    private String nombre;

    private String clave;

    private int tarjeta;

    private int fechaExpira;

    private Set<Reserva> reservas; //reserva.usuario

    private DateTime fechaNacimiento;

    private DateTime fecha_Registro;

    private boolean clienteFrecuente;

    private boolean bol_activo;

}