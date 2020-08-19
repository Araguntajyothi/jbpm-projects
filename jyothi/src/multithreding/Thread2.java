package multithreding;

	class Thread2 implements Runnable 
	{
		public void run() 
	         {
			for (int i = 1; i <= 10; i++){
				System.out.println(i);
			}
		}

		public static void main(String args[]){
			Thread2 th = new Thread2();
			Thread t = new Thread(th);
			t.start();
		}
	}



