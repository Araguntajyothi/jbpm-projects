
package multithreding;
    import java.awt.Color;
	import java.awt.Frame;
	import java.awt.Graphics;
	public class MoveBall1 extends Frame implements Runnable {
		int xr,xg,xb;
		Thread red,green,blue;
		public MoveBall1()
		{
			red=new Thread(this,"red");
			green=new Thread(this,"green");
			blue=new Thread(this,"blue");
			red.start();
			green.start();
			blue.start();
			
			setVisible(true);
			setSize(1000,1000);
		}
		
		public void paint(Graphics g)
		{
			g.setColor(Color.red);
			g.fillOval(xr,100,100,100);
			g.setColor(Color.green);
			g.fillOval(xg,300,100,100);
			g.setColor(Color.blue);
			g.fillOval(xb,500,100,100);
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	MoveBall1 m=new MoveBall1();
		}
		@Override
		public void run() {
			while(true)
			{
				if(Thread.currentThread()==red)
				{
				xr++;
				try {
					if(xr==500) {
						synchronized(this) {
						wait();}
					}
					Thread.sleep(20);
			    }catch(InterruptedException e) {
					e.printStackTrace();
				}
			
			}
			if(Thread.currentThread()==green)
			{
				if(xr>=500)
					xg++;
				try {
					if(xg==500)
				{
						synchronized(this)
					  {
						notifyAll();}
					  }
					
					Thread.sleep(20);
				}
					catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			if(Thread.currentThread()==blue)
			{
				if(xr>=500)
					xb++;
				try {
					if(xb==500) {
						synchronized(this){
							notifyAll();}
				
					}
					Thread.sleep(20);
					}
					catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
				repaint();
				}
		
			}
	      }
		
	  

