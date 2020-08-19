package vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector1
 {
	 public static void main(String a[])
           {
	        Vector<String> fruits = new Vector<String>();
	        
	        fruits.add("Apple");
	        fruits.add("Mango");
	        fruits.add("Banana");
	        fruits.add("Grapes");
	        
	        System.out.println("Accessing elements using Enumeration");
	        Enumeration<String> enm =  fruits.elements();
	        while(enm.hasMoreElements()) 
                 {
	            System.out.println(enm.nextElement());
	        }
	        
	        System.out.println("\nAccessing elements using Iterator");
	        Iterator<String> itr =  fruits.iterator();
	        while(itr.hasNext())
                 {
	            System.out.println(itr.next());
	        }
	  }
}


