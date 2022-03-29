package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exception.ModuleException;
import produit.Produit;
import boutique.Boutique;
import repositories.BalaiterieRepository;
import repositories.BoutiqueRepository;


@Service
public class BalaiterieService {

	@Autowired
	private BoutiqueRepository boutiqueRepository;
	
	@Autowired
	private BalaiterieRepository balaiterieRepository;
	
	

	public void create(Produit b) {
		balaiterieRepository.save(b);
	}

	public void update(Produit b) {
		balaiterieRepository.save(b);
	}

	public List<Produit> getAll() {
		return balaiterieRepository.findAll();
	}

	public Produit getById(Integer id) {
		return balaiterieRepository.findById(id).orElseThrow(() -> {
			throw new ModuleException("numero inconnu");
		});
	}
	
	public void delete(Produit b) {
		balaiterieRepository.delete(b);
	}

}