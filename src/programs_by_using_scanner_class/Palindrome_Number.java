package programs_by_using_scanner_class;

import java.util.Scanner;

public class Palindrome_Number {

	public void method2() {

		Scanner as =new Scanner (System.in) ;
		System.out.println("Enter your palindrome number?");
		int number = as.nextInt();
		int remain=0;

		while (number > 0) {
			remain = remain*10+ number%10;
			number = number/10;			

		}
		System.out.println("your palindrome number is"+remain);

		as.close();
	}
	public static void main(String[] args) {
		Palindrome_Number jk = new Palindrome_Number ();
		jk.method2();
	}
}
