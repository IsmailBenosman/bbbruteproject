package compte;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("eleve")
@Table(name="Eleve")
public class Eleve  extends Compte{

	private int note;

	public Eleve() {

	}

	public Eleve(Integer id, String nom, String prenom, String login, String password, LocalDate naissance, double solde,
			String maison,int note) {
		super(id, nom, prenom, login, password, naissance, solde, maison);
		this.note = note;
	}

	public Eleve(String nom, String prenom, String login, String password, LocalDate naissance, double solde,
			String maison,int note) {
		super(nom, prenom, login, password, naissance, solde,maison);
		this.note = note;

	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Eleve [note=" + note + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", password=" + password + ", naissance=" + naissance + ", solde=" + solde + ", img=" + img + "]";
	}

}
	
	
	
	
	
	
	



