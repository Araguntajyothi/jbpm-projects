package wrapper;
public class Integer1 {
	
	public static void main(String[] args) 
	{
	   
	    Integer intObj1 = new Integer(10);
	    Integer intObj2 = new Integer("10");
	    Integer intObj3 = new Integer(intObj1);
	    Integer intObj4 = 100; ;
    Integer intObj5 = Integer.valueOf(200);
    Integer intObj6 = Integer.valueOf("300");
    String  val="400";
    Integer intObj7 = Integer.valueOf(val);
        
	    System.out.println(intObj1);
	    System.out.println(intObj2);
	    System.out.println(intObj3);
	    System.out.println(intObj4);
	    System.out.println(intObj5);
	    System.out.println(intObj6);
	    System.out.println(intObj7);
	  }
}

