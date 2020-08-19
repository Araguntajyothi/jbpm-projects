package wrapper;
import java.util.*;
public class Weather1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of days");
		int days=s.nextInt();
		int[] temps=new int[days];
		int tempsum=0;
		for(int i=0;i<days;i++)
		{
			System.out.println("days"+(i+1)+"high temperature:");
			temps[i]=s.nextInt();
			tempsum +=temps[i];
			}
		double averagetemp=(double)tempsum/days;
		int numAboveAverage=0;
		for(int i=0;i<temps.length;i++) {
			if(temps[i]>averagetemp) {
				numAboveAverage++;
			}
		}
		System.out.println("sum of temperature is:"+tempsum);
		System.out.printf("average temp=%.1f\n",averagetemp);
		System.out.println(numAboveAverage +"days were above average");
         System.out.println();
		System.out.println("temperatures: "+Arrays.toString(temps));
		Arrays.sort(temps);
		System.out.println("coldest days:"+temps[0]+","+temps[1]);
		System.out.println("hottest days:"+temps[temps.length-2]+","+temps[temps.length-1]);

	}

}
