package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import idao.IDAOMaisons;
import idao.IDAOMaisons;
import model.Maisons;
import model.Maisons;
import model.Maisons;
import util.Context;

public class DAOMaisons implements IDAOMaisons
{
	
	public Maisons findById(Integer id) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		Maisons m = em.find(Maisons.class, id);
		em.close();
		return m;
	}

	public List<Maisons> findAll() {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		List<Maisons> Maisonss = em.createQuery("SELECT c from Maisons c").getResultList();
		em.close();
		return Maisonss;
	}

	public Maisons insert(Maisons m) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		em.close();
		return null;
	}

	public Maisons update(Maisons m) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();

		try {
			em.getTransaction().begin();

			m = em.merge(m);
			em.getTransaction().commit();
		}catch(Exception e) {e.printStackTrace();}
		em.close();
		return m;
	}

	public void delete(Integer id) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		em.getTransaction().begin();
		Maisons m = em.find(Maisons.class, id);
		em.remove(m);
		em.getTransaction().commit();
		em.close();
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}