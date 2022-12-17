package programs_on_strings;

public class FREQUENCY_OF_ALPHABET {

	public static void main(String[] args) {
		
		int counter =0;
		
		String str = "I Love My Counnntry";
		
		char c ='n';
		
		for(int i=0; i<str.length(); i++)
		{
			if(c==str.charAt(i))
			{
				counter++;
			}
		}
		System.out.println("Frequency of " +c+ " = " +counter);
	}
}
