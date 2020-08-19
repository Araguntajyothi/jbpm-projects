package exceptions;
class sample
{
	void fun(int x,int y)throws ArithmeticException
	{
		int a,b,c;
		a=x;
		b=y;
		c=a/b;
		System.out.println("c="+c);
	}
}
public class ThrowDemo {
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		sample s=new sample();
		try {
			s.fun(10,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}


}
