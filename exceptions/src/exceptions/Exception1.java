package exceptions;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b,c;
       a=Integer.parseInt(args[0]);
       b=Integer.parseInt(args[1]);
       try
       {
    	   c=a/b;
    	   System.out.println("result is:"+c);
       }
       catch(ArithmeticException e)
       {
    	   System.out.println("Arithmetic exception  caught");
    	   System.out.println("division by zero is not possible");
       }
	}

}
