package multithreding;


public	class Thread4 extends Thread 
	{
		public void run()
		{
			for (int i = 1; i <= 10; i++)
			{
				System.out.println(Thread.currentThread().getName()+":"+ i);
				try 
				{
					Thread.sleep(1000);
				} 
				catch (InterruptedException ie) 
				{
					System.out.println(ie);
				}
			}
		}

		public static void main(String args[])
		{
			Thread4 t1 = new Thread4();
			Thread4 t2 = new Thread4();
			Thread4 t3 = new Thread4();

			t1.setName("First Thread");
			t2.setName("Second Thread");
			t3.setName("Third Thread");
			t1.start();

			try
			{
				t1.join();
			} 
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}

			t2.start();
			t3.start();
		}
	}


