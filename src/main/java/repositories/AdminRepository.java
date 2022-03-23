package repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import compte.Admin;




public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	
	// chercher les eleves par maison en fonctiond e son id. 
	@Query("select e from Admin e left join fetch e.maison where c.id=:id")
	Optional<Admin> findByMaison(@Param("id") Integer id);

	@Query("select e from Admin e left join fetch e.module where c.id=:id")
	Optional<Admin> findByIdWithModule(Integer id);
	
		
}