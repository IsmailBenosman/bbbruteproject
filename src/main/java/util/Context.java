package util;


public class Context {
	
//L'objet _singleton sera l'unique objet Context de l'appli et contiendra un pointeur vers tous les autres attributs	
//Obligatoire
private static Context _singleton=null;	

//Option pour notre Projet//
//private Compte connected;
//private IDAOCompte daoCompte = new DAOCompteJDBC();
//private IDAOActivite daoActivite = new DAOActiviteJDBC();
//private IDAOAnimal daoAnimal = new DAOAnimalJDBC();
//private IDAOReservation daoReservation = new DAOReservationJDBC();
//private IDAOParticipant daoParticipant = new DAOParticipantJDBC();
//private IDAOVehicule daoVehicule = new DAOVehiculeJDBC();


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


	

}
