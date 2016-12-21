import java.util.Scanner;
class Demo1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a,b,c;		

		try
		{
			System.out.print("Enter a value for a : ");
			a = s.nextInt();
			System.out.print("Enter a value for b : ");
			b = s.nextInt();

			c = a/b;
			System.out.println("Result = " + c);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Hello User You Have and Error : " + e + "\n");
		}
		System.out.println("Welcome to Java \n");	
	}
}