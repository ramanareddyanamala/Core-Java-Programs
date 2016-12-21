import java.util.*;
class Demo5 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a value : ");
		a = s.nextInt();
		System.out.print("Enter b value : ");
		b = s.nextInt();

		try
		{			
			if(b==0)
			{
				return;
			}
			else
			{
				c = a/b;
				System.out.println("c = " + c);		
			}			
		}
		catch(ArithmeticException e)
		{
			System.out.println("\nArithmeticException Occured \n" + e);
		}

		finally
		{
			System.out.println("\nFinally Block Executed...");
		}

		System.out.println("This Statement is from Main Block...\n");
	}
}
