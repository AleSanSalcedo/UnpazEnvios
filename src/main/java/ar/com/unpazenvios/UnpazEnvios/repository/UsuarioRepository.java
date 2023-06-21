package ar.com.unpazenvios.UnpazEnvios.repository;

import org.springframework.stereotype.Repository;

import ar.com.unpazenvios.UnpazEnvios.model.Usuario;

@Repository
public interface UsuarioRepository {

	public Usuario save(Usuario usuario);
}
