package refasarray;

import java.util.Scanner;

public class Vehicle {

	String regno;
	String name;
	String company;
	float price;
	void setDetails()
	{   
		Scanner s = new Scanner(System.in);
		System.out.println("enter registration number");
		regno=s.nextLine();
		System.out.println("enter vehicle name");
		name=s.nextLine();
		System.out.println("enter company name");
		company=s.nextLine();
		System.out.println("enter price of a vehicle");
	price=Float.parseFloat(s.nextLine());
}
	void getDetails()
	{
		System.out.println("vehicle registration number is "+regno);
		System.out.println("vehicle name is "+name);
		System.out.println("company name is"+company);
		System.out.println("price of vehicle is"+price);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of vehicles");
		int size=s.nextInt();
		Vehicle v[]=new Vehicle[size];
		int i;
		for(i=0;i<v.length;i++)
		{
			v[i]=new Vehicle();
			System.out.println("enter vehicle"+(i+1)+"details\n");
			v[i].setDetails();
		}
		for(i=0;i<v.length;i++)
		{
			System.out.println("\nvehicle"+(i+1)+"details are\n");
			v[i].getDetails();
		}
	}
}

