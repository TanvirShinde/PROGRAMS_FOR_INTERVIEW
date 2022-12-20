package programs_on_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ITERATOR_CURSOR {

	public static void main(String[] args) {

		ArrayList<Integer> jk = new ArrayList<Integer>();

		for (int i=0 ; i<=10 ;i++) {

			jk.add(i);
		}

		System.out.println(jk);

		Iterator<Integer> e = jk.iterator();

		while (e.hasNext()) {

			Integer s = e.next();


			if(s%2==0) {

				System.out.println(s);
			}

			else {

				e.remove();
			}
		}


	}
}
