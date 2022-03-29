package boutique;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import produit.Produit;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Boutique {

	public Boutique(Integer id, String nom, String adresse, Produit produit) {
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	protected String nom;
	protected String adresse;
	
	@OneToMany(mappedBy="produit")
	protected List<Produit> produit;
	
	public Boutique() {}
	
	public Boutique(Integer id, String nom, String adresse) {
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
}
