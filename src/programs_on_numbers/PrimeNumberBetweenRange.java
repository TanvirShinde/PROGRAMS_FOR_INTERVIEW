package programs_on_numbers;

public class PrimeNumberBetweenRange {

	public static void main(String[] args) {

		int number =100;

		int c=0;

		System.out.print("Prime numbers are :");

		for (int i=50 ; i<=number ;i++) {

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
