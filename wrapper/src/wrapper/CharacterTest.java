package wrapper;
import java.io.*;
public class CharacterTest {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
          while(true)
          {
        	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        	  System.out.println("enter a char");
        	  char ch=(char)br.read();
        	  if(ch=='@')
        		  System.exit(0);
        	  else if(Character.isDigit(ch))
        		  System.out.println("it is a digit");
        	  else if(Character.isLowerCase(ch))
        		  System.out.println("it is a small letter");
        	  else if(Character.isUpperCase(ch))
        		  System.out.println("it is a capital letter");
        	  else if(Character.isSpaceChar(ch))
        		  System.out.println("it is a space bar");
        	  else if(Character.isWhitespace(ch))
        		  System.out.println("it is a whitespace");
        	  else
        		  System.out.println("i don't know that character");
          }
	}

}
