package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exception.ModuleException;
import produit.Produit;
import boutique.Boutique;
import repositories.AnimalerieRepository;
import repositories.BoutiqueRepository;


@Service
public class AnimalerieService {

	@Autowired
	private AnimalerieRepository animalerieRepository;
	
	@Autowired
	private BoutiqueRepository boutiqueRepository;
	
	

	public void create(Produit p) {
		animalerieRepository.save(p);
	}

	public void update(Produit p) {
		animalerieRepository.save(p);
	}

	public List<Produit> getAll() {
		return animalerieRepository.findAll();
	}

	public Produit getById(Integer id) {
		return animalerieRepository.findById(id).orElseThrow(() -> {
			throw new ModuleException("numero inconnu");
		});
	}
	
	public void delete(Produit p) {
		animalerieRepository.delete(p);
	}

}