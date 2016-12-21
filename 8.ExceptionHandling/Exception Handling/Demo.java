import java.util.*;
class Demo
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a,b,c;
		int[] x = new int[5];
		try
		{
			System.out.print("Enter a value for a : ");
			a = s.nextInt();
			System.out.print("Enter a value for b : ");
			b = s.nextInt();

			if(b!=0)
			{
				c = a/b;
				System.out.println("Quotient = " + c + "\n");
			}
			else
			{
				System.out.println("\nProgram Terminated... \n");
				return;
			}
		}
		catch(Exception e)
		{
			System.out.println("\n" + e);
		}

		finally
		{
			System.out.println("\nFinally Block Executed...\n");
		}

		System.out.println("Welcome to Java");
	}
}