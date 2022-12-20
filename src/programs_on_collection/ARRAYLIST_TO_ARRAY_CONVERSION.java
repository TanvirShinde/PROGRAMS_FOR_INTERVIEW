package programs_on_collection;

import java.util.ArrayList;

public class ARRAYLIST_TO_ARRAY_CONVERSION {

	public static void main(String args[]) {

		// Creating and initializing ArrayList
		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Pear");

		// ArrayList to String array conversion

		String str [] = new String [fruits.size()];

		for (int i=0 ; i<fruits.size(); i++) {

			str[i]=fruits.get(i);

			System.out.println(str[i]);
		}

		System.out.println("*******_by using advanced for loop_********");
		//print element by using advance for loop:

		for ( String ss : str) {

			System.out.println(ss);
		}
	}
}
