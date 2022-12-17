package programs_on_arrays;

public class BIG_ELEMENT_IN_ARRAY {

	public static void main(String[] args) {
		int a[] = {12,47,56,18,7,19,27};
		
		int big = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(big<a[i])
			{
				big=a[i];
			}
		}
		
		System.out.println("Biggest Element in Array is : " +big);
	}

}
