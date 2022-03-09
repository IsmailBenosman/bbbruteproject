package model;

import java.time.LocalDate;

public class Eleve  extends Compte{

	private Maisons maison;

	public Eleve(String nom, String prenom, String login, String password, LocalDate naissance, double solde, Maisons maison) {
		super(nom, prenom, login, password, naissance, solde);
		this.maison = maison;
	}

	public Maisons getMaison() {
		return maison;
	}

	public void setMaison(Maisons maison) {
		this.maison = maison;
	}

	@Override
	public String toString() {
		return "Elève [Id= "+ id +" Nom= "+ nom+" Prenom= "+ prenom+ " Login= "+ login+" Password= "+ password+ " naissance= "+ naissance+ "Solde= "+ solde+ " maison=" + maison + "]";
		}
	}
	
	
	
	
	
	
	
}


