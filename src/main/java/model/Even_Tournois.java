package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Even_Tournois extends Evenement{

	@OneToMany
	private List<Eleve> participant;
	
}
