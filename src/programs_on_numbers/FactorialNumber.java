package programs_on_numbers;

public class FactorialNumber {

	public static void main(String[] args) {

		int number=5;

		int fact=1;

		for (int i=1;i<=number;i++)   {

			fact =fact*i;
		}

		System.out.println("Factorial of the "+ number + " is :" + fact);
	}
}
