import java.util.*;
class ErrorInAgeException extends Exception
{
	public ErrorInAgeException(String s)
	{
		super(s);
	}
}

class Demo8
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int age;

		System.out.print("Enter Your Age : ");
		age = s.nextInt();

		try
		{
			if(age<1)
			{
				throw new ErrorInAgeException("Age Cannot be Lessthan 1");
			}
			else
			{
				System.out.println("\nYour age is : " + age + "\n");
			}
		}
		catch(ErrorInAgeException e)
		{
			System.out.println("\nErro in Age : " + e + "\n");
		}
	}
}