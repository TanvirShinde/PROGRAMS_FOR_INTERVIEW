package programs_on_collection;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {

		// for each loop or for enhanced loop
		LinkedHashMap<Integer, String> lhs = new LinkedHashMap<Integer, String>();
		lhs.put(12, "pune");
		lhs.put(15, "mumbai");
		lhs.put(19, "bangalore");
		lhs.put(17, "delhi");

		Set<Integer> s = lhs.keySet(); // s contain all the key- 12 15 19 17
		for (int a : s) {  //a contain all the keys
			
			System.out.println("key>>" + a);
			System.out.println("value>>" + lhs.get(a));
		}

	}
}
