package stringclass;
class StringBuffer3 {

	 public static void main(String args[])
	 {
		 StringBuffer sb=new StringBuffer("Akshaya Jyothi");
		 System.out.println(sb.indexOf("aya"));
		 System.out.println(sb.lastIndexOf("jyo"));
		 sb.replace(9, 13, "Hyd");
		 System.out.println(sb);
	           String s=sb.substring(10);
	           System.out.println(sb);
	          System.out.println(s);
	          s=sb.substring(5,8);
	          System.out.println(s);    
	 }
}




