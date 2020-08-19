import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculation1 {
	@Before
	public void  Beforereverse()
	{
		System.out.println("before test method");
	}
	
	 @Test  
	    public void testReverse(){  
	        System.out.println("test case reverse word");  
	        Calculation1 t=new Calculation1();
	        assert("ihtoyj") !=null;
	        
	 }
	 
	 @Test  
	    public void testUpper(){  
	        System.out.println("test case reverse word");  
	        Calculation1 t=new Calculation1();
	        assert("JYOTHI") !=null;
	        
	 }
	 @Test  
	    public void testLower(){  
	        System.out.println("test case reverse word");  
	        Calculation1 t=new Calculation1();
	        assert("jyothi") !=null;
	        
	 }

	 @After  
	    public void AfterLower() {  
	        System.out.println("after test method");  
	    }  

}