package compte;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import module.Modules;


@Entity
@DiscriminatorValue("eleve")
public class Eleve  extends Compte{
	

  	@OneToMany
	@JoinTable(
			name="bulletins",
			joinColumns = @JoinColumn(name="eleve"),
			inverseJoinColumns = @JoinColumn(name="module")
			)
	private List<Modules> mesCours;


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

}
	
	
	
	
	
	
	



