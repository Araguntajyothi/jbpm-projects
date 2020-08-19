import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculation2 {

	@Before
	public void  BeforeSimpleInterest()
	{
		System.out.println("before test method");
	}
	
	@Test
	public void testSimpleInterest()
	{
		System.out.println("inside simpleinterest test");
		Calculation2 c= new Calculation2();
		assertEquals(1400,c.simpleInterest(14000,5,2));

	}
	  @After  
	    public void AfterSimpleInterest() {  
	        System.out.println("after test method");  
	    } 
}
