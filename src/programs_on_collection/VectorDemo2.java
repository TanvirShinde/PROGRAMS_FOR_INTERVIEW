package programs_on_collection;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("mumbai");
		v.add("pune");
		v.add("bangalore");

		// for each loop
		for (String s : v) {
			System.out.println(s);
		}
	}
}