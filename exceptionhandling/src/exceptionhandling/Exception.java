package exceptionhandling;
import java.io.*;
import java.util.Scanner;

class Exception{
	
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any text file name to read data");
		String fileName = s.next();

	try (BufferedReader br =new BufferedReader(new FileReader(fileName)))
		{
			String line;

			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
		} 
		catch (FileNotFoundException exp)
		{
			System.out.println("File " + fileName + " does not exist.");
			System.out.println("Please enter valid file name and path");
		} 
		catch (IOException io) 
		{
			System.out.println("Error: " + io.getMessage());
		} 
	}
}