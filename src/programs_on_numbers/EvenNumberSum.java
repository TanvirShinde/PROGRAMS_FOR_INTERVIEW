package programs_on_numbers;

public class EvenNumberSum {

	public static void main(String args [ ])
	{
		int i,sum=0;
		for(i=1;i<=15;i++)
		{ 
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		
		System.out.println("Final sum value is: "+sum);

	}
}
