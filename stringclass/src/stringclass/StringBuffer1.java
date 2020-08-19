package stringclass;
class StringBuffer1 {
	
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Akshaya Jyothi");
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		StringBuffer sb2=new StringBuffer(30);
		System.out.println(sb2.capacity());
		sb1.append("Akshaya");
		System.out.println(sb1);
		sb1.append("Jyothi");
		System.out.println(sb1);
		sb2.insert(0, "Akshaya");
		System.out.println(sb2);
		sb2.insert(4, "Jyothi");
		System.out.println(sb2);		
	}
}



