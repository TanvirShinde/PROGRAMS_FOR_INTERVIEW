package programs_by_using_scanner_class;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// find leap year

		/*condition= 
				1)century proper  divide by 400  OR
                2) proper divide by 4
                3) but not divisible by 100*/

		Scanner P=new Scanner(System.in);

		System.out.print("Enter Year=");

		int year= P.nextInt();
		//int year =2001;
		if(year% 4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println(" leap year");
				}
				else {
					System.out.println(" not leap year");
				}
			}
			else {
				System.out.println(" leap year");
			}
		}
		else {
			System.out.println(" not leap year");
		}
	}
}
