package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCliente;
	
	@Column(unique = true, nullable = false)
	private String nome;
	@Column(unique = true, nullable = false)
	private String cognome;
	
	
	
	

}
