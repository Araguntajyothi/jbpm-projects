package vector;

	import java.util.HashSet;
	import java.util.Iterator;

	public class HashSet1 {

	    public static void main(String args[]) {
		  HashSet <String> courses=new HashSet<String>();
		  
		  courses.add("Java");
		  courses.add(".Net");
		  courses.add("Java");
		  courses.add("PHP");
		  courses.add("Android");
		  courses.add(".Net");
		  courses.add("C");
		  courses.add("C++");
		  
		  System.out.println("All courses are");
		  
		  Iterator<String> courseItr = courses.iterator();
		  
		  while(courseItr.hasNext())
		  {
			  System.out.println(courseItr.next());
		  }	  
	     }
	}


