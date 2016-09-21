package br.com.skeleton;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public class DefaultEntity {

	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default_gen")
	@Getter
	@Setter
	private Long id;
	
}
