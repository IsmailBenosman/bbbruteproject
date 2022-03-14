package test;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import compte.Compte;
import compte.Eleve;
import compte.Prof;
import idao.IDAOCompte;
import idao.IDAOEleve;
import util.Context;

public class App {

	static Compte connected;
	static IDAOCompte daoCompte = Context.getSingleton().getDAOCompte();
	static IDAOEleve daoEleve = Context.getSingleton().getDAOEleve();
	/*static IDAOBoutique daoBoutique = Context.getSingleton().getDAOBoutique();
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
	
	public static void menuPrincipal() {
		System.out.println("Ecole Poudlard");
		System.out.println("1 - Se connecter");
		System.out.println("2 - Quitter");
		int choix = saisieInt("Choisir un menu");

		switch(choix) 
		{
		case 1: seConnecter();
		case 2: System.exit(0);
		}
		menuPrincipal();

	}
	
	public static void seConnecter() {
		String login = saisieString("Saisir votre mail");
		String password = saisieString("Saisir votre password");
		connected=daoCompte.seConnecter(login,password);
		//Context.getSingleton().setConnected(connected);
		
		if(connected instanceof Eleve) {menuEleve();}

		else if(connected instanceof Prof) {menuProfesseur();}

		else {System.out.println("Identifiants invalides");}

	}
		public static void menuEleve() {
			System.out.println("Menu Eleve : ");
			System.out.println("1 - Gestion des Animaux");
			System.out.println("2 - Gestion des Activités");
			System.out.println("3 - Gestion des Vehicules");
			System.out.println("4 - Gestion des Reservations");
			System.out.println("5 - Se deconnecter");
			/*int choix = saisieInt("Choisir un menu");

			switch(choix) 
			{
			case 1 : gestionAnimaux();break;
			case 2 : gestionActivites();break;
			case 3 : gestionVehicules();break;
			case 4 : gestionReservations();break;
			case 5 : connected=null;menuPrincipal();break;
			}*/

			menuEleve();
	}
		
		public static void menuProfesseur() {
			System.out.println("Menu Professeur : ");
			System.out.println("1 - Gestion des Animaux");
			System.out.println("2 - Gestion des Activités");
			System.out.println("3 - Gestion des Vehicules");
			System.out.println("4 - Gestion des Reservations");
			System.out.println("5 - Se deconnecter");
			/*int choix = saisieInt("Choisir un menu");

			switch(choix) 
			{
			case 1 : gestionAnimaux();break;
			case 2 : gestionActivites();break;
			case 3 : gestionVehicules();break;
			case 4 : gestionReservations();break;
			case 5 : connected=null;menuPrincipal();break;
			}*/

			menuProfesseur();
		}
	public static void main(String[] args) {
//		System.out.println(daoEleve.findAll());
//		// TODO Auto-generated method stub
//
//		Eleve e1 = new Eleve("Pierson", "Robin", "rob", "rob", LocalDate.parse("1997-03-18"), 0,"Serpentard");
//		Eleve e2 = new Eleve("Vong", "Michel", "michel", "michel", LocalDate.parse("1992-03-18"), 0,"Poufsouffle");
//		Prof p1 = new Prof("Ye", "Elisabeth", "eli", "eli", LocalDate.parse("1996-11-15"), 10000,"Serdaigle");
//		Prof p2 = new Prof("Benosman", "Ismaïl", "isma", "isma", LocalDate.parse("1996-02-16"), 1000000,"Poufsouffle");
//		Prof p3 = new Prof("Pinel", "Matthieu", "matt", "matt", LocalDate.parse("1998-02-23"), 1000000,"Griffondor");
//		
//		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("poudlard");
//		
//		EntityManager em  = emf.createEntityManager();
//		
//		em.getTransaction().begin();
//		em.persist(e1);
//		em.persist(e2);
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
//
//		em.close();
//		emf.close();
	}


}
