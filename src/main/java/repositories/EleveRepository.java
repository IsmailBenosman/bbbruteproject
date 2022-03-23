package repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import compte.Eleve;


public interface EleveRepository extends JpaRepository<Eleve, Integer>{
	
	
	// chercher les eleves par maison en fonctiond e son id. 
	@Query("selecte e from Eleve e left join fetch e.maison where c.id=:id")
	Optional<Eleve> findByMaison(@Param("id") Integer id);

	@Query("selecte e from Eleve e left join fetch e.module where c.id=:id")
	Optional<Eleve> findByIdWithModule(Integer id);
	
		
}
