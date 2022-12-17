package program_on_patterns;

public class DiagonalPattern2 {

	public static void main(String[] args) {

		for (int a=1; a<=5; a++) 
		{

			for (int b=1; a>=b; b++) {

				if (a>=2 && b<=(a-1)) {

					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
