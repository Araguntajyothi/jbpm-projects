package multithreding;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("deprecation")
public class BouncingBall extends Applet implements ActionListener {
	
	Button bu;
	Ball b1,b2;
	int counter=0;
public void init()
{
	bu=new Button("start");
	add(bu);
	bu.addActionListener(this);
}
public void paint(Graphics g)
{
	try {
		g.setColor(Color.red);
		g.fillOval(b1.x,b1.y,b1.w,b1.h);
		g.setColor(Color.green);
		g.fillOval(b2.x, b2.y, b2.w, b2.h);
	}catch(NullPointerException e)
	{
		
	}
}
@Override
public void actionPerformed(ActionEvent ae) {
	// TODO Auto-generated method stub
	if(counter==0)
	{
		b1=new Ball(0,0,50,50);
		counter++;
	}
	else if(counter==1)
	{
		b2=new Ball(75,0,50,50);
		counter++;
	}
	else
	{
		bu.setEnabled(false);
	}
	
}
class Ball implements Runnable
{
	Thread t=null;
	int x,y,w,h,incr_x,incr_y;
	Ball(int x,int y,int w,int h)
	{
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		incr_x=1;
		incr_y=1;
		t=new Thread(this);
		t.start();
		}
	public void run()
	{
		while(true)
		{
			y=y+incr_y;
			x=x+incr_x;
			if((y==getSize().height-h)||(y==0))
				incr_y=(-1)*incr_y;
			if((x==getSize().width-w)||(x==0))
				incr_x=(-1)*incr_x;
			try {
				t.sleep(10);
			}catch(InterruptedException e) {
				
			}
			repaint();
		}
	}
}
}
	
