package test;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Compte;
import model.Eleve;
import model.Prof;
import util.Context;

public class App {

	static Compte connected;
	/*static IDAOCompte daoCompte = Context.getSingleton().getDAOCompte();
	static IDAOBoutique daoBoutique = Context.getSingleton().getDAOBoutique();
	static IDAEven daoEven = Context.getSingleton().getDAOEven();
	static IDAOMaisons daoMaisons = Context.getSingleton().getDAOMaisons();*/

	public static String saisieString(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String saisie= sc.nextLine();
		return saisie;
	}

	public static double saisieDouble(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		double saisie= sc.nextDouble();
		return saisie;
	}

	public static int saisieInt(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int saisie= sc.nextInt();
		return saisie;
	}

	public static boolean saisieBoolean(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextBoolean();
	}
	
	/*public static void menuPrincipal() {
		System.out.println("Ecole Poudlard");
		System.out.println("1 - Se connecter");
		System.out.println("2 - Quitter");
		int choix = saisieInt("Choisir un menu");

		switch(choix) 
		{
		case 1 -> seConnecter();
		case 2 -> System.exit(0);
		}
		menuPrincipal();

	}
	
	public static void seConnecter() {
		String login = saisieString("Saisir votre mail");
		String password = saisieString("Saisir votre password");
		connected=daoCompte.seConnecter(mail,password);
		//Context.getSingleton().setConnected(connected);
		
		if(connected instanceof Eleve) {menuEleve();}

		else if(connected instanceof Prof) {menuProfesseur();}

		else {System.out.println("Identifiants invalides");}

	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eleve e1 = new Eleve("Pierson", "Robin", "rob", "rob", LocalDate.parse("1997-03-18"), 0,"Serpentard");
		//Prof p1 = new Prof("Ye", "Elisabeth", "eli", "eli", LocalDate.parse("1996-11-15"), 10000,"Serdaigle");
		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("poudlard");
		
		EntityManager em  = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(e1);
		//em.persist(p1);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}


}
