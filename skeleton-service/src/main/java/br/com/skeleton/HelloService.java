package br.com.skeleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloService {
	
	@Autowired private UserManager userManager;
	@Autowired private UserRepository usuarios;

	@RequestMapping("/{name}")
	public ResponseEntity<?> hello(@PathVariable String name) {
		System.out.println("GET Invoked!");
		User user = new User();
		user.setName(name);
		System.out.println(usuarios.count());
		return new ResponseEntity<>("Hello: " + user.getName(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void post(@RequestBody User user) {
		// TODO: Implementation for HTTP POST request
		System.out.println("POST invoked");
		System.out.println(user.getName());
		userManager.salvar(user); //redireciona para o business
		System.out.println(usuarios.count());
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
