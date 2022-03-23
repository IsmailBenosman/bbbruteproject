package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import even.Evenement;
import exception.ModuleException;
import repositories.EvenementRepository;


@Service
public class EvenementService {

	@Autowired
	private EvenementRepository evenementRepository;

	public void create(Evenement e) {
		evenementRepository.save(e);
	}

	public void update(Evenement e) {
		evenementRepository.save(e);
	}

	public List<Evenement> getAll() {
		return evenementRepository.findAll();
	}

	public Evenement getById(Integer id) {
		return evenementRepository.findById(id).orElseThrow(() -> {
			throw new ModuleException("numero inconnu");
		});
	}
	
	public void delete(Evenement e) {
		evenementRepository.delete(e);
	}

}