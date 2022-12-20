package programs_on_collection;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo3 {

	public static void main(String[] args) {

		TreeMap<String, String> tm = new TreeMap<String, String>();
		
		tm.put("ram", "patil");
		tm.put("ajay", "deshmukh");
		tm.put("sohan", "pawar");

		Set<String> s = tm.keySet();
		
		for (String str : s) {
			System.out.println("key>>" + str);
			System.out.println("value>>" + tm.get(str));
		}
	}
}