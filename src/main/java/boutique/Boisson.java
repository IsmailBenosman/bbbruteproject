package boutique;

public enum Boisson {

	Rhum(1),BiereauBeurre(1),Hydromel(1);
	
	private double prix;

	private Boisson(double prix) 
	{
		this.prix=prix;
	}

	public double getPrix() 
	{
		return prix;
	}
}
