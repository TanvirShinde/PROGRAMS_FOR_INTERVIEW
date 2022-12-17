package programs_on_numbers;

public class Oddnumber {

	public static void main(String[] args) {

		int number = 20;

		System.out.print("Odd numbers are : ");

		for (int i=0 ; i<=number ; i++) {

			if (i%2==0)  {

				System.out.print(" " + i);
			}  
		}
	}	
}
