package boutique;

public enum Bonbons {

	ChocoGrenouiile(1),DragesSurprises(1),FizWizBiz(1);
	
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
