package programs_on_collection;

import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String[] args) {
		TreeSet<String> jk = new TreeSet<String>(new ComparatorDiscussion());
		jk.add("Riddhi");
		jk.add("Siddhi");
		jk.add("Vedant");
		jk.add("Badri");
		jk.add("Digu");
		System.out.println(jk);
		
	}
}