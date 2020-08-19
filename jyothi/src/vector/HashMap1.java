package vector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Product 
{
	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price) 
         {
		this.id = id;
		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

public class HashMap1 
{
	public static void main(String a[]) 
          {
	
           HashMap<Integer, Product> products = new HashMap<Integer, Product>();

		products.put(1, new Product(1, "Samsung Mobile", 7000));
		products.put(2, new Product(2, "LG TV", 15000));
		products.put(3, new Product(3, "Lenovo Laptop", 33000));
		products.put(4, new Product(4, "HP Printor", 13000));
		products.put(5, new Product(5, "Havells Fan", 3000));
		products.put(1, new Product(1, "Sparx Shoes", 2000)); 

		Product p = products.get(1);
		displayProduct(p);

		System.out.println("Is Products empty? " + products.isEmpty());

		p = products.remove(5);

		System.out.println("Removed Product is ");
		displayProduct(p);

		System.out.println("Number of products are: " + products.size());

		System.out.println("All products list is ");

		Set<Integer> productsIdSet = products.keySet();

		Iterator<Integer> productsIdItr = productsIdSet.iterator();

		while (productsIdItr.hasNext()) 
                   {
			Integer key = productsIdItr.next();
			p = products.get(key);
			displayProduct(p);
		}
	}

	private static void displayProduct(Product p) 
         {
		System.out.println("Product id is " + p.getId());
		System.out.println("Product name is " + p.getName());
		System.out.println("Price is " + p.getPrice());
		System.out.println();
	}
}



