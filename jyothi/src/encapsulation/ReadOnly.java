package encapsulation;

public class ReadOnly {

	private int r;
	public ReadOnly()
	{
		r=5;
	}
	public ReadOnly(int read)
	{
		r=read;
	}
	public void print()
	{
		System.out.println(r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ReadOnly r1=new ReadOnly();
       ReadOnly r2=new ReadOnly();
       ReadOnly r3=new ReadOnly(17);
       ReadOnly r4=new ReadOnly(20);
       r1.print();
       r2.print();
       r3.print();
       r4.print();
       }
	}
