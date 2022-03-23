package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import compte.Eleve;
import exception.EleveException;
import repositories.EleveRepository;
import repositories.ModuleRepository;

@Service
public class EleveService {
	
	
	@Autowired
	private EleveRepository eleveRepository;
	@Autowired
	private ModuleRepository moduleRepository;
	

	public void create(Eleve e) {
		if(e.getId()!=null){ 
			//problème
			throw new EleveException("l'id ne doit pas etre défini");
		}
		if(e.getLogin().isEmpty()) {
			throw new EleveException("Login manquant");
		}
		if(e.getPassword().isEmpty()) {
			throw new EleveException("Mot de passe manquant");
		}
		eleveRepository.save(e);
	}

	public void update(Eleve e) {
		if(e.getId()==null){ 
			throw new EleveException("l'id doit pas etre défini");
		}
		if(e.getLogin().isEmpty()) {
			throw new EleveException("Login manquant");
		}
		if(e.getPassword().isEmpty()) {
			throw new EleveException("Mot de passe manquant");
		}
		eleveRepository.save(e);
	}

public List<Eleve> getAll() {
	return eleveRepository.findAll();
}
public Eleve getById (Integer id) {
	return eleveRepository.findById(id).orElseThrow(()->{
		throw new EleveException("numero inconnu");
	});
}

public Eleve findByMaison (Integer id) {
	return eleveRepository.findByMaison(id).orElseThrow(()->{
		throw new EleveException("Numero étudiant non attribué");
	}	);
}	


public void delete (Eleve e) {
	// suppr eleve avec le module
	Eleve eleveEnBase = getById(e.getId());
	moduleRepository.deleteByEleve(eleveEnBase);
	eleveRepository.delete(eleveEnBase);
	
}

public void deleteById (Integer id) {
	Eleve eleve=new Eleve();
	eleve.setId(id);
	delete(eleve);
}








}
