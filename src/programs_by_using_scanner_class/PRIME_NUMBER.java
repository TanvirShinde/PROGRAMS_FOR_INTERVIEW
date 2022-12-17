package programs_by_using_scanner_class;

import java.util.Scanner;

public class PRIME_NUMBER {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your number ");

		int number= input.nextInt();

		int c=0;

		for (int i=2 ; i<=number ;i++) {

			if(number%i==0) {

				c++;
			}
		}

		if(c==1) {

			System.out.println(number + " : is a prime number");
		}

		else {

			System.out.println(number + " : is not a prime number");
		}
	}
}
