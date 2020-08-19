package encapsulation;
 class SimpleStaticProg
{
	private int a;
	public static int count=0;
	public SimpleStaticProg()
	{
		a=10;
	
		}
	public void change()
	{
		a=a+1;
		System.out.println(a);
	}
	
}
public class SimpleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleStaticProg s1=new SimpleStaticProg();
		s1.change();
		 SimpleStaticProg.count= SimpleStaticProg.count+1;
		System.out.println( SimpleStaticProg.count);
		SimpleStaticProg s2=new SimpleStaticProg();
        s2.change();
        SimpleStaticProg.count= SimpleStaticProg.count+1;
        System.out.println( SimpleStaticProg.count);
	}
}
