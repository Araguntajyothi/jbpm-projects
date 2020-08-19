package collections;
import java.util.ArrayList;
public class Arraylist3 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("akshaya");
		list1.add("jyothi");

		
		list1.add(1, "geetha");
		System.out.println("Array List elemets at specified index are: " + list1);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("prasad");
		list2.add("sudarshan");

		
		list1.addAll(list2);
		System.out.println("Add all at end  are " + list1);

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("sai");
		list3.add("kalyan");

		
		list1.addAll(2, list3);
		System.out.println("Add all elements at specified index  are " + list1);


	}

}
