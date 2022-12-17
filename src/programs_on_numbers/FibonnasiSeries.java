package programs_on_numbers;

public class FibonnasiSeries {

	public static void main(String[] args) {

		int m=12;
		int a=0;
		int b=1;
		int c;

		int i=0;

		System.out.print("FibonnasiSeries is as  :");

		while (i<=m) {

			c=a+b;

			a=b;
			b=c;
			i++;

			System.out.print(" " +c);		
		}	
	}	
}
