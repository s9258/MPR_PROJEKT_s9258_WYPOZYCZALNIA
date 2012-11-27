package pjwstk.s9258.Wypozyczalnia;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;



public class WypozyczalniaTest {

		
	Wypozyczalnia wypozyczalnia;
	
	@Before
	
	public void setUp () throws Exception
	
	{
		
		this.wypozyczalnia = new Wypozyczalnia();
		
	}
	
	
@Test
public void testWypozyczKajak_1(){


Wypozyczalnia wypozyczalnia = new Wypozyczalnia();


Kajak_1 kajak1 = wypozyczalnia.WypozyczKajak(2, 3, 4);



Assert.assertEquals("Kajak_1", kajak1.getTyp());
Assert.assertEquals(2, kajak1.getcena());
Assert.assertEquals(3, kajak1.getczas());
Assert.assertEquals(4, kajak1.getsztuk());

}


@Test
public void testWypozyczKajak_2(){


Wypozyczalnia wypozyczalnia = new Wypozyczalnia();


Kajak_2 kajak2 = wypozyczalnia.WypozyczKajak_2(2, 3, 4);



Assert.assertEquals("Kajak_2", kajak2.getTyp());
Assert.assertEquals(2, kajak2.getcena());
Assert.assertEquals(3, kajak2.getczas());
Assert.assertEquals(4, kajak2.getsztuk());

}


@Test
public void testWypozyczRowerWodny(){


Wypozyczalnia wypozyczalnia = new Wypozyczalnia();


RowerWodny rowerwodny = wypozyczalnia.WypozyczRowerWodny(2, 3, 4);



Assert.assertEquals("RowerWodny", rowerwodny.getTyp());
Assert.assertEquals(2, rowerwodny.getcena());
Assert.assertEquals(3, rowerwodny.getczas());
Assert.assertEquals(4, rowerwodny.getsztuk());



}


}


