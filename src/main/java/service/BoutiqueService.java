package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exception.ModuleException;
import boutique.Boutique;
import repositories.BoutiqueRepository;


@Service
public class BoutiqueService {

	@Autowired
	private BoutiqueRepository boutiqueRepository;

	public void create(Boutique b) {
		boutiqueRepository.save(b);
	}

	public void update(Boutique b) {
		boutiqueRepository.save(b);
	}

	public List<Boutique> getAll() {
		return boutiqueRepository.findAll();
	}

	public Boutique getById(Integer id) {
		return boutiqueRepository.findById(id).orElseThrow(() -> {
			throw new ModuleException("numero inconnu");
		});
	}
	
	public void delete(Boutique b) {
		boutiqueRepository.delete(b);
	}

}