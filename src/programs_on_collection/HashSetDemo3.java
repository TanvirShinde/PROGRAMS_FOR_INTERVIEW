package programs_on_collection;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(15);
		hs.add(10);
		hs.add(25);
		hs.add(20);

		// for each loop or for enhanced loop
		for (Integer a : hs) {
			System.out.println(a);
		}
	}
}
