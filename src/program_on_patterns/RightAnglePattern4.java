package program_on_patterns;

public class RightAnglePattern4 {

public static void main(String[] args) {
		
		for (int a=1;a<=5;a++) {
			
			for(int b=5; b>=a; b--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
