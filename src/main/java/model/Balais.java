package model;

public enum Balais {

	EclairDeFeu(1),Nimbus2000(1),Nimbus2001(1);
	
	private double prix;

	private Balais(double prix) 
	{
		this.prix=prix;
	}

	public double getPrix() 
	{
		return prix;
	}
}
