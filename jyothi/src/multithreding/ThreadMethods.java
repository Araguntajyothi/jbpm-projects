package multithreding;
	class ThreadMethods implements Runnable {

		public void run() 
	             {
		        System.out.println("Run Method executed");
		   }	
		
		public static void main(String args[])
	          {
			ThreadMethods mt = new ThreadMethods();
			Thread t = new Thread(mt);
			System.out.println(t);
			System.out.println("Thread Name " + t.getName());
			System.out.println("Thread Id   " + t.getId());
			t.setName("Java");
			System.out.println("Thread Name " + t.getName());
			System.out.println("Thread Id   " + t.getId());
			System.out.println("Thread Default Priority " + t.getPriority());
			t.setPriority(3);
			System.out.println("Priority " + t.getPriority());
			System.out.println("Is Alive? " + t.isAlive());
			System.out.println("Is Daemon Thread?  "+t.isDaemon());
			t.start();
			System.out.println("Is Alive? " + t.isAlive());
		}
	}


