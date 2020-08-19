package collections;

import java.util.ArrayList;
public class Arraylist1 {
public static void main(String[] args) {
		ArrayList list1 = new ArrayList();  
        list1.add("akshaya");
		list1.add(10);
		list1.add(3.5);
		list1.add('A');
		list1.add(null);
		list1.add("jyothi");
        System.out.println(list1);

		ArrayList<String> list2 = new ArrayList<String>(20);

		list2.add("iam");
		list2.add("from");
		list2.add("m.p");
		list2.add("sendhwa");
		

		System.out.println(list2);
		}
	}
