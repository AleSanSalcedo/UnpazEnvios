package ar.com.unpazenvios.UnpazEnvios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="USUARIOS")
public class Usuario {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="RAZON-SOCIAL")
	private RazonSocial razonSocial;
	@Column(name="QUIT")
	private String quit;
	@Column(name="DNI")
	private String dni;
	@Column(name="CONTRASENA")
	private String contrasena;
	
	public Usuario(long id, String nombre, RazonSocial razonSocial, String quit, String dni, String contrasena) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.quit = quit;
		this.dni = dni;
		this.contrasena = contrasena;
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

	public RazonSocial getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(RazonSocial razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getQuit() {
		return quit;
	}

	public void setQuit(String quit) {
		this.quit = quit;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
}