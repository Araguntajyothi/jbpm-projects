package wrapper;

public class Integer3 {
	
		 public static void main(String[] args) 
		 { 
			    String str = new String("10");
			    int i = Integer.parseInt(str);
			    System.out.println(i+10);
			    
			    Integer x = new Integer(10);
			    int     y = 20;
			    	
			    String s1 = x.toString();
			    String s2 = Integer.toString(y);
			    System.out.println("s1 = "+s1+" s2 = "+s2);
		  }
	}


