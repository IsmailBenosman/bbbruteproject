package model;

import java.time.LocalDate;

public class Prof  extends Compte{

	public Prof (String nom, String prenom, String login, String password, LocalDate naissance, double solde) {
		super(nom, prenom, login, password, naissance, solde);

		@Override
		public String toString() {
			return "Professeur [Id= "+ id +" Nom= "+ nom+" Prenom= "+ prenom+ " Login= "+ login+" Password= "+ password+ " naissance= "+ naissance+ "Solde= "+ solde+ "]";
		}
	}
