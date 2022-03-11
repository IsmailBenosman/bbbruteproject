package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import boutique.Boutique;
import idao.IDAOBoutique;
import idao.IDAOBoutique;
import util.Context;

public class DAOBoutique implements IDAOBoutique 
{
	public Boutique findById(Integer id) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		Boutique b = em.find(Boutique.class, id);
		em.close();
		return b;
	}

	public List<Boutique> findAll() {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		List<Boutique> Boutiques = em.createQuery("SELECT c from Boutique c").getResultList();
		em.close();
		return Boutiques;
	}

	public Boutique insert(Boutique c) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		return null;
	}

	public Boutique update(Boutique b) {
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
		Boutique b = em.find(Boutique.class, id);
		em.remove(b);
		em.getTransaction().commit();
		em.close();
	}
}

	