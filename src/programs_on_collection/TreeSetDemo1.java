package programs_on_collection;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		// how to add the elements
		
		ts.add(55);
		ts.add(25);
		ts.add(35);
		ts.add(20);
		ts.add(50);
		
		//ts.add(35); // duplicats are added
		//ts.add("pune"); //adding the heterogenous object
		System.out.println(ts);
	}
}
