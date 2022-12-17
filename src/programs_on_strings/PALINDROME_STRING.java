package programs_on_strings;

public class PALINDROME_STRING {

	public static void main(String[] args) {
		
		String rev="";
		
		String str="MADAM";
		
		String org= str;
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev= rev+ str.charAt(i);
		}
		System.out.println(rev);

		if(org.equals(rev))
		{
			System.out.println(rev+ " is a palindrome String");
		}
		else
		{
			System.out.println(rev+ " is not a palindrome String");
		}
	}
}
