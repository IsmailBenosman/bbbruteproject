package even;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import compte.Eleve;

@Entity
@DiscriminatorValue("bal")
public class Even_Bal extends Evenement{

	@OneToMany(mappedBy="bal")
	private List <Eleve> invite;
	
	public Even_Bal() {}

	public Even_Bal(String nomEven, LocalDate date, LocalTime heure,List<Eleve> invite) {
		super(nomEven,date,heure);
		this.invite = invite;
	}

	public List<Eleve> getInvite() {
		return invite;
	}

	public void setInvite(List<Eleve> invite) {
		this.invite = invite;
	}

	@Override
	public String toString() {
		return "Even_Bal [invite=" + invite + "]";
	}
}
