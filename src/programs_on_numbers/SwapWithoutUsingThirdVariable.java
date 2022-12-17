package programs_on_numbers;

public class SwapWithoutUsingThirdVariable {

	public static void main(String[] args) {

		int a=10;

		int b=20;

		a=a+b; //a=10+20---->a=30

		b=a-b; //b=30-20----->b=10

		a=a-b; //a=30-10------>a=20

		System.out.println("After swapping : " +a+ " " +b);

		System.out.println("Value of a is :" + a);

		System.out.println("Value of a is :" + b);
	}
}
