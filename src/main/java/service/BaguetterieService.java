package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exception.ModuleException;
import produit.Produit;
import boutique.Boutique;
import repositories.BaguetterieRepository;
import repositories.BoutiqueRepository;


@Service
public class BaguetterieService {

	@Autowired
	private BaguetterieRepository baguetterieRepository;
	
	@Autowired
	private BoutiqueRepository boutiqueRepository;
	
	

	public void create(Produit p) {
		baguetterieRepository.save(p);
	}

	public void update(Produit p) {
		baguetterieRepository.save(p);
	}

	public List<Produit> getAll() {
		return baguetterieRepository.findAll();
	}

	public Produit getById(Integer id) {
		return baguetterieRepository.findById(id).orElseThrow(() -> {
			throw new ModuleException("numero inconnu");
		});
	}
	
	public void delete(Produit p) {
		baguetterieRepository.delete(p);
	}

}