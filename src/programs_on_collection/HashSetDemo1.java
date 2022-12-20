package programs_on_collection;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		// how to add element into hs
		hs.add(10);
		hs.add(30);
		hs.add(25);
		hs.add(50);
		hs.add(25); // adding duplicates here
		hs.add("pune"); //heterogenous object
		hs.add(null); //adding null here
		
		//1st way to print the elements
		System.out.println(hs);
	}
}
