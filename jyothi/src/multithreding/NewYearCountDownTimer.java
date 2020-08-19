package multithreding;

public	class NewYearCountDownTimer extends Thread
	{
		private static final String count[] = { "Ten", "Nine", "Eight", "Seven","Six", "Five", "Four", "Three", "Two", "One" };
		
		public void run()
		{
			for (int i = 0; i < 10; i++) 
			{
				System.out.println(count[i]);
				try 
				{
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}

			System.out.println("Happy New Year");
		}
		public static void main(String args[])
		{
		NewYearCountDownTimer timer = new  NewYearCountDownTimer();
			timer.start();
		}
	}


