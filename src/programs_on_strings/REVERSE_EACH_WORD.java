package programs_on_strings;

public class REVERSE_EACH_WORD {

	public static void main(String[] args) {

		String a ="Rohit is a Automation tester";

		String [] b= a.split(" ");

		for(int i=b.length-1; i>=0; i--)
		{
			System.out.print(" ");

			System.out.print(b[i]);
		}
	}

}
