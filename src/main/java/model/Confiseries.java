package model;

public enum Confiseries {

	ChocoGrenouiile(1),Drag�esSurprises(1),FizWizBiz(1);
	
	private double prix;

	private Confiseries(double prix) 
	{
		this.prix=prix;
	}

	public double getPrix() 
	{
		return prix;
	}
}
