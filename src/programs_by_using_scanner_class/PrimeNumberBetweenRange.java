package programs_by_using_scanner_class;

import java.util.Scanner;

public class PrimeNumberBetweenRange {

	public static void main(String[] args) {

		Scanner jk = new Scanner (System.in);

		System.out.println("Enter your number?");

		int number = jk.nextInt();
		
		System.out.print("Prime numbers are :");

		int c=0;

		for (int i=jk.nextInt();  i<=number ;i++) {
			
			for (int j=2 ; j<=i ; j++) {

				if(i%j==0) {

					c++;
				}
			}

			if (c==1) {
				
				System.out.print(" "+ i);
			}

			else {

				c=0;
			}

		}
	}
}
