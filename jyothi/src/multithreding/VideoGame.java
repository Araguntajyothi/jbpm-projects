package multithreding;


	class VideoGame implements Runnable
	{		
		public void run()
		{
			if(Thread.currentThread().getName().equals("Gun"))
			{
				fireGun();
			}
			else
			{
				moveFlight();
			}
		}
		
	         void fireGun()
		{
		   for(int i=1;i<=10;i++)
			 {
				    System.out.println("Gun is firing");
				    try
					 {
				       Thread.sleep(500);
				     }
				    catch(Exception e)
				    {
					   System.out.println(e);
				    }
			 }
		}




	        void moveFlight()
		{
			for(int i=1;i<=10;i++)
			 {
				System.out.println("Flight moving"); 
				try
				 {
					Thread.sleep(1000);
				 }
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
			 }
		}

		public static void main(String args[])
		{
		   VideoGame vg=new VideoGame();
		   Thread t1=new Thread(vg,"Gun");
		   Thread t2=new Thread(vg,"Flight");
		   t1.start();
		   t2.start();
		}
	}


