package multithreding;

public	class MultiTaskingTest2 implements Runnable
	{
		public void run() 
		{
			System.out.println("task one");
		}

		public static void main(String args[]) 
		{
			// passing anonymous object
	                   Thread t1 = new Thread(new MultiTaskingTest2());												 
			Thread t2 = new Thread(new MultiTaskingTest2());

			t1.start();
			t2.start();
		}
	}



