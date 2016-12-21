import java.util.*;
class Demo9
{
	public void ArithDemo(int x, int y) throws ArithmeticException
	{	
		if(y!=0)
		{
			System.out.println("Sum = " + (x+y));
			System.out.println("Sub = " + (x-y));
			System.out.println("Mul = " + (x*y));
			System.out.println("Quo = " + (x/y));
			System.out.println("Rem = " + (x%y));
			System.out.println();
		}
		else
		{
			throw new ArithmeticException("Cannot Divide By Zero...");
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Demo6 obj = new Demo6();

		System.out.print("Enter a value : ");
		int a = s.nextInt();
		System.out.print("Enter b value : ");
		int b = s.nextInt();
		System.out.println();

		try
		{
			obj.ArithDemo(a,b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("\nArithmeticException Occured \n" + e + "\n");
		}
	}
}
