package boutique;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonView;

import Json.JsonViews;
import produit.Produit;

@Entity
@Component
@Table(name="baguetterie")
public class Baguetterie extends Boutique{
	
	@JsonView(JsonViews.Common.class)
	@Enumerated(EnumType.STRING)
	private Baguettes baguette;

	public Baguetterie() {}
	
	public Baguetterie(Integer id,String nom,String adresse,Baguettes baguette) {
		super(id, nom,adresse);
		this.baguette = baguette;
	}
	

	public Baguetterie(String nom, String adresse, Produit produit, Baguettes baguette) {
		super(nom, adresse, produit);
		this.baguette = baguette;
	}

	public Baguettes getBaguette() {
		return baguette;
	}

	public void setBaguette(Baguettes baguette) {
		this.baguette = baguette;
	}
	
	
}
