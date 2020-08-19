package fileio;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Integer {
 
  public static void main(String[] args) {
   
  String strFilePath = "F://Int.txt";
   
    try
    {
      
      FileOutputStream fos = new FileOutputStream(strFilePath);
       DataOutputStream dos = new DataOutputStream(fos);
       int i = 100;
       dos.writeInt(i);
       dos.close();
        
        FileInputStream fin = new FileInputStream(strFilePath);
         DataInputStream din = new DataInputStream(fin);
        i = din.readInt();
         System.out.println(i);
         din.close();
        
    }
    catch (IOException e)
    {
      System.out.println("IOException : " + e);
    }
   
  }
}