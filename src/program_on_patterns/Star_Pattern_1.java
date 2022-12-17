package program_on_patterns;

public class Star_Pattern_1 {

	public static void main(String args[ ])
	{
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=4;j++) 
			{
				if(i%2==0) //(i==2||i==4)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println(" "); 
		}

	}
}
