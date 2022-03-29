package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import boutique.Boutique;
import produit.Produit;


public interface BaguetterieRepository extends JpaRepository<Produit, Integer>{

}
