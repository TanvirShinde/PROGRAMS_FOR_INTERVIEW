package programs_on_arrays;

public class POSITIVE_AND_NEGATIVE_ELEMENT_COUNT_ARRAY {

	public static void main(String[] args) {
		int a[]= {-10,-20,15,48,-15,47,78,-45};
		
		int possitiveCount=0;
		
		int negativeCount=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>0)
			{
				possitiveCount++;
			}
			else
			{
				negativeCount++;
			}
		}
		System.out.println("Possitive count of Element is : " +possitiveCount);
		System.out.println("Negative count of Element is  : " +negativeCount);
	}
}
