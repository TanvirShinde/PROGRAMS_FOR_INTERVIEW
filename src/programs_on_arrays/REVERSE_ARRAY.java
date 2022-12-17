package programs_on_arrays;

public class REVERSE_ARRAY {

	public static void main(String[] args) {
		
		int a[] = {1,20,25,14,23,78,45,12};
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+ " ");
		}
	}

}
