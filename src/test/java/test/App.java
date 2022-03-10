package test;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Eleve;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eleve e1 = new Eleve("Pierson", "Robin", "rob", "rob", LocalDate.parse("1997-03-18"), 0,"Serpentard");
	
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("poudlard");
		
		EntityManager em  = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(e1);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}


}
