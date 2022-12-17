package programs_by_using_scanner_class;

import java.util.Scanner;

public class FibonnasiSeries {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your number ");

		int number= input.nextInt();

		int a=0;
		int b=1;
		int c;

		int i=0;

		System.out.print("FibonnasiSeries is as  :");

		while (i<=number) {

			c=a+b;

			a=b;
			b=c;
			i++;

			System.out.print(" " +c);		
		}	
	}	
}
