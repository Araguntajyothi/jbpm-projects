package fileio;
import java.io.*;  
public class DataOutput {  
    public static void main(String[] args) throws IOException { 
    	InputStream input = new FileInputStream("F:\\testout.txt");  
	    DataInputStream inst = new DataInputStream(input);  
	    int count = input.available();  
	    byte[] ary = new byte[count];  
	    inst.read(ary);  
	    for (byte bt : ary) {  
	      char k = (char) bt;  
	      System.out.print(k+"-");  
	      
	    }
        FileOutputStream file = new FileOutputStream("F:\\testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close(); 
        System.out.println();
        System.out.println("Succcess...");  
    }  
}  
