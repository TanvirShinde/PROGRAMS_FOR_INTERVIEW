package programs_on_collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo3 {

	public static void main(String[] args) {
		
		// add list of e commerce products
		LinkedHashSet<String> linkedhSet = new LinkedHashSet<String>();
		linkedhSet.add("laptop");
		linkedhSet.add("mobile");
		linkedhSet.add("headphone");

		// using iterator-
		Iterator<String> itr = linkedhSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
