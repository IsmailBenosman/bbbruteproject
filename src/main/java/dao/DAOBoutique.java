package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import boutique.Boutique;
import idao.IDAOBoutique;
import idao.IDAOBoutique;

@Repository
public class DAOBoutique implements IDAOBoutique 
{
	@PersistenceContext
	private EntityManager em;
	
	public Boutique findById(Integer id) {
		Boutique b = em.find(Boutique.class, id);
		return b;
	}

	public List<Boutique> findAll() {
		List<Boutique> Boutiques = em.createQuery("SELECT c from Boutique c").getResultList();
		return Boutiques;
	}

	@Transactional
	public Boutique insert(Boutique c) {
		em.persist(c);
		return null;
	}

	@Transactional
	public Boutique update(Boutique b) {

		try {

			b = em.merge(b);
		}catch(Exception e) {e.printStackTrace();}
		return b;
	}

	@Transactional
	public void delete(Integer id) {
		Boutique b = em.find(Boutique.class, id);
		em.remove(b);
	}
}

	