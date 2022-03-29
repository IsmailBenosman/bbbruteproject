package produit;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import boutique.Boutique;

@Entity
public class Produit {

	@ManyToOne
	private Boutique boutique;
	
	public Produit() {
	}
	public Produit(String libelle, int prix) {
		this.libelle = libelle;
		this.prix = prix;
	}

	public String libelle; 	

	public int prix;

	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	} 


}
