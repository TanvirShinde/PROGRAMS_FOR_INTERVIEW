package programs_on_strings;

public class FIND_LARGEST_WORD_OF_GIVEN_STRING {

	public static void main(String[] args) { 

		String s="I am a java developer"; 

		String s1[]=s.split(" "); 

		System.out.println("length of array : "+s1.length); 

		for(int i=0;i<s1.length;i++) 
		{ 
			System.out.print(s1[i]+"-"); 

			System.out.println(s1[i].length()); 
		} 
		int max=0; 
		for(int i=0;i<s1.length;i++) 
		{ 
			if(s1[i].length()>max) 
			{ 
				max=s1[i].length(); 
			} 
		} 

		System.out.print("The longest word from the string : "+max); 
	}
}
