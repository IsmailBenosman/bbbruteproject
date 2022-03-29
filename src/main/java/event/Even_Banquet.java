package event;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import compte.Eleve;

@Entity
@Table(name="banquet")
public class Even_Banquet extends Evenement{

	@OneToMany(mappedBy="banquet")
	private List <Eleve> invite;
	
	public Even_Banquet() {}

	public Even_Banquet(String nomEven, LocalDate date, LocalTime heure,List<Eleve> invite) {
		super(nomEven,date,heure);
		this.invite = invite;
	}

	public List<Eleve> getInvite() {
		return invite;
	}

	public void setInvite(List<Eleve> invite) {
		this.invite = invite;
	}
}