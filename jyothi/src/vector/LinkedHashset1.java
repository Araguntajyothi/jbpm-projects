package vector;
import java.util.Iterator;
	import java.util.LinkedHashSet;

	class Customer {
		int id;
		String name;
		String mobileNumber;

		public Customer(int id, String name, String mobileNumber)
	          {
			this.id = id;
			this.name = name;
			this.mobileNumber = mobileNumber;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Customer other = (Customer) obj;
			if (id != other.id)
				return false;
			return true;
		}
	}
	class LinkedHashset1 
	{
		public static void main(String[] args) 
	          {
			

	LinkedHashSet<Customer> customersSet = new LinkedHashSet<Customer>();

			

			customersSet.add(new Customer(1123, "Kanna", "9573638397"));
			customersSet.add(new Customer(1126, "Praveen", "8686879958"));
			customersSet.add(new Customer(1230, "Sateesh", "9010990285"));
			customersSet.add(new Customer(1270, "Eshwar", "81432487774"));
			System.out.println("All customers details are");

			Iterator<Customer> itr = customersSet.iterator();
			
			while (itr.hasNext()) 
	                     {
				Customer c = itr.next();

				System.out.println("Id is " + c.getId());
				System.out.println("Name is " + c.getName());
				System.out.println("Mobile No is " + c.getMobileNumber());
				System.out.println();
			}
		}
	


}
