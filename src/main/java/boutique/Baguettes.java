package boutique;

public enum Baguettes {

	Sureau(1),PlumeDePhoenix(1),EcailleDeDragon(1);
	
	private double prix;

	private Baguettes(double prix) 
	{
		this.prix=prix;
	}

	public double getPrix() 
	{
		return prix;
	}
}
