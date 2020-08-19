package wrapper;
import java.io.*;
public class ConvertIntegers {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter int:");
		 String str=br.readLine();
		 int n=Integer.parseInt(str);
		 System.out.println("in decimal="+n);
		 str=Integer.toBinaryString(n);
		 System.out.println("in binary="+str);
		 str=Integer.toHexString(n);
		 System.out.println("in hexadecimal="+str);
		 str=Integer.toOctalString(n);
		 System.out.println("in octal="+str);

	}

}
