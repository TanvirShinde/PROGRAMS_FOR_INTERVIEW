package programs_on_collection;

import java.util.ArrayList;
import java.util.Collections;

public class ARRAYLIST_DECENDING_ORDER {

	public static void main(String args[]) {

		ArrayList<String> arrList = new ArrayList();
		arrList.add("Apple");
		arrList.add("Banana");
		arrList.add("Pear");
		arrList.add("Mango");
		
		/*Unsorted List: ArrayList content before sorting*/
		System.out.println("ArrayList Before Sorting:");
		
		for(String s: arrList){
			System.out.println(s);
		}
		
		/* Sorting in decreasing (descending) order*/
		Collections.sort(arrList, Collections.reverseOrder());
		
		/* Sorted List in reverse order*/
		System.out.println("ArrayList in descending order:");
		
		for(String str: arrList){
			System.out.println(str);
		}
	}

}
