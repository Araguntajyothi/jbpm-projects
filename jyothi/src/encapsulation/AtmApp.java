package encapsulation;
import java.util.Scanner;

class Customer {
	
	private long acno;
	private String name;
	private String gender;
	private double balance;
	

public Customer() {
		super();
		acno=1234;
		name="jyothi";
		gender="female";
		balance=20000;
	}

public Customer(long acno,String name,String gender,double balance)
	{
	   this.acno=acno;
	   this.name = name;
	   this.gender = gender;
	   this.balance = balance;
	}
	
	public long getAcno() {
		return acno;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance =this.balance+ balance;
	}

	public void balanceEnquiry()
	{
	   System.out.println("Balance in your account is "+balance+" rs");
	}

	public void withdraw(int amount)
	{
	    if(amount%100!=0 || amount<1)
	    	System.out.println("Please enter amount in multiples of hundreds");
	    else if(amount>balance)
	    	System.out.println("Insufficient balance in your account");
	    else
	    {
	        balance = balance -amount;
	        System.out.println("Collect your money");
	        System.out.println("remianing balance in your account is "+balance);
	    }
	}
	
	public void deposit(int amount)
	{
	    if(amount<100) 
	    	System.out.println("You must deposit minimum 100rs");
	    else
	    	balance = balance+amount;
	}

}
public class AtmApp
{
	
    public static void main(String args[])
    {   Customer c1=new Customer();
    System.out.println(c1);
        Customer c = new Customer(12344,"Shiva","Male",1000);
        Scanner s = new Scanner(System.in);
        int ch,amount;
        do
        {
        	 System.out.println("1.Balance Enquiry");
        	 System.out.println("2.Withdraw Money");
        	 System.out.println("3.Deposit Money");
        	 System.out.println("4.Exit");
        	 System.out.println("Enter Your choice");
        	 ch= s.nextInt();
        	 switch(ch)
        	 {
        	   case 1:
        		    c1.balanceEnquiry();
        		    break;
        	   case 2:
        		     System.out.println("Enter amount to withdraw");
        		     amount = s.nextInt();
        		     c1.withdraw(amount);
        		     break;
        	   case 3:
        		    System.out.println("Enter amount to deposit");
        		    amount = s.nextInt();
        		    c1.deposit(amount);
        		    break;
        	
        			case 4:
        		   break;
        	  default:
        		  System.out.println("Please select a valid choice");
        		break;    		    
            }
        }while(ch!=4);
    }
    
}


