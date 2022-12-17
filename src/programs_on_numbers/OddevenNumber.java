package programs_on_numbers;

public class OddevenNumber {

	public static void main(String[] args) {

		for (int a=1; a<=20; a++)  {

			if (a%2==0) {

				System.out.println("This is even number "+ a);
			}

			else {

				System.out.println("This is odd number :"+ a);
			}
		}
	}
}
