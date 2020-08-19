import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	@Before
	public void beforeReverse()
	{
		System.out.println("before test method ");
	}
	
	@Test
	public void testMyrev()
	{
		System.out.println("inside add test");
		Calculator c= new Calculator();
		
		assertEquals("ihtoyj",c.myrev(new StringBuilder("jyothi")));
	}
	@Test
	public void testUpper()
	{
		System.out.println("inside  sub test");
		Calculator c= new Calculator();
		assertEquals("JYOTHI",c.upper("jyothi"));
	}
	@Test
	public void testLower()
	{
		System.out.println("inside  mul test");
		Calculator c= new Calculator();
		assertEquals("jyothi",c.lower("JYOTHI"));
	}
		@After
	public void afterLower()
	{
		System.out.println("after test method");
	}
	

}
