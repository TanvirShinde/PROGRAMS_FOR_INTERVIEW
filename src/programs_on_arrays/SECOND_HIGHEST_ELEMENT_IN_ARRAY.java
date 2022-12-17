package programs_on_arrays;

public class SECOND_HIGHEST_ELEMENT_IN_ARRAY {

	public static void main(String[] args) { 

		int a[]= {22,5,6,88,9}; 

		int max=a[0];

		int secmax=a[0]; 

		for(int i=1;i<a.length;i++) 
		{ 
			if(a[i]>max) 
			{ 
				secmax=max; 
				max=a[i]; 
			} 
			else if(a[i]>secmax) 
			{ 
				secmax=a[i]; 
			} 
		} 

		System.out.println("maximum value : "+max); 

		System.out.println("second maximum value : "+secmax); 
	}
}
