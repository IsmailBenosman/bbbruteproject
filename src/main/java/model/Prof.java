package model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("prof")
public class Prof  extends Compte{

	public Prof() {

	}
	public Prof(String nom, String prenom, String login, String password, LocalDate naissance, double solde,
			String maison) {
		super(nom, prenom, login, password, naissance, solde,maison);

		}

		@Override
		public String toString() {
			return "Professeur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password=" + password
					+ ", naissance=" + naissance + ", solde=" + solde + "]";
		}
		
		

	}
