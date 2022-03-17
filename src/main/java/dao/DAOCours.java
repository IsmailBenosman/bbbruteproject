package dao;

import java.util.List;

import javax.persistence.EntityManager;

import idao.IDAOCours;
import module.Cours;
import util.Context;

public class DAOCours implements IDAOCours{

	@Override
	public Cours findById(Integer id) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		Cours c = em.find(Cours.class, id);
		em.close();
		return c;
	}

	@Override
	public List<Cours> findAll() {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		List<Cours> arenes = em.createQuery("SELECT c from Cours c").getResultList();
		em.close();
		return arenes;
	}

	@Override
	public Cours insert(Cours c) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		return c;
	}

	@Override
	public Cours update(Cours c) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();

		try {
			em.getTransaction().begin();

			c = em.merge(c);
			em.getTransaction().commit();
		}catch(Exception e) {e.printStackTrace();}
		em.close();
		return c;
	}

	@Override
	public void delete(Integer id) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		em.getTransaction().begin();
		Cours c = em.find(Cours.class, id);
		em.remove(c);
		em.getTransaction().commit();
		em.close();
	}
	
	

}
