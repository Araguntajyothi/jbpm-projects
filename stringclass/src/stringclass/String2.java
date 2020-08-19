package stringclass;
class String2{

	public static void main(String args[])
	{
		String s1 = "Jyothi";
		String s2 = "Jyothi";
		String s3 = new String("Jyothi");
		String s4="JyoTHI";
		
		System.out.println("s1 == s2 ? "+(s1==s2)); 
		System.out.println("s1 == s3 ? "+(s1==s3)); 
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));		
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4)); 
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s4.compareTo(s1));
		System.out.println(s1.compareToIgnoreCase(s4));
		
	}
}

