package br.com.skeleton;

import lombok.Getter;
import lombok.Setter;

public class User {

	@Getter
	@Setter
	private String name;
	
	public User() {
		System.out.println("User object created!");
	}
}
