package assignment;
import java.io.*;
import java.util.Scanner;

class Exception
{
	public static void main(String args[]) throws IOException
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
		catch (FileNotFoundException exp) {
			System.out.println("Exception with complete information");
			exp.printStackTrace();
		}
	}

	
}

