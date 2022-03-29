package boutique;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonView;

import Json.JsonViews;
import produit.Produit;

@Entity
@Component
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="boutiques")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY, property="type")
@JsonSubTypes({
	@Type(value=Baguetterie.class,name="baguetterie"),
	@Type(value=Balaiterie.class,name="balaiterie"),
	@Type(value=Confiserie.class,name="confiserie"),
	@Type(value=Animalerie.class,name="animalerie"),
	@Type(value=Bar.class,name="bar")
})
public abstract class Boutique {

	public Boutique(Integer id, String nom, String adresse, Produit produit) {
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
	}
	public Boutique(String nom, String adresse, Produit produit) {
		this.nom = nom;
		this.adresse = adresse;
	}
	@JsonView(JsonViews.Common.class)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected Integer id;
	
	@JsonView(JsonViews.Common.class)
	protected String nom;
	
	@JsonView(JsonViews.Common.class)
	protected String adresse;
	
	@OneToMany(mappedBy="boutique")
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
