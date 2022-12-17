package programs_on_strings;

public class FREQUENCY_OF_CHARACTERS {

	public static void main(String[] args) { 
		
		String str="javadev"; 
		
		String s=str.toUpperCase();//s=JAVADEV
		
		char[] s1=s.toCharArray();//{'J','A','V','A','D','E','V'}
		
		for(char ch='A';ch<='Z';ch++) 
		{ 
			int count=0; 
			
			for(int i=0;i<s1.length;i++) 
			{ 
				if(ch==s1[i]) 
				{ 
					count++; 
				}} 
			
			if(count>0) 
				
				System.out.println(ch+"-"+count); 
		} 
	}
}
