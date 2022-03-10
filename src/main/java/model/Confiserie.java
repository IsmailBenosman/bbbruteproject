package model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Confiserie extends Boutique{

	@Enumerated(EnumType.STRING)
	private Bonbons bonbon;

	public Confiserie() {}
	
	public Confiserie(Integer id,String nom,String adresse,Bonbons bonbon) {
		super(id, nom,adresse);
		this.bonbon = bonbon;
	}

	public Bonbons getBonbon() {
		return bonbon;
	}

	public void setBonbon(Bonbons bonbon) {
		this.bonbon = bonbon;
	}
	
}
