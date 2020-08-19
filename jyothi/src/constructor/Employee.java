package constructor;

public class Employee {
	String name;
	String gender;
	int id;
	float salary;
	

	public Employee(String name, String gender, int id, float salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.salary = salary;
	}
	Employee(Employee emp)
	{
		name=emp.name;
		gender=emp.gender;
		id=emp.id;
		salary=emp.salary;
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("jyothi","female",404,50000.0f);
		Employee emp2=new Employee(emp1);
		System.out.println("actual employee details are");
		System.out.println("employee1 name is "+emp1.getName());
	    System.out.println("employee1 gender is "+emp1.getGender());
		System.out.println("employee1 id is "+emp1.getId());
		System.out.println("employee1 salary is "+emp1.getSalary());
		
		System.out.println("copied employee details are");
		System.out.println("employee1 name is "+emp2.getName());
		System.out.println("employee1 gender is "+emp2.getGender());
		System.out.println("employee1 id is "+emp2.getId());
		System.out.println("employee1 salary is "+emp2.getSalary());
		
	}

}
