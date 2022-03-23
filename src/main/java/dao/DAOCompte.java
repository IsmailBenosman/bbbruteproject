package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import compte.Compte;
import idao.IDAOCompte;
import util.Context;

public class DAOCompte implements IDAOCompte {

	@PersistenceContext
	private EntityManager em;
	
	public Compte findById(Integer id) {
		Compte c = em.find(Compte.class, id);
		return c;
	}

	public List<Compte> findAll() {
		List<Compte> comptes = em.createQuery("SELECT c from Compte c").getResultList();
		return comptes;
	}

	@Transactional
	public Compte insert(Compte c) {
		em.persist(c);
		return null;
	}

	@Transactional
	public Compte update(Compte c) {

		try {
			c = em.merge(c);
		}catch(Exception e) {e.printStackTrace();}
		return c;
	}

	@Transactional
	public void delete(Integer id) {
		Compte c = em.find(Compte.class, id);
		em.remove(c);
	}

	public Compte seConnecter(String login, String password) {
		Query q = em.createQuery("SELECT c from Compte c where c.login = :login and c.password = :password");
		q.setParameter("login", login);
		q.setParameter("password", password);
		Compte c=null;
		try {
			c = (Compte) q.getSingleResult();



		} catch (Exception e) {

		}
		return c;
	}




}
