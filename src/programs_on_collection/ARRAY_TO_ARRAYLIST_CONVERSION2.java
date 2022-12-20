package programs_on_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ARRAY_TO_ARRAYLIST_CONVERSION2 {

	public static void main(String args[]) {
		 // Creating and initializing Array
		 String[] strArray = {"AAA", "BBB", "CCC", "DDD"};
		 
		 // Declaring ArrayList
		 ArrayList<String> al = new ArrayList<>();
		 //Converting Array to ArrayList using addAll() method
		 Collections.addAll(al, strArray);
		 
		 // Add more elements to the converted list
		 al.add("YYY");
		 al.add("ZZZ");
		 
		 // Displaying arraylist elements using for-each loop
		 for(String s : al) {
		 System.out.println(s); 
		 }
		 }

}
