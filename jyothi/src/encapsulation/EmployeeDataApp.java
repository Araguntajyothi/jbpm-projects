package encapsulation;
class Employee{
	
public int id;
public String name;

public int getId()
      {
	return id;
}

public void setId(int id) 
      {
	this.id = id;
}

public String getName() 
      {
	return name;
}

public void setName(String name)
     {
	this.name = name;
}


public boolean AddEmployee(Employee emp) 
     {
	createDBConnection();
	return checkIfEmployeeExists();
}

private boolean checkIfEmployeeExists() 
      {
	
	return true;
}

private void createDBConnection()
     {
 }
}

class EmployeeDataApp
{

public static void main(String args[])
     {
	Employee emp = new Employee();
	emp.setId(1992);
	emp.setName("Swapna");
	emp.AddEmployee(emp);
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	System.out.println(emp.AddEmployee(emp));
}
}









