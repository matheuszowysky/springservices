package br.edu.zowysky.ShowCars.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	
	@Column(length = 50, nullable = false)
	private String tipo;
	
	@Column(nullable = false)
	private String descrição;

	
	
	
	

}
