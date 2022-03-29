package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import boutique.Boutique;
import produit.Produit;


public interface BoutiqueRepository extends JpaRepository<Boutique, Integer>{


	List<Boutique> findAllAnimals();

	List<Boutique> findAllBaguettes();

	List<Boutique> findAllConfiseries();

	List<Boutique> findAllBoissons();

	List<Boutique> findAllBalais();


}
