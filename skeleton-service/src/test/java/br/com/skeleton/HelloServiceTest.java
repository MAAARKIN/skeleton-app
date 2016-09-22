package br.com.skeleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloServiceTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void contextLoads() {
		ResponseEntity<String> entity = this.restTemplate.getForEntity("/hello/marcos", String.class);
		System.out.println(entity.getBody());
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
	
	@Test
	public void addUsuario() {
		User newUser = new User();
		newUser.setName("markin rest");
		ResponseEntity<?> entity = this.restTemplate.postForEntity("/hello", newUser, User.class);
		System.out.println("--------- response body");
		System.out.println(entity.getBody());
		System.out.println("--------- response status code");
		System.out.println(entity.getStatusCode());
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
}
