package programs_on_strings;

public class STRING_REVERSE_COMPLETE {

	public static void main(String[] args) {
		
		String rev ="";
		
		String str = "I Love My Country";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
	}

}
