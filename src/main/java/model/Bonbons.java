package model;

public enum Bonbons {

	ChocoGrenouiile(1),DragéesSurprises(1),FizWizBiz(1);
	
	private double prix;

	private Bonbons(double prix) 
	{
		this.prix=prix;
	}

	public double getPrix() 
	{
		return prix;
	}
}
