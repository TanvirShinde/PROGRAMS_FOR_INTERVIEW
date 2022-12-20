package programs_on_collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class LIST_ITRATOR {

	public static void main(String[] args) {
		
		ArrayList<Integer> e = new ArrayList<Integer>();
		
		for (int i=0 ; i<=10 ; i++) {
			
			e.add(i);
		}
		
		System.out.println(e);
		
		ListIterator<Integer> js = e.listIterator();
		
		while (js.hasNext()) {
			
			Integer ss = js.next();
			
			if (ss.equals(2)) {
				
				js.add(27);
			}
		}
		
		System.out.println(e);
	}
}
