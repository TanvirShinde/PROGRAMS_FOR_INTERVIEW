package programs_by_using_scanner_class;

import java.util.Scanner;

public class AromstrongNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your number ");

		int number= input.nextInt();


		int rev =0 ;

		int rem ;

		int arms = number ;

		while (number > 0) {

			rem = number % 10 ;

			rev = rev + rem *rem * rem * rem;

			number = number / 10 ;

		}

		System.out.println(rev);

		if (rev ==arms) {

			System.out.println(rev + " is a armstrong number");
		}
		else {

			System.out.println(rev+ " is not a armstrong number");
		}
	}
}
