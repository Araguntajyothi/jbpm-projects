package exceptions;
class InvBalException extends Exception
{
	public String toString()
	{
		String s="Invalid amount.Balance should be minimum Rs.500";
		return s;
	}
}
class Account
{
	public float WithDraw(float bal,float amount)throws InvBalException
	{
		if(bal-amount<500)
			throw new InvBalException();
		return bal-amount;
	}
}
public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Account a1=new Account();
       try {
    	   float bal=a1.WithDraw(5000,4501);
    	   System.out.println("your balance is ="+bal);
    	   }
       catch(InvBalException e)
       {
      System.out.println(e);}
       
}
}