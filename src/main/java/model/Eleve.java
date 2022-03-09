package model;

import java.time.LocalDate;

public class Eleve  extends Compte{

	private Maisons maison;

	public Eleve(Integer id, String nom, String prenom, String login, String password, LocalDate naissance,
			double solde, Maisons maison) {
		super(id, nom, prenom, login, password, naissance, solde);
		this.maison = maison;
	}

	public Eleve(String nom, String prenom, String login, String password, LocalDate naissance, double solde,
			Maisons maison) {
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
		return "Eleve [maison=" + maison + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", password=" + password + ", naissance=" + naissance + ", solde=" + solde + "]";
	}





	}
	
	
	
	
	
	
	



