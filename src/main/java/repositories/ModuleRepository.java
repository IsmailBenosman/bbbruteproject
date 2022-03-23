package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import compte.Eleve;
import module.Modules;

public interface ModuleRepository extends JpaRepository<Module,Integer>{
	
	@Modifying
	@Transactional
	@Query("delete from Module m were m.eleve=:eleve")
	void deleteByEleve(@Param("eleve") Eleve eleveEnBase);

	
// permet de garder le module mais libère la place. (sauf qu'on a des notes, donc  interet à garder)
//	@Modifying
//	@Transactional
//	@Query("update Module m set m.eleve=null where m.eleve=:eleve")
//	void setEleveModuleToNull(@Param("eleve") Eleve eleve);

	
	
	
	
	
}
