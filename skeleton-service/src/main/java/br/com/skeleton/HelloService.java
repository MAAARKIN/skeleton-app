package br.com.skeleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloService {
	
	@Autowired
	private UserManager userManager;

	@RequestMapping("/{name}")
	public String hello(@PathVariable String name) {
		System.out.println("GET Invoked!");
		User user = new User();
		user.setName(name);
		return "Hello: " + user.getName();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void post() {
		// TODO: Implementation for HTTP POST request
		//falta receber o usuario no post.
//		userManager.salvar(usuario); //redireciona para o business
		System.out.println("POST invoked");
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void put() {
		// TODO: Implementation for HTTP PUT request
		System.out.println("PUT invoked");
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void delete() {
		// TODO: Implementation for HTTP DELETE request
		System.out.println("DELETE invoked");
	}
}
