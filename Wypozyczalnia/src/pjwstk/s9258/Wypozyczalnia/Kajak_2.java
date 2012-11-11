package pjwstk.s9258.Wypozyczalnia;


public class Kajak_2 extends SprzetWodny 

{
@Override
public String getTyp() 

{

	return "Kajak_2";
}


public Kajak_2(int cena_wypozyczenia, int czas_wypozyczenia, int ilosc_sztuk)

{ 

	cena = cena_wypozyczenia;
	czas = czas_wypozyczenia;
	sztuk = ilosc_sztuk;
}
}