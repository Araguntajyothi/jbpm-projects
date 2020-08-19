package fileio;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
public class WriteStringToFile {
 
  public static void main(String[] args) {
   
    String strFilePath = "F://String.txt";
   
    try
    {
     
     FileOutputStream fos = new FileOutputStream(strFilePath);
     DataOutputStream dos = new DataOutputStream(fos);
     String str = "This string will be written to file as sequence of characters!";
     dos.writeChars(str);
     dos.close();
     
     FileInputStream fin = new FileInputStream(strFilePath);
     DataInputStream din = new DataInputStream(fin);
     char ch = din.readChar();
     System.out.println("str :"+str);
     din.close();
   
    }
    catch (IOException e)
    {
      System.out.println("IOException : " + e);
    }
 
  }
}

