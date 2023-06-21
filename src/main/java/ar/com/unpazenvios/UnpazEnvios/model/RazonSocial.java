package ar.com.unpazenvios.UnpazEnvios.model;

import lombok.Data;

@Data

public class RazonSocial {

	private long id;
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
