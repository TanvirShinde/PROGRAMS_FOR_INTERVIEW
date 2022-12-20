package programs_on_collection;

public class COMPARABLE_INTERFACE {

	public static void main(String[] args) {

		//it compares values of object based on ASCII code 
		//A-65 Z-90 a-97 z-122
		
		System.out.println("C".compareTo("B")); //Output -25
		System.out.println("B".compareTo("B")); //output 0
		System.out.println("T".compareTo("S")); // output 1
		System.out.println("T".compareTo("U")); //output -1

	}
}
