package vector;
    import java.util.Hashtable;
	import java.util.Iterator;
	import java.util.Set;
		
	class Book
	 {
		private int id;
		private String title;
		private String author;
		private double price;

		public Book(int id, String title, String author, double price) {
			this.id = id;
			this.title = title;
			this.author = author;
			this.price = price;
		}

		public int getId() {
			return id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
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
			Book other = (Book) obj;
			if (id != other.id)
				return false;
			return true;
		}

	}

	public class HashTable1 
	{
		public static void main(String a[]) 
	          {
			Hashtable<Integer, Book> books = new Hashtable<Integer, Book>();

			books.put(1, new Book(1, "Java", "Kanna", 500));
			books.put(2, new Book(2, ".Net", "Sateesh", 600));
			books.put(3, new Book(3, "Java Script", "Sahitya", 400));
			books.put(4, new Book(4, "Python", "Sujith", 500));
			books.put(5, new Book(5, "PHP", "Vinod", 650));
			books.put(1, new Book(1, "Perl", "Rakesh", 550)); 

			Book b = books.get(1);
			displayBook(b);

			System.out.println("Is Books empty? " + books.isEmpty());

			b = books.remove(5);

			System.out.println("Removed book is ");
			displayBook(b);

			System.out.println("Number of books are " + books.size());

			System.out.println("All books list is ");

			Set<Integer> booksIdSet = books.keySet();

			Iterator<Integer> booksIdItr = booksIdSet.iterator();

			while (booksIdItr.hasNext()) {
				Integer key = booksIdItr.next();
				b = books.get(key);
				displayBook(b);
			}
		}

		private static void displayBook(Book b) 
	          {
			System.out.println("Book id is " + b.getId());
			System.out.println("Title is " + b.getTitle());
			System.out.println("Author is " + b.getAuthor());
			System.out.println("Price is " + b.getPrice());
			System.out.println();
		}
	}



