package program_on_patterns;

public class Pyramid4 {

	public static void main(String args[])
	{
		int star=7,space=0;//(spaces before star)
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			star=star-2;
			space=space+1;
			System.out.println(" ");
		}
	}
}
