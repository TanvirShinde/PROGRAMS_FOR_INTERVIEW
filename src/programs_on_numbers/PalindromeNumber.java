package programs_on_numbers;

public class PalindromeNumber {

	public static void main(String[] args) {

		int number=121;

		int rem;

		int rev=0;

		int i=0;

		int pal = number;

		while (i<number) {

			rem=number%10;

			rev=rev*10+rem;

			number=number/10;	
		}

		System.out.println(rev);


		if (rev == pal) {

			System.out.println(rev + " : is a palindrome number");
		}

		else {

			System.out.println(rev + " : is not a palindrome number");
		}
	}	
}
