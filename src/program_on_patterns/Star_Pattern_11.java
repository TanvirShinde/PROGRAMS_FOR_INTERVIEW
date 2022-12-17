package program_on_patterns;

public class Star_Pattern_11 {

	public static void main(String args[])
	{
		int star=1,space=0;
		for(int i=1;i<=7;i++)
		{
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			if(i<=3 )
			{
				star=star+1;
			}
			else {
				star=star-1;
			}
			System.out.println(" ");
		}
	}
}
