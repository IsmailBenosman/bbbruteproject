package model;

import java.time.LocalDate;

public class Prof  extends Compte{

	
	public Prof(Integer id, String nom, String prenom, String login, String password, LocalDate naissance,
			double solde) {
		super(id, nom, prenom, login, password, naissance, solde);
	}

	public Prof(String nom, String prenom, String login, String password, LocalDate naissance,
			double solde) {
		super(nom, prenom, login, password, naissance, solde);
	}
	
	
	@Override
	public String toString() {
		return "Prof [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password=" + password
				+ ", naissance=" + naissance + ", solde=" + solde + "]";
	}

	

	}
