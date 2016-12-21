import java.util.*;
class Demo4
{	
	public static void main(String[] args) 
	{
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number : ");

		try
		{
			a = s.nextInt();
			System.out.println("a = " + a);			
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Hello user you have an error : " + ex);
		}
	}
}
