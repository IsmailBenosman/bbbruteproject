package produit;

public class Produit {
	
	
public Produit() {
	}
public Produit(String libelle, int prix) {
		this.libelle = libelle;
		this.prix = prix;
	}
public String libelle; 
public int prix;
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public int getPrix() {
	return prix;
}
public void setPrix(int prix) {
	this.prix = prix;
} 


}
