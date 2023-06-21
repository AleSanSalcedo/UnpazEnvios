package ar.com.unpazenvios.UnpazEnvios.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.unpazenvios.UnpazEnvios.model.RazonSocial;
import ar.com.unpazenvios.UnpazEnvios.model.Usuario;
import ar.com.unpazenvios.UnpazEnvios.repository.UsuarioRepository;

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
	
	@PostMapping("/cargar")
	public Usuario save(@RequestBody Usuario usuario) {
	     return UsuarioRepository.save(usuario);
	}
	
}
