import java.util.StringTokenizer;

public class Calculation1 {
	 public static void  reverse(){  
		  
	       String input="jyothi";
	       char[] c=input.toCharArray();
	       for(int i=c.length-1;i>=0;i--)
	    	   System.out.println(c[i]);
	    }
	 public static void  upper(){  
		  int i,n;
		  char c;
	       String input="jyothi";
	       
	       for( i=0;i<input.length();i++) {
	    	   
	       c=input.charAt(i);
	       if(c>=97 && c<=122) {
	    	   n=c-32;
	    	 c=  (char) n;
	       }
	       input=input+c;
	       }
	    	   System.out.println("\n upper case:"+input);
	    	   input=" ";
	    }
	 public static void  lower(){  
		  int i,n;
		  char c;
	       String input="JYOTHI";
	       
	       for( i=0;i<input.length();i++) {
	    	   
	       c=input.charAt(i);
	       if(c>=65 && c<=90) {
	    	   n=c+32;
	    	 c=  (char) n;
	       }
	       input=input+c;
	       }
	    	   System.out.println("\n lower case:"+input);
	    	   input=" ";
	    }

	
}

