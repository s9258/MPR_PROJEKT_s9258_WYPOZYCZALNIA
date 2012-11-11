package pjwstk.s9258.Wypozyczalnia;


public class Kajak_1 extends SprzetWodny 

{
@Override
public String getTyp() 

{

	return "Kajak_1";
}


public Kajak_1(int cena_wypozyczenia, int czas_wypozyczenia, int ilosc_sztuk)

{ 

	cena = cena_wypozyczenia;
	czas = czas_wypozyczenia;
	sztuk = ilosc_sztuk;

}
}