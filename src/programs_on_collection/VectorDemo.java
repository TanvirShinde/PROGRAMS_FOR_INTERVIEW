package programs_on_collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector vector=new Vector();
		
		//add elements
		vector.add(10);
		vector.add(20);
		vector.add(30);
		
		//1st way
		System.out.println(vector);
		System.out.println(vector.capacity());
	}
}
