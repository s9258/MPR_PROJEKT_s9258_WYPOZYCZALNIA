package pjwstk.s9258.Wypozyczalnia;


public class RowerWodny extends SprzetWodny {
@Override

public String getTyp() 

{

	return "RowerWodny";
}

public RowerWodny(int cena_wypozyczenia, int czas_wypozyczenia, int ilosc_sztuk)

{

cena = cena_wypozyczenia;
czas = czas_wypozyczenia;
sztuk = ilosc_sztuk;

}
}

