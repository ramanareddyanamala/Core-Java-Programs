//Demonstration on User Defined Exception

import java.util.*;

//User Defined Exception
class OddNumberException extends Exception
{
	public OddNumberException(String msg)
	{
		super(msg);
	}
}

class Demo4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a;

		try
		{
			System.out.print("Enter a Number : ");
			a = s.nextInt();

			if(a%2==0)
			{
				System.out.println("Entered number is an Even Number");
			}
			else
			{
				/*
				OddNumberException obj = new OddNumberException("Please Enter an Even Number");
				throw obj;
				*/

				throw new OddNumberException("Odd Number Cannot be accepted, Please Enter  an Even Number");
			}
		}
		catch(OddNumberException ex)
		{
			System.out.println("Error Occured: " + ex + "\n");
		}
		catch(Exception ex)
		{
			System.out.println("Error Occured: " + ex + "\n");
		}

		System.out.println("Welcome");
	}
}
