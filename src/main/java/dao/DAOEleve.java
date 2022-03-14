package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import compte.Eleve;
import idao.IDAOEleve;
import util.Context;

public class DAOEleve implements IDAOEleve{

	public Eleve findById(Integer id) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		Eleve el = em.find(Eleve.class, id);
		em.close();
		return el;
	}

	public List<Eleve> findAll() {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		List<Eleve> Eleves = em.createQuery("SELECT c from Eleve c").getResultList();
		em.close();
		return Eleves;
	}

	public Eleve insert(Eleve el) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.persist(el);
		em.getTransaction().commit();
		em.close();
		return null;
	}

	public Eleve update(Eleve el) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();

		try {
			em.getTransaction().begin();

			el = em.merge(el);
			em.getTransaction().commit();
		}catch(Exception e) {e.printStackTrace();}
		em.close();
		return el;
	}

	public void delete(Integer id) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		em.getTransaction().begin();
		Eleve el = em.find(Eleve.class, id);
		em.remove(el);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Eleve> findAllByMaison(String maison) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		Query q= em.createQuery("SELECT c from Eleve c where c.maison=:maison");
		q.setParameter("maison", maison);
		List<Eleve>groupe = q.getResultList();
		em.close();
		return groupe;
	}
}
