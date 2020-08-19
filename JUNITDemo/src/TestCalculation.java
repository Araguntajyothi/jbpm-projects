import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculation {

	@Before
	public void beforeMax()
	{
		System.out.println("before test method ");
	}
	 @Test  
	    public void testMax(){  
		 System.out.println("inside max method");
		 Calculation c=new Calculation();
	        assertEquals(8,c.Max(new int []{1,3,4,2,5,8,6}));  
	     
}
	 @Test  
	    public void testMin(){  
		 System.out.println("inside min method");
		 Calculation c=new Calculation();
         assertEquals(1,c.Min(new int []{1,3,4,2,5,8,6}));  
	     
}

		@After
		public void afterMin()
		{
			System.out.println("after test method");
		}

}
