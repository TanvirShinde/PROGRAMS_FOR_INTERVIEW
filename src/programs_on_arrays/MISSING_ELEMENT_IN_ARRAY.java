package programs_on_arrays;

public class MISSING_ELEMENT_IN_ARRAY {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,7,8,9,10};
		
		int val=1;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=val)
			{
				break;
			}
			val++;
		}
		System.out.println("Missing Element in Array is : "+val);
	}

}
