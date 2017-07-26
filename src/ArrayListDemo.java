import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// here we are creating an ArrayList object
		ArrayList<String> elementlist = new ArrayList<String>();
		// here we are Adding elements to ElementList
		elementlist.add("Nitish");
		elementlist.add("Vishal");
		elementlist.add("Abhishek");
		elementlist.add("Vikash");
		elementlist.add("Bhawani");

		// Here we get an Iterator object for ArrayList using iterator() method.
		Iterator<String> itr = elementlist.iterator();

		// Here we use hasNext() and next() methods of Iterator to iterate
		// through the
		// elements
		System.out.println("Iterating through the ElementList");
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}