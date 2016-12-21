import java.util.*;

class NoMoneyException extends Exception
{
	public NoMoneyException(String msg)
	{
		super(msg);
	}
}

class Demo7
{
	public static void main(String[] args) 
	{
		int bal = 500,withdraw;		
		Scanner s = new Scanner(System.in);

		System.out.print("Enter Amount to be withdraw : ");
		withdraw = s.nextInt();

		try
		{
			if(withdraw>bal)
			{
				throw new NoMoneyException("Sorry, You donot have Enough Balance...");
			}
			else
			{
				System.out.println("\nAmount WithDraw Completed..");
				System.out.println("Your New Balnace is : " + (bal-withdraw) + "\n");
			}
		}
		catch(NoMoneyException e)
		{
			System.out.println("\nError Occured : " + e + "\n");
		}		
	}
}