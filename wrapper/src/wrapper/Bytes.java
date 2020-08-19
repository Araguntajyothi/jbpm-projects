package wrapper;
import java.io.*;
public class Bytes {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter a byte number");
		 String str=br.readLine();
		 Byte b1=new Byte(str);
		 System.out.println("enter another byte number");
		 str=br.readLine();
		 Byte b2=Byte.valueOf(str);
		 int n=b1.compareTo(b2);
		 if(n==0)
			 System.out.println("both same");
		 else
			 if(n>0)
				 System.out.println(b1+"is bigger than"+b2);
			 else 
				 System.out.println(b1+"is lesser than"+b2);
		 }
	}
