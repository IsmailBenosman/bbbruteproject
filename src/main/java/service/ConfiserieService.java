package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exception.ModuleException;
import produit.Produit;
import boutique.Boutique;
import repositories.BoutiqueRepository;
import repositories.ConfiserieRepository;


@Service
public class ConfiserieService {

	@Autowired
	private BoutiqueRepository boutiqueRepository;
	
	@Autowired
	private  ConfiserieRepository confiserieRepository;
	

	public void create(Produit b) {
		confiserieRepository.save(b);
	}

	public void update(Produit b) {
		confiserieRepository.save(b);
	}

	public List<Produit> getAll() {
		return confiserieRepository.findAll();
	}

	public Produit getById(Integer id) {
		return confiserieRepository.findById(id).orElseThrow(() -> {
			throw new ModuleException("numero inconnu");
		});
	}
	
	public void delete(Produit b) {
		confiserieRepository.delete(b);
	}

}