package even;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import compte.Eleve;

@Entity
public class Even_Tournois extends Evenement{

	@OneToMany
	private List<Eleve> participant;
	
}
