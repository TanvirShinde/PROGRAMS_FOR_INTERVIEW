package programs_by_using_scanner_class;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner jk = new Scanner (System.in);

		System.out.println("Enter your number?");

		int number = jk.nextInt();

		int i;
		int fact=1;

		for ( i=1; i<=number ;i++) {

			fact = fact*i;
		}
		System.out.println("Your value is:"+fact);
		jk.close();
	}
}
