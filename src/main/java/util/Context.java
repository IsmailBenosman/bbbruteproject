package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import compte.Compte;
import dao.DAOBoutique;
import dao.DAOCompte;
import dao.DAOEven;
import dao.DAOAdmin;
import idao.IDAOAdmin;
import idao.IDAOBoutique;
import idao.IDAOCompte;
import idao.IDAOEleve;
import idao.IDAOEven;
import idao.IDAOMaisons;

public class Context {

	//L'objet _singleton sera l'unique objet Context de l'appli et contiendra un pointeur vers tous les autres attributs	
	//Obligatoire
	private EntityManagerFactory emf  = Persistence.createEntityManagerFactory("poudlard");

	private static Context _singleton=null;	

	private IDAOCompte DAOCompte = new DAOCompte();
	private IDAOEleve DAOEleve = new dao.DAOEleve();
	//Option pour notre Projet//
	//private Compte connected;
	private IDAOBoutique  DAOBoutique = new DAOBoutique();
	private IDAOEven DAOEven = new DAOEven();
	private IDAOAdmin DAOAdmin= new DAOAdmin();


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
		return DAOEven; }

	public void setDAOEven(IDAOEven dAOEven) { 

		DAOEven = dAOEven; }

	public IDAOEleve getDAOEleve() {
		return DAOEleve;
	}

	public void setDAOEleve(IDAOEleve dAOEleve) {
		DAOEleve = dAOEleve;
	}


	public IDAOAdmin getDAOAdmin() {
		return DAOAdmin;
	}

	public void setDAOAdmin(IDAOAdmin dAOAdmin) {
		DAOAdmin = dAOAdmin;
	}

	public void close() {emf.close();}



}
