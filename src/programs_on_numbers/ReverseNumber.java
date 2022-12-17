package programs_on_numbers;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 12345;

		int rev =0;

		int rem;

		int i=1;

		while (i<=number) {

			rem = number%10;

			rev = rev*10 + rem;

			number = number/10;
		}

		System.out.println("Reverse number is : " + rev);

	}
}
