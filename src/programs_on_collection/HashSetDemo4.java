package programs_on_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo4 {

	public static void main(String[] args) {

		// Design HashSet<String>
		HashSet<String> hs = new HashSet<String>();
		hs.add("amit");
		hs.add("sachin");
		hs.add("vaibhav");

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {  //itr contain amit sachin vaibhav
			System.out.println(itr.next());
		}//
	}
}