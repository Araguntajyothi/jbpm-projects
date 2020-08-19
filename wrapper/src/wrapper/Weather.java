package wrapper;
import java.util.*;
public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of days");
		int days=s.nextInt();
		int[] temps=new int[days];
		int tempsum=0;
		for(int i=0;i<days;i++)
		{
			System.out.println("days"+(i+1)+"temperatures:");
			temps[i]=s.nextInt();
			tempsum +=temps[i];
			}
		double averagetemp=(double)tempsum/days;
		
		System.out.println("sum of temperature is:"+tempsum);
		System.out.printf("average temp=%.1f\n",averagetemp);
		System.out.println("temperatures: "+Arrays.toString(temps));
	
		
	}

}
