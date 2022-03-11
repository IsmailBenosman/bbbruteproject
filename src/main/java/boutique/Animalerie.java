package boutique;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Animalerie extends Boutique{

	@Enumerated(EnumType.STRING)
	private Animaux animal;
	public Animalerie() {}
	
	public Animalerie(Integer id,String nom,String adresse,Animaux animal) {
		super(id, nom,adresse);
		this.animal = animal;
	}

	public Animaux getAnimal() {
		return animal;
	}

	public void setAnimal(Animaux animal) {
		this.animal = animal;
	}	

}
