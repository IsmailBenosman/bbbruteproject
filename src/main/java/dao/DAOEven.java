package dao;

import java.util.List;

import javax.persistence.EntityManager;

import idao.IDAOBoutique;
import idao.IDAOCompte;
import idao.IDAOEven;
import model.Boutique;
import model.Compte;
import model.Evenement;
import util.Context;

public class DAOEven implements IDAOEven 
{
	public class DAOBoutique implements IDAOBoutique 
	{
		public Evenement findById(Integer id) {
			EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
			Evenement e = em.find(Evenement.class, id);
			em.close();
			return e;
		}

		public List<Evenement> findAll() {
			EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
			List<Evenement> Evenements = em.createQuery("SELECT c from Boutique c").getResultList();
			em.close();
			return Evenements;
		}

		public Boutique insert(Evenement e) {
			EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			em.close();
			return null;
		}

		public Evenement update(Evenement b) {
			EntityManager em  = Context.getSingleton().getEmf().createEntityManager();

			try {
				em.getTransaction().begin();

				b = em.merge(b);
				em.getTransaction().commit();
			}catch(Exception e) {e.printStackTrace();}
			em.close();
			return b;
		}

		public void delete(Integer id) {
			EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
			em.getTransaction().begin();
			Evenement e = em.find(Evenement.class, id);
			em.remove(e);
			em.getTransaction().commit();
			em.close();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}