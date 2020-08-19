package multithreding;
class StaticSynchronizedMethod implements Runnable
{
	public void run()
	{
		String  threadName = Thread.currentThread().getName();
		if (threadName.equals("two"))
			printTable(2);
		else if (threadName.equals("three"))
			printTable(3);
		else if (threadName.equals("four"))
			printTable(4);
		else
			printTable(5);
	}

        synchronized static void printTable(int n) // static method synchronized
	{
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(n + "*" + i + " = " + n * i);
			
			try 
			{
				Thread.sleep(300);
			} 
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String args[])
	{
		StaticSynchronizedMethod even = new StaticSynchronizedMethod();
		StaticSynchronizedMethod odd = new StaticSynchronizedMethod();
		
		Thread t1 = new Thread(even, "two");
		Thread t2 = new Thread(even, "four");

		Thread t3 = new Thread(odd, "three");
		Thread t4 = new Thread(odd, "five");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
