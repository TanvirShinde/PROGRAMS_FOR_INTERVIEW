package programs_by_using_scanner_class;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your number ");

		int number1= input.nextInt();

		int number2= input.nextInt();


		int c;

		c=number1;

		number1=number2;

		number2=c;

		System.out.println("The value of number1 is:"+ number1);

		System.out.println("The value of number2 is "+number2);

	}
}
