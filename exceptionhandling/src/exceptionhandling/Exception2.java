package exceptionhandling;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

class Exception2
 {
	public static void main(String args[]) 
          {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any text file name to read data");
		String fileName = s.next();
		try 
                    {
		String content = new String(Files.readAllBytes(Paths.get(fileName)));	
			System.out.println(content);
		} 
                    catch (NoSuchFileException nsf) {
			System.out.println("File " + fileName + " does not exist.");
			System.out.println("Please enter valid file name and path");
		} 
                    catch (AccessDeniedException ade) {
			System.out.println("You don't have permission to access file "
					+ fileName);
		}
                     catch (IOException io) {
			System.out.println("Error: " + io.getMessage());
		}
	}
}

