package ar.com.unpazenvios.UnpazEnvios.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.com.unpazenvios.UnpazEnvios.model.Usuario;

@Repository
@Transactional
public class UsuarioRepository{

	
	public static Usuario save(Usuario usuario) {
		return usuario;
	}

}
