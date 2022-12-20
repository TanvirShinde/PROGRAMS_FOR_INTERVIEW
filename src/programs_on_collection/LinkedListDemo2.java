package programs_on_collection;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {

		//Design LinkedList<String> generics
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("pune");
		linkedList.add("mumbai");
		linkedList.add("bangalore");
		
		// use for each loop
		for (String s : linkedList) {
			System.out.println(s);
		}
	}
}