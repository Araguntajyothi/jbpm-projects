
public class Calculation {

	public int Max(int arr[])
	{
		
		int  max;
		
		 max = arr[0];

		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] > max) 
			{
				max = arr[i];
			}
		}
		return max;
	}
	public int Min(int arr[]) {
		int min;
		
		 min = arr[0];

		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] < min) 
			{
				min = arr[i];
			}
		}
		return min;
	}
	
	
}
