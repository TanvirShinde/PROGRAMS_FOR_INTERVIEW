package programs_on_collection;

import java.util.TreeSet;

public class TreeSetDemo4 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("pune");
		ts.add("mumbai");
		ts.add("bangalore");
		ts.add("delhi");
		System.out.println(ts);

		// for each loop
		for (String s : ts) {
			System.out.println(s);
		}
	}
}
