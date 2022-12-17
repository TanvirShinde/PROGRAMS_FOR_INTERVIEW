package programs_on_numbers;

public class Print1_10WithoutUsingForLoop {

	public void myMethod(int a){

		if(a<=10){

			System.out.println(a);

			myMethod(a+1);

		}
	}
	public static void main(String[] args) {

		Print1_10WithoutUsingForLoop w = new Print1_10WithoutUsingForLoop();

		w.myMethod(1);
	}
}
