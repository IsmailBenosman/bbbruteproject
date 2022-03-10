package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import idao.IDAOCompte;
import model.Compte;
import util.Context;

public class DAOCompte implements IDAOCompte {

	public Compte findById(Integer id) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		Compte c = em.find(Compte.class, id);
		em.close();
		return c;
	}

	public List<Compte> findAll() {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		List<Compte> comptes = em.createQuery("SELECT c from Compte c").getResultList();
		em.close();
		return comptes;
	}

	public Compte insert(Compte o) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		return null;
	}

	public void update(Compte o) {
		/		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();

		try {
			em.getTransaction().begin();

			c = em.merge(c);
			em.getTransaction().commit();
		}catch(Exception e) {e.printStackTrace();}
		em.close();
		return c;
	}

	public void delete(Integer id) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		em.getTransaction().begin();
		Compte c = em.find(Compte.class, id);
		em.remove(c);
		em.getTransaction().commit();
		em.close();
	}

	public Compte seConnecter(String mail, String password) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		Query q = em.createQuery("SELECT c from Compte c where c.mail = :mail and c.password = :password");
		q.setParameter("mail", mail);
		q.setParameter("password", password);
		Compte c=null;
		try {
			c = (Compte) q.getSingleResult();



		} catch (Exception e) {

		}
		em.close();
		return c;
	}




}
