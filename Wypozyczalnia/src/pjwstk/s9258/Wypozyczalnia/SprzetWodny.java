package pjwstk.s9258.Wypozyczalnia;


public abstract class SprzetWodny 

{

	protected int cena;
	protected int czas;
	protected int sztuk;

	
	public int getcena()
	
	{

	return cena;

	}

	
	public int getczas()
	
	{
		
		return czas;
	}
	
	
    public int getsztuk()
	
	{
		
		return sztuk;
	}
	
	
	
	public abstract String getTyp();

}