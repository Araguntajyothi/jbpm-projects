package collections;
import java.util.ArrayList;
public class Arraylist8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cricketersList = new ArrayList<String>();
	  	
        cricketersList.add("Dhoni");
        cricketersList.add("Sachin");
        cricketersList.add("Kohli");
        cricketersList.add("Sehwag");
        cricketersList.add("Raina");
        cricketersList.add("Rohith");
        
        System.out.println("Hash Code of list is "+cricketersList.hashCode());
        
        
        Object players[] =cricketersList.toArray();
        
        System.out.println("Players list is");
        
        for(Object player : players) 
             {
           System.out.println((String)player);
        }
       
        String team[] = new String[cricketersList.size()];
        
        
        cricketersList.toArray(team);
        
        System.out.println("Team list is ");
        for(String name : team)
             {
            System.out.println(name);
        }

	}

}
