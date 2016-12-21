import java.util.Scanner;
class Demo2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a,b,c;

		System.out.print("Enter a value for a : ");
		a = s.nextInt();
		System.out.print("Enter a value for b : ");
		b = s.nextInt();

		try
		{
			c = a/b;
			System.out.println("Result = " + c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Hello User You Have and Error : " + e);
		}
		System.out.println("Welcome to Java");	
	}
}