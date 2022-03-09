package model;

public enum Animaux {

	Chouette(1),Chat(1),Rat(1),Crapaud(1);
	
	private double prix;

	private Animaux(double prix) 
	{
		this.prix=prix;
	}

	public double getPrix() 
	{
		return prix;
	}
}
