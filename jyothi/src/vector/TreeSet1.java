package vector;
	import java.util.Iterator;
	import java.util.TreeSet;

	public class TreeSet1 
	{
		public static void main(String a[]) 
		{
			TreeSet<Integer> set = new TreeSet<Integer>();

		    set.add(23);

			set.add(11);

			set.add(41);

			set.add(7);

			set.add(69);

			set.add(18);

			set.add(38);

		Iterator<Integer> itr = set.iterator();
			
			while(itr.hasNext())
			{
			   System.out.println(itr.next());
			}
		}
	}



