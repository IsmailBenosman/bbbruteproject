package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import boutique.Boutique;
import produit.Produit;


public interface AnimalerieRepository extends JpaRepository<Produit, Integer>{

}
