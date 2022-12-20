package programs_on_collection;

import java.util.ArrayList;
import java.util.Collections;

public class REVERSE_ARRAYLIST {

	public static void main(String[] args) 
	{
		//Creating an ArrayList object 
		ArrayList<String> arrlist = new ArrayList<String>(); 
		//Adding elements to ArrayList object 
		arrlist.add("Apple"); 
		arrlist.add("Amazon"); 
		arrlist.add("Facebook");
		arrlist.add("Google");
		arrlist.add("IBM"); 
		arrlist.add("Tesla");

		//Displaying ArrayList Before Reverse 
		System.out.println("Before Reverse ArrayList:"); 
		System.out.println(arrlist);

		/*Reversing the list using 
	 Collections.reverse() method*/ 
		Collections.reverse(arrlist);

		//Displaying list after reverse 
		System.out.println("After Reverse ArrayList:"); 
		System.out.println(arrlist);
	}
}
