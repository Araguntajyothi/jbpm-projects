package encapsulation;

public class Person {
	private String name;
	private String gender;
	private int age;

	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		if (name == null || name=="")
		{
			System.out.println("Name should not be empty");
		}
                    else 
		{
			this.name = name;
		}
	}
	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		if (!gender.toLowerCase().equals("male")
				&& !gender.toLowerCase().equals("female"))
		{
			System.out.println("Please enter gender as male or female");
		} 
		else 
		{
			this.gender = gender.toLowerCase();
		}
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		if (age >= 1 && age <= 120)
		{
			this.age = age;
		} 
		else 
		{
			System.out.println("Please enter age between 1 and 120");
		}
	}

	public static void main(String[] args) 
	{
		Person p = new Person();
		p.setName("Ammu");
		p.setGender("Female");
		p.setAge(24);

		System.out.println("Person name is " + p.getName());
		System.out.println("Gender is " + p.getGender());
		System.out.println("Age is " + p.getAge());
	}
}


