package program_on_patterns;

public class Star_Pattern_2 {

	public static void main(String args[ ])
	{
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=4;j++) 
			{
				if(j==2||j==4)//(j%2==0)
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
