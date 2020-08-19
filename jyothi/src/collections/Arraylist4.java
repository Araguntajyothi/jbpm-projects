package collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> courses = new ArrayList<String>();
        
        courses.add("JAVA");
        courses.add(".NET");
        courses.add("C");
        courses.add("C++");
        courses.add("PHP");
        courses.add("PYTHON");
        
        System.out.println("Enter a course name to search");
        String course = new Scanner(System.in).next().toUpperCase();
        
        if(courses.contains(course))
        {
        	System.out.println(course+" is available in course list");
        }
        else
        {
        	System.out.println(course+" is not available in course list");
        }
        
        ArrayList<String> subCourses = new ArrayList<String>();
        
        subCourses.add("C");
        subCourses.add("JAVA");
        subCourses.add("PYTHON");
        subCourses.add("SQL");
        
        System.out.println("Does course list contain all sub courses? "+courses.containsAll(subCourses));      

	}

}
