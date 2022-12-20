package programs_on_collection;

import java.util.HashMap;

public class HASHMAP_TEST {

	public static void main(String args[]) {

		// Creating HashMap object with Integer keys and String values 
		HashMap<Integer, String> map = new HashMap<>();

		// Checking whether HashMap is empty or not
		System.out.println("Checking Is HashMap empty?: " + 
				map.isEmpty());

		// Adding elements to the HashMap object
		map.put(100, "Jack");
		map.put(200, "John");
		map.put(300, "Smith");

		// Checking again whether HashMap is empty or not
		System.out.println("Checking Is HashMap empty?: "+ 
				map.isEmpty());
	}

}
