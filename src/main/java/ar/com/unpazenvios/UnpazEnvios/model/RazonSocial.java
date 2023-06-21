package ar.com.unpazenvios.UnpazEnvios.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Table(name="RAZONES-SOCIALES")
public class RazonSocial {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="RAZON-SOCIAL")
	private String razonSocial;
	
	public RazonSocial(long id, String razonSocial) {
		super();
		this.id = id;
		this.razonSocial = razonSocial;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
}
