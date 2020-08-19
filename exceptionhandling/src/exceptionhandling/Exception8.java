package exceptionhandling;
import java.io.*;
import java.util.*;

class TextFileReader 
{
	public void readFile(String fileName) throws IOException 
	{
		if (fileName == null) 
		{
		throw new NullPointerException("File name should not be null");
		}
		if (!getFileExtension(fileName).equals(".txt")) 
		{
	throw new IllegalArgumentException("Please enter a text file name");
		}

	try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
		{
			String line;

			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
		}
	}

	private static String getFileExtension(String fileName)
	{
		fileName = fileName.toLowerCase();
	if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
			return fileName.substring(fileName.lastIndexOf("."));
		else
			return "";
	}
}

class Exception8 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any text file name with complete path");
		String fileName = s.next();

		TextFileReader tfr = new TextFileReader();

		try
		{
			tfr.readFile(fileName);
		} 
		catch (IllegalArgumentException ia) 
		{
			System.out.println(ia.getMessage());
		} 
		catch (FileNotFoundException exp) 
		{
			System.out.println(fileName + " File is not available");
		} 
		catch (IOException exp)
                     {
			exp.printStackTrace();
		}
	}
}


