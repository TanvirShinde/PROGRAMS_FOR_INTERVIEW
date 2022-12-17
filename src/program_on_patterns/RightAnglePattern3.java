package program_on_patterns;

public class RightAnglePattern3 {
	public static void main(String[] args) {

		for (int a=1; a<=7;a++) {

			for (int b=1; a>=b; b++) 
			{
				System.out.print(" ");
			}
			for (int c=7; c>=a; c--)
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
