package produit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import Json.JsonViews;
import boutique.Boutique;

@Entity
@Table(name="produit")
public class Produit {
	
	@JsonView(JsonViews.Common.class)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	
	@ManyToOne
	private Boutique boutique;
	
	public String libelle; 	
	
	public int prix;
	
	public Produit() {
	}
	public Produit(String libelle, int prix) {
		this.libelle = libelle;
		this.prix = prix;
	}
	
	public Produit(Integer id, Boutique boutique, String libelle, int prix) {
		super();
		this.id = id;
		this.boutique = boutique;
		this.libelle = libelle;
		this.prix = prix;
	}
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boutique getBoutique() {
		return boutique;
	}
	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	} 


}
