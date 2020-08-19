package stringclass;
class String6 {
	
	public static void main(String args[])
	{
	
		String joinString1=String.join("-","welcome","jyoshitha","reddy");  
		System.out.println(joinString1);  

		String s="jyoshitha reddy";
		String s1[]=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
			System.out.println(s1[i]);
		
		int num =100;
		
		String str = String.valueOf(num);
		
		System.out.println(str+10);
		
	}

}

