package stringclass;
class String4 {

	 public static void main(String args[])
	 {
		 String s1="akshaya jyothi";
		 
		 System.out.println(s1.startsWith("aks"));
		 System.out.println(s1.startsWith("jyo"));
		 System.out.println(s1.endsWith("thi")); 
		 
		 System.out.println(s1.indexOf('t'));
		 System.out.println(s1.indexOf('t',8));
		 
		 System.out.println(s1.indexOf("th"));
		 System.out.println(s1.indexOf("h",5));
		 System.out.println(s1.indexOf("abc"));
		 
		 System.out.println(s1.lastIndexOf('t'));	
		 System.out.println(s1.lastIndexOf("th"));
		 
		 System.out.println(s1.contains("aks"));
		 System.out.println(s1.contains("abc"));
		
	  }

}

