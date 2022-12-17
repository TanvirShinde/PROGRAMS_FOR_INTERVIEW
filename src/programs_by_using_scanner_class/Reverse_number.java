package programs_by_using_scanner_class;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {

		Scanner jk = new Scanner (System.in);

		System.out.println("Enter your number");

		int number =jk.nextInt();

		int rev =0;                       
		while (number >0) {

			rev = rev *10+ number %10;
			number = number/10;
		}
		System.out.println("Your reverse number is : " + rev);
		jk.close();
	}
}
