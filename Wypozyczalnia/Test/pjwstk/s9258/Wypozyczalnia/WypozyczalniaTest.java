package pjwstk.s9258.Wypozyczalnia;
import org.junit.Assert;
import org.junit.Test;



public class WypozyczalniaTest {

	
	
@Test
public void testWypozyczKajak_1(){


Wypozyczalnia wypozyczalnia = new Wypozyczalnia();


Kajak_1 kajak1 = wypozyczalnia.WypozyczKajak(2, 3, 4);



Assert.assertEquals("Kajak_1", kajak1.getTyp());
Assert.assertEquals(2, kajak1.getcena());
Assert.assertEquals(3, kajak1.getczas());
Assert.assertEquals(4, kajak1.getsztuk());

}
}


