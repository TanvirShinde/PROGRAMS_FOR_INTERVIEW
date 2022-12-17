package programs_on_arrays;

public class FIND_ALL_MISSING_ELEMENTS_IN_ARRAY {

	public static void main(String[] args) {
		
		boolean status=true; 
		
		int a[]= {22,17,4,46,8,2,56}; 
		
		for(int j=1;j<=60;j++) 
		{ 
			for(int i=0;i<a.length;i++) { 
				
				if(j==a[i]) 
				{ 
					status=false; 
					break; 
				} 
			} 
			if(status==true)//number is not present 
			{ 
				System.out.print(" " +j); 
			} 
			status=true;//for every number status should be true 
		} 
	}
}
