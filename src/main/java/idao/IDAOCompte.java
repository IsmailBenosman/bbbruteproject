package idao;

import compte.Compte;

public interface IDAOCompte extends IDAO<Compte,Integer>  {

	public Compte seConnecter(String mail,String password);
}
