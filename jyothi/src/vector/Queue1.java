package vector;

	import java.util.*;

	class Queue1 
	{
	    public static void main(String args[])
	    {
		  Queue<Integer> queue = new LinkedList<Integer>();
		  
		  queue.add(10);
		  queue.add(20);
		  queue.add(30);
		  queue.offer(40);
		  queue.offer(50);
		  queue.offer(60);
		  
		  System.out.println("First element in queue is "+queue.element());
		  System.out.println("First element in queue is "+queue.peek());
		  
		  int x = queue.remove();
		  System.out.println("Removed element is "+x);
		  System.out.println("After remove queue is");
		  System.out.println(queue);
		  
		  int y = queue.poll();
		  System.out.println("Poll element is "+y);
		  System.out.println("After poll Queue is");
		  System.out.println(queue);
	    }
	}



