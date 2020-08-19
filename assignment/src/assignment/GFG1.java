package assignment;
import java.lang.annotation.Retention; 
import java.lang.annotation.RetentionPolicy; 
import java.lang.reflect.Method; 
  
public class GFG1{ 
    public static void main(String[] args) 
    { 
  
       
        Method[] methods = GFGDemoClass.class.getMethods(); 
  
       
CreatedAnnotation annotation = methods[0] .getAnnotation( CreatedAnnotation .class); 
               System.out.println("Name: " + annotation.Name()); 
               System.out.println("ID: " + annotation.ID()); 
    } 
} 
  class GFGDemoClass { 
    private String field; 
    
  @CreatedAnnotation(Name = "Akshaya jyothi",  ID = 404) 
    public String 
    getField() 
    { 
        return field; 
    } 
} 
@Retention(RetentionPolicy.RUNTIME) 
@interface CreatedAnnotation { 
    public String Name(); 
    public int ID(); 
} 
