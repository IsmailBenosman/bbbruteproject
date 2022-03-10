package model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Balaiterie extends Boutique{

	@Enumerated(EnumType.STRING)
	private Balais balai;

	public Balaiterie(Integer id,String nom,String adresse,Balais balai) {
		super(id, nom,adresse);
		this.balai = balai;
	}

	public Balais getBalai() {
		return balai;
	}

	public void setBalai(Balais balai) {
		this.balai = balai;
	}
	
	
}