package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import produit.Produit;



public interface ProduitRepository extends JpaRepository<Produit,Integer>  {

}
