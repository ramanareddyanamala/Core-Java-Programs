//Demonstration on try and catch
import java.util.*;
class Demo2
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
			c = a/b;
			System.out.println("Quotient = " + c + "\n");
		}			
		catch(InputMismatchException ex)
		{
			System.out.println("Error Occured: Enter a Numeric Value without Decimal Points within the Range of -2147483647 to +2147483647");
			System.out.println(ex);
			//ex.printStackTrace();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Error Occured: Denominator Should not be Zero(0)");
			System.out.println(ex);
		}
		catch(Exception ex)
		{
			System.out.println("Error Occured:");
			System.out.println(ex);
		}

		System.out.println("Welcome \n");
	}
}
