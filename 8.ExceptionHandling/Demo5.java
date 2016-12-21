import java.util.*;

class Calc
{
	public void ArithDemo(int a, int b) throws ArithmeticException
	{
		System.out.println("Sum = " + (a+b));
		System.out.println("Sub = " + (a-b));
		System.out.println("Mul = " + (a*b));
		System.out.println("Quo = " + (a/b));
		System.out.println("Rem = " + (a%b));
		System.out.println("\n");
	}
}

class Demo5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x,y;
		System.out.println("Enter Two Numbers");
		x = s.nextInt();
		y = s.nextInt();
		System.out.println();

		Calc obj = new Calc();

		try
		{
			obj.ArithDemo(x,y);
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
		}
		

		System.out.println("Welcome");
	}
}
