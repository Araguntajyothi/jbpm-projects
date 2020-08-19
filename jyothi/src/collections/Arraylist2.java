package collections;
import java.util.ArrayList;
public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
        list.add("C");
		list.add("C++");
		list.add("Java");
        System.out.println("List elements are " + list);
        System.out.println("Size of the arraylist is: " + list.size());
        System.out.println("Is arraylist empty? " + list.isEmpty());
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("C");
		list1.add("C++");
		list1.add("Java");
		System.out.println("Are list and list1 equal? " + list.equals(list1));
		list1.clear();
		System.out.println("Is list1 empty? " + list1.isEmpty());

	}

}
