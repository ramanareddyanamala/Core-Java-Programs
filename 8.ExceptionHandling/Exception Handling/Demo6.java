import java.util.*;
class MyClass
{
	public void ArithDemo(int x, int y) throws ArithmeticException
	{
		System.out.println("Sum of " + x + " and " + y + " is " + (x+y));
		System.out.println("Sub of " + x + " and " + y + " is " + (x-y));
		System.out.println("Mul of " + x + " and " + y + " is " + (x*y));
		System.out.println("Quo of " + x + " and " + y + " is " + (x/y));
		System.out.println("Rem of " + x + " and " + y + " is " + (x%y));
		System.out.println();
	}
}

class Demo6 
{
	public static void main(String[] args) 
	{
		MyClass ad = new MyClass();
		Scanner s = new Scanner(System.in);

		System.out.print("Enter Number 1 : ");
		int a = s.nextInt();
		System.out.print("Enter Number 2 : ");
		int b = s.nextInt();
		System.out.println();

		try
		{
			ad.ArithDemo(a,b);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
			System.out.println("Cannto Divide By Zero \n");
		}
		System.out.println("Thank You for Using MyClass...");
	}
}
