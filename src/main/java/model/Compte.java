package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type_compte",columnDefinition = "ENUM('eleve','prof')")
@Table(name="compte")
public abstract class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_compte")
	protected Integer id;
    protected String nom;
    protected String prenom;
    protected String login;
    protected String password;
    protected LocalDate naissance;
    protected double solde;
    
    /*@ManyToOne  // X Class pour Y attribut.  X to Y
	@JoinColumn(name="id_maison")*/
	private String maison;
//    protected List<Items> paniner;
//    protected List<Items> iventaire;
    
    @Version
	private int version;
    
    
	public Compte() {}


	public Compte(String nom, String prenom, String login, String password, LocalDate naissance, double solde,
			String maison) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.naissance = naissance;
		this.solde = solde;
		this.maison = maison;
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


	public String getMaison() {
		return maison;
	}


	public void setMaison(String maison) {
		this.maison = maison;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	@Override
	public String toString() {
		return "Compte [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password="
				+ password + ", naissance=" + naissance + ", solde=" + solde + ", maison=" + maison + ", version="
				+ version + "]";
	}

	

	

}
