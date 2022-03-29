package boutique;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Bar extends Boutique{

	private Boisson boisson;
	public Bar() {}
	
	public Bar(Integer id, String nom, String adresse, Boisson boisson) {
		super(id, nom, adresse);
		this.boisson = boisson;
	}

	public Boisson getBoisson() {
		return boisson;
	}

	public void setBoisson(Boisson boisson) {
		this.boisson = boisson;
	}

}
