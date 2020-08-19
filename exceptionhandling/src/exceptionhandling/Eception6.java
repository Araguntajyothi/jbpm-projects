package exceptionhandling;
import java.util.Scanner;
class Date {
	public static boolean isLeapYear(int year) 
         {
		if (year < 1) 
                   {
	throw new IllegalArgumentException("Year value should be positive");
		}

		if (year % 400 == 0)
			return true;
		else if (year % 100 == 0)
			return false;
		else if (year % 4 == 0)
			return true;
		else
			return false;
	}
}

class Exception6 {

	public static void main(String args[]){
		int year;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any year");
		year = input.nextInt();

		try{
			if (Date.isLeapYear(year))
				System.out.println(year + " is a leap year");
			else
				System.out.println(year + " is not a leap year");
		} 
                   catch (IllegalArgumentException ia) 
                   {
			System.out.println(ia.getMessage());
		}
	}
}

