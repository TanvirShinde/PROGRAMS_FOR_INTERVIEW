package programs_on_strings;

public class PRINT_CHARACTERS_ONLY_ONCE_OF_STRING {

	public static void main(String[] args) { 

		String s="javajavajavadevdev"; 

		String un=""; 

		for(int i=0;i<s.length();i++) { 

			char ch=s.charAt(i); 

			if(un.indexOf(ch)==-1) { 
				un=un+ch; 
			}

		} 
		
		System.out.println("Unique string is :"+un); 
	}
}
