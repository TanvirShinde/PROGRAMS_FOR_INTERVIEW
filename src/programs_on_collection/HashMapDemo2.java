package programs_on_collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {

		// HashMap<Integer,String>
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(12, "rohit");
		hm.put(16, "ajit");
		hm.put(21, "atul");

		Set<Integer> s = hm.keySet(); // we cant directly iterate
		// s contain all the keys only- 12,16,21
		
		for (Integer i : s) {
			System.out.println("Keys are>>" + i); // 12
			System.out.println("values are>>" + hm.get(i)); // hm.get(12)---->rohit
		}
	}
}
