package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exception.ModuleException;
import produit.Produit;
import boutique.Boutique;
import repositories.BarRepository;
import repositories.BoutiqueRepository;


@Service
public class BarService {

	@Autowired
	private BoutiqueRepository boutiqueRepository;
	
	@Autowired
	private BarRepository barRepository;
	
	

	public void create(Produit b) {
		barRepository.save(b);
	}

	public void update(Produit b) {
		barRepository.save(b);
	}

	public List<Produit> getAll() {
		return barRepository.findAll();
	}

	public Produit getById(Integer id) {
		return barRepository.findById(id).orElseThrow(() -> {
			throw new ModuleException("numero inconnu");
		});
	}
	
	public void delete(Produit b) {
		barRepository.delete(b);
	}

}