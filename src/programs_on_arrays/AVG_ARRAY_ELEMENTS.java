package programs_on_arrays;

public class AVG_ARRAY_ELEMENTS {

	public static void main(String[] args) {
		
		int a[]= {10,26,29,34,76,49,53};
		
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum= sum+a[i];
		}
		System.out.println("The average of Array Elements is  : " +sum/a.length);
	}

}
