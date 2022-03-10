package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOBoutique;
import dao.DAOCompte;
import dao.DAOEven;
import dao.DAOMaisons;
import idao.IDAOBoutique;
import idao.IDAOCompte;
import idao.IDAOEven;
import idao.IDAOMaisons;
public class Context {

	//L'objet _singleton sera l'unique objet Context de l'appli et contiendra un pointeur vers tous les autres attributs	
	//Obligatoire
	private EntityManagerFactory emf  = Persistence.createEntityManagerFactory("poudlard");

	private static Context _singleton=null;	

	private IDAOCompte DAOCompte = new DAOCompte();
	//Option pour notre Projet//
	//private Compte connected;
	private IDAOBoutique  DAOBoutique = new DAOBoutique();
	private IDAOEven DAOEven = new DAOEven();
	private IDAOMaisons DAOMaisons= new DAOMaisons();


	//Obligatoire
	private Context() {}

	//Obligatoire
	public static Context getSingleton() 
	{
		if(_singleton==null) 
		{
			_singleton=new Context();
		}

		return _singleton;
	}
	

	public EntityManagerFactory getEmf() {
	return emf;
	}

	public static Context get_singleton() {
		return _singleton;
	}

	public static void set_singleton(Context _singleton) {
		Context._singleton = _singleton;
	}

	public IDAOCompte getDAOCompte() {
		return DAOCompte;
	}

	public void setDAOCompte(IDAOCompte dAOCompte) {
		DAOCompte = dAOCompte;
	}

	public IDAOBoutique getDAOBoutique() {
		return DAOBoutique;
	}

	public void setDAOBoutique(IDAOBoutique dAOBoutique) {
		DAOBoutique = dAOBoutique;
	}

	public IDAOEven getDAOEven() {
		return DAOEven;
	}

	public void setDAOEven(IDAOEven dAOEven) {
		DAOEven = dAOEven;
	}

	public IDAOMaisons getDAOMaisons() {
		return DAOMaisons;
	}

	public void setDAOMaisons(IDAOMaisons dAOMaisons) {
		DAOMaisons = dAOMaisons;
	}

	public void close() {emf.close();}
	

}
