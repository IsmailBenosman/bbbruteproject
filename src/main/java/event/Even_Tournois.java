package event;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import compte.Eleve;

@Entity
@Table(name="tournoi")
public class Even_Tournois extends Evenement{

	@OneToMany(mappedBy="tournoi")
	private List<Eleve> participant;
	
	public Even_Tournois() {}

	public Even_Tournois(String nomEven, LocalDate date, LocalTime heure,List<Eleve> participant) {
		super(nomEven,date,heure);
		this.participant = participant;
	}

	public List<Eleve> getParticipant() {
		return participant;
	}

	public void setParticipant(List<Eleve> participant) {
		this.participant = participant;
	}
}