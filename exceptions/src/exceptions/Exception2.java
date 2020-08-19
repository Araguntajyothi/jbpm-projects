package exceptions;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {10,20,30,40,50};
       try {
    	   a[5]=a[2]/(a[1]-10);
    	   System.out.println("result is ="+a[5]);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
    	   System.out.println(e);
       }
       catch(ArithmeticException e)
       {
    	   System.out.println(e);
       }
	}

}
