package stringclass;
class StringBuffer2 {

	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Akshaya Jyothi");
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());
		sb.reverse();
		sb.delete(0, 5);
		System.out.println(sb);
		String s="abc";
		s=s+sb;
		System.out.println(s);
		String s1=sb.toString();
		System.out.println(s1);
		
	}
}
