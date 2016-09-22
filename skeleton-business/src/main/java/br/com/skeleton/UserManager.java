package br.com.skeleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager {

	@Autowired
	private UserRepository usuarios;

	public void salvar(User usuario) {
		// regra de negocio

		usuarios.save(usuario);
	}
}
