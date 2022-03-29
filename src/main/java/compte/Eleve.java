package compte;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import even.Even_Bal;
import even.Even_Banquet;
import even.Even_Tournois;
import module.Modules;


@Entity
@DiscriminatorValue("eleve")
@Table(name = "eleve")
public class Eleve  extends Compte{
	

  	@OneToMany(mappedBy = "eleve", fetch = FetchType.EAGER)
	private List<Modules> mesCours;

  	@JoinColumn(name="participant")
  	@ManyToOne
  	private Even_Tournois tournoi;
	
  	@JoinColumn(name="participant")
  	@ManyToOne
  	private Even_Bal bal;
  	
  	@JoinColumn(name="participant")
  	@ManyToOne
  	private Even_Banquet banquet;
  	public Eleve() {

	}
	public Eleve(Integer id, String nom, String prenom, String login, String password, LocalDate naissance, double solde,
			String maison) {
		super(id, nom, prenom, login, password, naissance, solde, maison);
	
	}

	public Eleve(String nom, String prenom, String login, String password, LocalDate naissance, double solde,
			String maison) {
		super(nom, prenom, login, password, naissance, solde, maison);
	
	}
	
	public List<Modules> getMesCours() {
		return mesCours;
	}
	public void setMesCours(List<Modules> mesCours) {
		this.mesCours = mesCours;
	}
	@Override
	public String toString() {
		return "Eleve [mesCours=" + mesCours + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", password=" + password + ", naissance=" + naissance + ", solde=" + solde + ", img=" + img + "]";
	}
	
	public String getIdentite() {
		return nom+ " "+prenom;
	}

}
	
	
	
	
	
	
	



