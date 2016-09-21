package br.com.skeleton;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@SequenceGenerator(name = "default_gen", sequenceName = "USER_SEQ", allocationSize = 1)
@AttributeOverride(name = "id", column = @Column(name = "USER_ID"))
public class User extends DefaultEntity {

	@Getter
	@Setter
	private String name;
	
	public User() {
		System.out.println("User object created!");
	}
}
