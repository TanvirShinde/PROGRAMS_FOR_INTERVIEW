package programs_on_collection;

import java.util.HashMap;

public class ITERATE_HASHMAP {

	public static void main(String args[]) {

		// Creating a HashMap of String keys and String values
		HashMap<String, String> hashmap = new HashMap<String, String>();

		hashmap.put("Key1", "Value1");
		hashmap.put("Key2", "Value2");

		System.out.println("Iterating or looping map using foreach loop");

		// Iterating or looping using keySet() method
		for (String key : hashmap.keySet()) {
			System.out.println("key: " + key + " value: " + 
					hashmap.get(key));
		}
	}

}
