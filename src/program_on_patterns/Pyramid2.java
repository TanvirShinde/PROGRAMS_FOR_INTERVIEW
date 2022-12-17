package program_on_patterns;

public class Pyramid2 {

	public static void main(String[] args) {

		for (int a=1;a<=5;a++)
		{
			for (int b=4; b>=a;b--) 
			{

				System.out.print(" "); 
			}

			for (int c=1; a>=c;c++) 
			{
				System.out.print("*");
			}

			for (int d=2; a>=d; d++)
			{
				System.out.print("*");	 
			}

			System.out.println();
		}
	}
}
