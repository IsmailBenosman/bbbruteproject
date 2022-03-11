package compte;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("eleve")
@Table(name="Eleve")
public class Eleve  extends Compte{

public Eleve() {

}

	public Eleve(Integer id, String nom, String prenom, String login, String password, LocalDate naissance, double solde,
		String maison) {
	super(id, nom, prenom, login, password, naissance, solde, maison);
}

	public Eleve(String nom, String prenom, String login, String password, LocalDate naissance, double solde,
			String maison) {
		super(nom, prenom, login, password, naissance, solde,maison);

	}

	@Override
	public String toString() {
		return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password=" + password
				+ ", naissance=" + naissance + ", solde=" + solde + "]";
	}
	
	





	}
	
	
	
	
	
	
	



