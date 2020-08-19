package refasarray;
import java.util.*;
public class Mobile {
	String company;
	String model;
	float price;
	String color;
	void setDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter company name");
		company=s.next();
		System.out.println("enter mobile model");
		model=s.next();
		System.out.println("enter price of mobile");
		price=s.nextFloat();
		System.out.println("enter color of mobile");
		color=s.next();
		}
	void getDetails()
	{
		System.out.println("company of mobile is "+company);
		System.out.println("mobile model is "+model);
		System.out.println("price of mobile is "+price);
		System.out.println("color of mobile is "+color);
	}
	void copyDetails(Mobile m)
	{
		company=m.company;
		model=m.model;
		price=m.price;
		color=m.color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Mobile m1=new Mobile();
      Mobile m2=new Mobile();
      m1.setDetails();
      m2.copyDetails(m1);
      System.out.println("\nactual mobile details are\n");
      m1.getDetails();
      System.out.println("\n copied mobile details are\n");
      m2.getDetails();
      }
	}
