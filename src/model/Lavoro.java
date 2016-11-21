package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lavoro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLavoro;

}
