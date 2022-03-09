package model;

import java.time.LocalDate;
import java.util.List;

public abstract class Compte {

	protected Integer id;
    protected String nom;
    protected String prenom;
    protected String login;
    protected String password;
    protected LocalDate naissance;
    protected double solde;
//    protected List<Items> paniner;
//    protected List<Items> iventaire;
    
	public Compte() {}

	public Compte(Integer id, String nom, String prenom, String login, String password, LocalDate naissance,
			double solde) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.naissance = naissance;
		this.solde = solde;
	}

	public Compte(String nom, String prenom, String login, String password, LocalDate naissance, double solde) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.naissance = naissance;
		this.solde = solde;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getNaissance() {
		return naissance;
	}

	public void setNaissance(LocalDate naissance) {
		this.naissance = naissance;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password="
				+ password + ", naissance=" + naissance + ", solde=" + solde + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
