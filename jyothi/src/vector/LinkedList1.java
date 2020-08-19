package vector;
import java.util.*;

class LinkedList1 
{
	public static void main(String args[])
	{
		LinkedList<String> actorsList = new LinkedList<String>();
		
		actorsList.add("Chiru");
		actorsList.add("Nag");
		actorsList.add("Venky");
		actorsList.add("Mahesh");
		actorsList.add("Pawan");
		actorsList.add("NTR");
		
		System.out.println("First actor in list is "+actorsList.getFirst());
		System.out.println("Last actor in list is "+actorsList.getLast());
	    
		actorsList.removeFirst();
		actorsList.removeLast();
		
		Iterator <String> actors =actorsList.iterator();
		System.out.println("Left to right all acters list is");
		
		while(actors.hasNext())
		{
			System.out.println(actors.next());
		}
		
		actorsList.addFirst("Prabhas");
		actorsList.addLast("Charan");
		actorsList.add(2, "Raviteja");
		
		System.out.println("\nRight to left all actors list");
		
	          Iterator<String> actor = actorsList.descendingIterator();
	    
	          while(actor.hasNext())
	         {
	    	     System.out.println(actor.next());
	          }
	}
}


