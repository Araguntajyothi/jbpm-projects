package fileio;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
public class ByteToFile {
 
  public static void main(String[] args) {
   
    String strFilePath = "F://Byte.txt";
   
    try
    {
      
      FileOutputStream fos = new FileOutputStream(strFilePath);
      DataOutputStream dos = new DataOutputStream(fos);
      int i = 1;
      dos.writeByte(i);
      dos.close();
      
      FileInputStream fin = new FileInputStream(strFilePath);
      DataInputStream din = new DataInputStream(fin);
       byte b[] = new byte[10];
        din.read(b);
        System.out.println(i);
        din.close();
      

    }
    catch (IOException e)
    {
      System.out.println("IOException : " + e);
    }
 
  }
}
