package ar.com.unpazenvios.UnpazEnvios.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.unpazenvios.UnpazEnvios.model.RazonSocial;
import ar.com.unpazenvios.UnpazEnvios.model.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@GetMapping("/prueba")
	public Usuario getUsuario() {
		long id = 1;
		RazonSocial guts = new RazonSocial(id,"berserk");
		Usuario ale = new Usuario(id, "ale", guts, "cuit","dni", "password");
		return ale;
	}
	
}
