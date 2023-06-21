package ar.com.unpazenvios.UnpazEnvios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
public class Producto {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nombre;
	private String marca;
	
	
	public Producto(long id, String nombre, String marca) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
