package programs_on_strings;

public class REVERSE_EACH_WORD_OF_GIVEN_STRING {

	public static void main(String[] args) {
		
		String a = "Hello I am Sourabh";
		
		String word[] = a.split(" ");
		
		for(String element: word)
		{
			System.out.print(" ");
			
			for(int i=element.length()-1; i>=0; i--)
			{
				char b = element.charAt(i);
				
				System.out.print(b);
			}
		}
	}

}
