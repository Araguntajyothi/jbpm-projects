package multithreding;

public	class Thread5 implements Runnable
	{
		public void run() 
		{
			Thread t = Thread.currentThread();
			
			if (t.isDaemon())
			{
				System.out.println(t.getName()+" is Daemon Thread");
			} 
			else
			{
				System.out.println(t.getName()+" is User Thread");
			}
		}

		public static void main(String[] args)
		{
			Thread5 th = new Thread5();
			
		

			Thread t1 = new Thread(th,"Thread1");
			Thread t2 = new Thread(th,"Thread2");
			Thread t3 = new Thread(th,"Thread3");
			
			t1.setDaemon(true);

			t1.start();
			t2.start();
			t3.start();
		}
	}


