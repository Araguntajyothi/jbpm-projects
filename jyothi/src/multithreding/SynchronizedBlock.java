package multithreding;

	class SynchronizedBlock implements Runnable
	{
		public void run() 
		{
			display();
		}

		void display()
		{
			Thread t = Thread.currentThread();
		System.out.println("Non Synchronized code accessed by " + t.getName());

			synchronized (this) 
			{
				System.out.println("Synchronized code accessing by ");
				
				for (int i = 1; i <= 5; i++) 
				{
					System.out.println(t.getName());

					try 
					{
						Thread.sleep(500);
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		}

		public static void main(String args[])
		{
			SynchronizedBlock sb = new SynchronizedBlock();// only one object

			Thread t1 = new Thread(sb, "Thread1");
			Thread t2 = new Thread(sb, "Thread2");

			t1.start();
			t2.start();
		}
	}


