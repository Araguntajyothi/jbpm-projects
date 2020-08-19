package multithreding;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
public class MoveBall extends Frame implements Runnable {
	int xr,xg;
	Thread red,green;
	public MoveBall()
	{
		red=new Thread(this,"red");
		green=new Thread(this,"green");
		red.start();
		green.start();
		
		setVisible(true);
		setSize(500,500);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(xr,100,100,100);
		g.setColor(Color.green);
		g.fillOval(xg,200,100,100);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MoveBall m=new MoveBall();
	}
	@Override
	public void run() {
		while(true)
		{
			if(Thread.currentThread()==red)
			{
			xr++;
			try {
				if(xr==500)
					notifyAll();
				Thread.sleep(500);
			    }catch(InterruptedException e) {
				e.printStackTrace();
			}
		repaint();
	}
	if(Thread.currentThread()==green)
	{
		xg++;
		try {
			if(xr==1)
				wait();
			Thread.sleep(500);
		    } catch(InterruptedException e) {
			e.printStackTrace();
		}
		repaint();
		}
      }
	}
  }
