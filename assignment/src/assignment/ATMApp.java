package assignment;
import java.util.*;
 class InsufficientBalanceException extends RuntimeException
{
	public InsufficientBalanceException()
	{
	   super();
	}
	
	public InsufficientBalanceException(String message)
	{
		super(message);
	}
	
	public InsufficientBalanceException(Throwable cause)
	{
		super(cause);
	}
	
	public InsufficientBalanceException(String message, Throwable cause)
	{
		super(message, cause);
	}
}


class Customer 
{
	private long accountNumber;
	private String name;
	private float balance;

	public Customer(long accountNumber, String name, float balance)
	{
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public long getAccountNumber()
	{
		return accountNumber;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public float getBalance()
	{
		return balance;
	}

	public void setBalance(float balance)
	{
		this.balance = balance;
	}

	public void withdraw(int amount)
	{
		if (amount > balance) 
		{
		throw new InsufficientBalanceException("No sufficient balance");
		} 
		else 
		{
			balance = balance - amount;
		}

	}
	
}




public class ATMApp
{
	public static void main(String[] args)
	{
		Customer ct = new Customer(1122334455,"Yakanna",20000);
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter amount to withdraw");
		int amount=s.nextInt();
	
	
		try
		{
			ct.withdraw(amount);
			System.out.println("Collect your money");
	        System.out.println("Available balance is " + ct.getBalance()+" rs");
	        
		}
		
		catch(InsufficientBalanceException ibe)
		{
			System.out.println("No sufficient balance in your account");
		System.out.println("Available balance is "+ct.getBalance()+" rs");
		}	
	}
}

