//Demonstrate on finally

import java.util.*;
class Demo3
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);		
		int a,b,c;

		try
		{
			System.out.println("Enter two numbers");
			a = s.nextInt();
			b = s.nextInt();

			if(b!=0)
			{
				c = a/b;
				System.out.println("Quotient = " + c + "\n");
			}
			else
			{
				System.out.println("Program Terminated!!!");
				return;
			}
		}		
		catch(Exception ex)
		{
			System.out.println("Error Occured: " + ex + "\n");
		}	
		finally
		{
			System.out.println("Finally Block Executed...");
		}

		System.out.println("Welcome \n");
	}
}