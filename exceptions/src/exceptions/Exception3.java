package exceptions;

public class Exception3 {
	void fun1() {
		int a[]= {10,20,30,40,50};
		try {
			 a[5]=a[2]/(a[1]-10);
	    	   System.out.println("result is ="+a[5]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Exception3 e1=new Exception3();
      e1.fun1();
	}

}
