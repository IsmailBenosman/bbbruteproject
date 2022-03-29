package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boutique.Boutique;
import exception.BoutiqueException;
import repositories.AnimalerieRepository;
import repositories.BaguetterieRepository;
import repositories.BalaiterieRepository;
import repositories.BarRepository;
import repositories.BoutiqueRepository;
import repositories.ConfiserieRepository;


@Service
public class BoutiqueService {

	@Autowired
	private BoutiqueRepository boutiqueRepository;
	

	@Autowired
	private AnimalerieRepository animalerieRepository;
	
	@Autowired
	private BaguetterieRepository baguetterieRepository;
	
	@Autowired
	private BalaiterieRepository balaiterieRepository;
	
	@Autowired
	private ConfiserieRepository confiserieRepository;
	
	@Autowired
	private BarRepository barRepository;
	

	public void create(Boutique b) {
		boutiqueRepository.save(b);
	}

	public void update(Boutique b) {
		boutiqueRepository.save(b);
	}

	public List<Boutique> getAll() {
		return boutiqueRepository.findAll();
	}
	
	public List<Boutique> getAllAnimals() {
		return boutiqueRepository.findAllAnimals();
	}
	public List<Boutique> getAllBaguettes() {
		return boutiqueRepository.findAllBaguettes();
	}

	public List<Boutique> getAllConfiseries() {
		return boutiqueRepository.findAllConfiseries();
	}

	public List<Boutique> getAllBoissons() {
		return boutiqueRepository.findAllBoissons();
	}

	public List<Boutique> getAllBalais() {
		return boutiqueRepository.findAllBalais();
	}


	public Boutique getById(Integer id) {
		return boutiqueRepository.findById(id).orElseThrow(BoutiqueException::new);
	}
	
	public Boutique save(Boutique boutique) {
		if (boutique.getId() != null) {
			Boutique boutiqueEnBase = getById(boutique.getId());
			boutique.setVersion(boutiqueEnBase.getVersion());
		}
		return boutiqueRepository.save(boutique);
	}
	
	public void delete(Boutique b) {
		boutiqueRepository.delete(b);
	}
	
	public void deleteById(Integer id) {
		boutiqueRepository.delete(getById(id));
	}
}