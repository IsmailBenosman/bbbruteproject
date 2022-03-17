package dao;

import java.util.List;

import javax.persistence.EntityManager;
import idao.IDAOModule;
import util.Context;

public class DAOModule implements IDAOModule{

	@Override
	public Module findById(Integer id) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		Module m = em.find(Module.class, id);
		em.close();
		return m;
	}

	@Override
	public List<Module> findAll() {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		List<Module> modules = em.createQuery("SELECT m from Module m").getResultList();
		em.close();
		return modules;
	}

	@Override
	public Module insert(Module m) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		em.close();
		return m;
	}

	@Override
	public Module update(Module m) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();

		try {
			em.getTransaction().begin();

			m = em.merge(m);
			em.getTransaction().commit();
		}catch(Exception e) {e.printStackTrace();}
		em.close();
		return m;
	}

	@Override
	public void delete(Integer id) {
		EntityManager em  = Context.getSingleton().getEmf().createEntityManager();
		em.getTransaction().begin();
		Module m = em.find(Module.class, id);
		em.remove(m);
		em.getTransaction().commit();
		em.close();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
