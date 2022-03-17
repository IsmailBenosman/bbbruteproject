package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import compte.Compte;
import compte.Eleve;
import compte.Prof;
import idao.IDAOCompte;
import idao.IDAOEleve;
import module.Cours;
import module.Modules;
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
	
	
	
	public static void seConnecter() {
		String login = saisieString("Saisir votre mail");
		String password = saisieString("Saisir votre password");
		connected=daoCompte.seConnecter(login,password);
		//Context.getSingleton().setConnected(connected);
		

	}
		
	public static void main(String[] args) {
//		System.out.println(daoEleve.findAll());
//		// TODO Auto-generated method stub
//
		Eleve e1 = new Eleve("Pierson", "Robin", "rob", "rob", LocalDate.parse("1997-03-18"), 0,"Serpentard");
//		Eleve e2 = new Eleve("Vong", "Michel", "michel", "michel", LocalDate.parse("1992-03-18"), 0,"Poufsouffle");
//		Prof p1 = new Prof("Ye", "Elisabeth", "eli", "eli", LocalDate.parse("1996-11-15"), 10000,"Serdaigle");
		Prof p2 = new Prof("Benosman", "Ismaïl", "isma", "isma", LocalDate.parse("1996-02-16"), 1000000,"Poufsouffle");
//		Prof p3 = new Prof("Pinel", "Matthieu", "matt", "matt", LocalDate.parse("1998-02-23"), 1000000,"Griffondor");
//		
//		Admin a = new Admin("Abid", "Jordan", "jordan", "jordan", LocalDate.parse("1993-02-23"), 900000000,"Griffondor");
//		
//		System.out.println(a);
		
		
		Cours c1 = new Cours("Botanique");
		Cours c2 = new Cours("Potion");
		c1.setProfesseur(p2);
		c2.setProfesseur(p2);
		List<Cours> uE = new ArrayList();
		Collections.addAll(uE, c1, c2);
		p2.setuE(uE);
		
		Modules m1 = new Modules(20, "Mouais, c'est pas mal",c1);
		Modules m2 = new Modules(0, "Ah ouais, ok.",c2);
		List<Modules> mesCours = new ArrayList();
		mesCours.add(m1);
		mesCours.add(m2);
		e1.setMesCours(mesCours);
		
		System.out.println(c1);
//		System.out.println(uE);
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("poudlard");
//	
//		EntityManager em  = emf.createEntityManager();
//		
//		em.getTransaction().begin();
//		em.persist(c1);
//		em.persist(c2);
//		em.persist(m1);
//		em.persist(m2);
////		em.persist(e1);
////		em.persist(e2);
////		em.persist(p1);
////		em.persist(p2);
////		em.persist(p3);
////		em.persist(a);
//		
//		em.getTransaction().commit();

//		em.close();
//		emf.close();
	}


}
