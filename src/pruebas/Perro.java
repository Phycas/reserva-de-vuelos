package pruebas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Perros")
public class Perro {
	int id;
	String nombre;
	int edad;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Id
	@Column(name = "id_perro")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
