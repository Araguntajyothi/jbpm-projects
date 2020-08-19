package exceptions;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {10,20,30,40,50};
       try
       {
    	   a[4]=(a[2]/a[1]-10);
    	  
    	   System.out.println(a[4]);
       }
       catch(Exception e)
       {
    	   System.out.println(e);
       }
       finally
       {
    	   System.out.println("this block will definitely execute");
       }
	}

}
