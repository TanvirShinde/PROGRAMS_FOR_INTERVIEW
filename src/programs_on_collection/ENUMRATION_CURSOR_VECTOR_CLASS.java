package programs_on_collection;

import java.util.Enumeration;
import java.util.Vector;

public class ENUMRATION_CURSOR_VECTOR_CLASS {

	public static void main(String[] args) {

		Vector<Integer> jk = new Vector<Integer>();

		jk.add(10);

		jk.addElement(20);

		jk.addElement(12);

		jk.add(23);

		System.out.println(jk);

		Enumeration<Integer> e = jk.elements();

		while (e.hasMoreElements()) 
		{

			Integer i =e.nextElement();

			System.out.println(i);
		}
	}
}
