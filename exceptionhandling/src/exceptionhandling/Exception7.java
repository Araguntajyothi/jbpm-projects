package exceptionhandling;
class User 
{
	private String name;
	private String gender;
	private int age;

	public User(String name, String gender, int age)
           {
		if (name.isEmpty() || name == null)
                    {
		 throw new NullPointerException("User name should not be empty");
		}

		this.gender = gender.toLowerCase();

		if (!this.gender.equals("male") && !this.gender.equals("female")) 
                     {
	    throw new IllegalArgumentException("Gender must be male or female");
		}

		if (age < 1 || age > 120) 
                     {
                         throw new IllegalArgumentException("Invalid Age. Age must be between 1 and 120");
		}
		this.name = name;
		this.age = age;
	}

	public String getName() 
           {
		return name;
	}
	public void setName(String name) 
           {
		if (name.isEmpty() || name == null)
                     {
		throw new NullPointerException("User name should not be empty");
                      }

		this.name = name;
	}

	public String getGender() 
           {
		return gender;
	}

	public void setGender(String gender)
           {
		this.gender = gender.toLowerCase();

		if (!this.gender.equals("male") && !this.gender.equals("female"))  
                     {        
	throw new IllegalArgumentException("Gender must be male or female");
                     }
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age)
           {
		if (age < 1 || age > 120)
                     {
  throw new IllegalArgumentException("Invalid Age. Age must be b/w 1 & 120");
                     }

		this.age = age;
	}
}
class Exception7 
{
	public static void main(String args[]) 
           {
		User u = new User("Ammu", "female", 24);

		System.out.println("User name is " + u.getName());
		System.out.println("Gender is " + u.getGender());
		System.out.println("Age is " + u.getAge());
	}
}


