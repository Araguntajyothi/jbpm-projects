package multithreding;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;


public class FourBalls extends Frame implements Runnable {
	int x1,x2=600,y1,y2=600;
	Thread t1,t2,t3,t4;
	public FourBalls()
	{
		t1=new Thread(this,"t1");
		t2=new Thread(this,"t2");
		t3=new Thread(this,"t3");
		t4=new Thread(this,"t4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		setVisible(true);
		setSize(1000,1000);
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(x1, 300, 100, 100);
		g.setColor(Color.green);
		g.fillOval(x2, 300, 100, 100);
		g.setColor(Color.blue);
		g.fillOval(300, y1, 100, 100);
		g.setColor(Color.yellow);
		g.fillOval(300, y2, 100, 100);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FourBalls f=new FourBalls();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			//if(x1>=0 && x1<=600) {
			x1++;
			x2--;
			y1++;
			y2--;
			//}
			//else
			//{
				//x1--;
				//x2++;
				//y1--;
				//y2++;
			//}
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
	}

}
