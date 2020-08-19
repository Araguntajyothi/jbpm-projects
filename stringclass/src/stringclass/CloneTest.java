package stringclass;

class Employee implements Cloneable
{
	private int id;
	private String name;
	
	public Employee(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
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

	public Employee clone() 
	{
       Employee emp =null;
       try
       {
                       emp = (Employee) super.clone();
       }
       catch(CloneNotSupportedException cns)
       {
    	   
       }
       return emp;
	}
}

class CloneTest
 {
	public static void main(String arg[])
	{
		Employee emp1 = new Employee(835907, "jyothi");

		System.out.println("Actual Object Details");
		System.out.println("Employee Id Is "+emp1.getId());
		System.out.println("Employee Name Is "+emp1.getName());
		
		Employee emp2 = emp1.clone();
		
		System.out.println("Cloned Object Details");
		System.out.println("Employee Id Is "+emp2.getId());
		System.out.println("Employee Name Is "+emp2.getName());	
	}
}

