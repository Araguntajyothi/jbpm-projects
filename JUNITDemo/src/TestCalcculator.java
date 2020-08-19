import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalcculator
{  
	@BeforeClass
	public static void beforeall()
	{
		System.out.println("before all test cases ");
	}
	@Before
	public void beforeAdd()
	{
		System.out.println("before test method ");
	}
	
	@Test
	public void testAdd()
	{
		System.out.println("inside add test");
		Calcculator c= new Calcculator();
		assertEquals(4,c.add(2,2));
	}
	@Test
	public void testSub()
	{
		System.out.println("inside  sub test");
		Calcculator c= new Calcculator();
		assertEquals(0,c.sub(2,2));
	}
	@Test
	public void testMul()
	{
		System.out.println("inside  mul test");
		Calcculator c= new Calcculator();
		assertEquals(4,c.mul(2,2));
	}
	@Test
	public void testDiv()
	{
		System.out.println("inside  div test");
		Calcculator c= new Calcculator();
		assertEquals(0,c.div(2,2));
	}
	@After
	public void afterDiv()
	{
		System.out.println("after test method");
	}
	

	@AfterClass
	public static void afterall()
	{
		System.out.println("after all test cases");
	}
	
}