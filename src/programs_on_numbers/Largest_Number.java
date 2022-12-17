package programs_on_numbers;

public class Largest_Number {

	public static void main(String[] args) {
		int a=56;

		int b=567;

		int c =36;

		int d= 389;

		if(a>b&& a>c&&a>d)
		{
			System.out.println(a+ " is a largest number");
		}

		else if(b>a&& b>c&&b>d)
		{
			System.out.println(b+ " is a largest number");
		}

		if(c>a&& c>b&&c>d)
		{
			System.out.println(c+ " is a largest number");
		}

		else if(d>a&& a>b&&a>c)
		{
			System.out.println(d+ " is a largest number");
		}

	}

}
