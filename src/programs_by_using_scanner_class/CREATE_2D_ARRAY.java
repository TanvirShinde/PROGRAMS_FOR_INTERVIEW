package programs_by_using_scanner_class;

import java.util.Scanner;

public class CREATE_2D_ARRAY {

	public static void main(String[] args) { 

		Scanner sc=new Scanner(System.in); 

		System.out.println("Enter Row Size :");

		int rowsize=sc.nextInt(); 

		System.out.println("Enter Column Size :"); 

		int colsize=sc.nextInt(); 

		int a[][]=new int[rowsize][colsize]; 

		//for taking values from user
		System.out.println("Enter the elements :"); 

		for(int i=0;i<rowsize;i++) { 
			for(int j=0;j<colsize;j++) { 
				a[i][j]=sc.nextInt(); 
			}} 

		//for printing values
		for(int i=0;i<rowsize;i++) { 
			for(int j=0;j<colsize;j++) { 
				System.out.println("Value at a["+i+"]["+j+"]th : "+a[i][j]);
			}} 
	}
}
