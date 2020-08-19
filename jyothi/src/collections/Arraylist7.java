package collections;
import java.lang.reflect.Field;
import java.util.*;
public class Arraylist7
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)throws Exception
	{
		ArrayList<String> courseList=new ArrayList<String>();
		courseList.add("java");
		courseList.add(".net");
		courseList.add("php");
		courseList.add("oracle");
		courseList.add(".net");
		courseList.add("testing");
		courseList.add("java");
		
        
        System.out.println("Index of Java is "+courseList.indexOf("Java"));
        System.out.println("Last Index of .Net is "+courseList.lastIndexOf(".Net"));
        
        System.out.println("List size is "+courseList.size());
        System.out.println("List capacity is "+getCapacity(courseList));
        
        courseList.ensureCapacity(20);
      System.out.println("After ensure capacity list size is "+courseList.size());
      System.out.println("After ensure capacity List capacity is "+getCapacity(courseList));
        
        courseList.trimToSize();
        System.out.println("After trim size List size is "+courseList.size());
        System.out.println("After trim size List capacity is "+getCapacity(courseList));
        
        
        List<String> clonedList = ((ArrayList<String>)courseList.clone());
        System.out.println("Cloned List elements are "+clonedList);
    }

    static int getCapacity(ArrayList<?> list) throws Exception
    {
    	Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(list)).length;

	}
}

