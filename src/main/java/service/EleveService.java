package service;

import java.util.List;

import compte.Eleve;
import exception.EleveException;
import repositories.EleveRepository;
import repositories.ModuleRepository;

@Service
public class EleveService {

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
		EleveRepository.insert(e);
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
		EleveRepository.update(e);
	}
}

public List<Eleve> getAll() {
	return EleveRepository.findAll();
}
public Eleve getById (Integer id) {
	return EleveRepository.findById(id).orElseThrow(()->{
		throw new EleveException("numero inconnu");
	}	);
}

public Eleve findByMaison (Integer id) {
	return EleveRepository.findByMaison(id).orElseThrow(()->{
		throw new EleveException("numero inconnu");
	}	);
}	

public void delete (Eleve e) {
	// il va chercher un eleve et suppr avec les cours qu'il a --> le supprimer de la liste des participant d'un cours (module unique à l'eleve)
	Eleve eleveEnBaseAvecCours=getByIdWithModule(c.getNumero());
	ModuleRepository.deleteAll(eleveEnBaseAvecCours.getMesCours());
	EleveRepository.delete(eleveEnBaseAvecCours);
	
}		


public void deleteById (Integer id) {
	Eleve eleve=new Eleve();
	eleve.setId(id);
	delete(eleve);
}








}
