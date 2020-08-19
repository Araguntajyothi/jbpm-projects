package vector;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Stack1 
{
	public static void main(String args[]) 
           {
		Stack<Integer> st = new Stack<Integer>();
		int choice, position, element;
		Scanner s = new Scanner(System.in);
	

		do {
			System.out.println("Stack Operation :");
			System.out.println("1.Push   element");
			System.out.println("2.Pop    element");
			System.out.println("3.Search element");
			System.out.println("4.Peek   element");
			System.out.println("5.Display elements");
			System.out.println("6.Exit");
			System.out.print("Enter Your Choice:   ");
			choice = s.nextInt();
						switch (choice) {
			case 1:
				
				System.out.println("Enter element to Push in to Stack");
				element = s.nextInt();
				st.push(element);
				System.out.println("after pushing stack elements are"+st.push(element));
				break;
			case 2:
				
				if (!st.empty()) {
					
					Integer i = st.pop();
				
					
					System.out.println("Poped elements is " + i);
				} else {
			System.out.println("Stack is epmty operation not possible");
				}

				break;
			case 3:
				System.out.println("Enter element to search");
				element = s.nextInt();

				position = st.search(element);
				if (position == -1)
					System.out.println("Element not found");
				else
			System.out.println("Element found at position " + position);
				break;
			case 4:
								if (!st.empty()) {
					element = st.peek();
					System.out.println("Peak Element is " + element);
				} else {
			System.out.println("Stack is epmty operation not possible");
				}
				break;
			case 5:
				
				if (!st.empty()) {
					Iterator<Integer> it = st.iterator();
					System.out.println("Stack elements are :");
					while (it.hasNext()) {
						System.out.println(it.next());
					}
				} else {
					System.out.println("Stack Is Epmty");
				}
				break;
			default:
				System.out.println("Invalid Choice Selected");
				System.out.println("Try again");
				break;
			case 6:
				return;

			}

		} while (choice != 6);
		s.close();
	}
}



