package programs_on_numbers;

public class PrimeNumber {

	public static void main(String[] args) {

		int number=11;

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
