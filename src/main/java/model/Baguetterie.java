package model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Baguetterie extends Boutique{

	@Enumerated(EnumType.STRING)
	private Baguettes baguette;

	public Baguetterie(Integer id,String nom,String adresse,Baguettes baguette) {
		super(id, nom,adresse);
		this.baguette = baguette;
	}

	public Baguettes getBaguette() {
		return baguette;
	}

	public void setBaguette(Baguettes baguette) {
		this.baguette = baguette;
	}
	
	
}
