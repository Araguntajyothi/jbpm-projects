package multithreding;

public class ThreadDemo extends Thread {
Thread holdpen,draw,holdbyte,swallow;
public ThreadDemo()
{
	holdpen=new Thread(this,"holdpen");
	draw=new Thread(this,"draw");
	holdbyte=new Thread(this,"holdbyte");
	swallow=new Thread(this,"swallow");
	draw.setPriority(Thread.MAX_PRIORITY);
	holdpen.start();
	draw.start();
	holdbyte.start();
	swallow.start();
}
public void run()
{
	for(int i=0;i<10;i++)
	{
		System.out.println(Thread.currentThread().getName());
		
		try {
			Thread.sleep(500);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadDemo td=new ThreadDemo();
	}

}
