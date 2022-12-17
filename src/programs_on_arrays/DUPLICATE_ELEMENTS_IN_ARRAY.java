package programs_on_arrays;

public class DUPLICATE_ELEMENTS_IN_ARRAY {

	public static void main(String[] args) {
		int a[]= {1, 25, 3, 1,1,2,3,3};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicates of Array is : " +a[j]);
				}
			}
		}
	}
}
