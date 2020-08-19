package collections;
import java.util.ArrayList;
import java.util.List;
public class Arraylist6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> salaryList = new ArrayList<Double>();
        salaryList.add(8000.00);
        salaryList.add(10000.00);
        salaryList.add(12000.00);
        salaryList.add(15000.00);
        salaryList.add(17000.00);
        salaryList.add(19000.00);
        salaryList.add(20000.00);
        
        List<Double> salSublist =  salaryList.subList(1, 5);
        System.out.println("Salary Sublist is "+salSublist);
        
        salaryList.retainAll(salSublist);
      System.out.println("After applying retain all Salary List is  "+salaryList);
        
        salaryList.set(1, 100000.00);
     System.out.println("After replacing salary at index 1 List is "+salaryList);
        
        double sal = salaryList.get(3);
        System.out.println("Salary at index 3 is "+sal);

	}

}
