package programs_on_arrays;

public class SMALL_ELEMENT_IN_ARRAY {

	public static void main(String[] args) {
		int a[] = {10,37,45,7,59,93};
		
		int small = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(small>a[i])
			{
				small= a[i];
			}
		}
		
		System.out.println("Smallest Element in Array is : " +small);
		
	}

}
