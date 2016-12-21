import java.lang.*;
import java.util.Scanner;
class Demo2
{
   public static void main(String[] args)
   {
	int a;	
	float b;
	double c;
	boolean d;
	String e;

	Scanner obj = new Scanner(System.in);

	System.out.print("Enter a Int Value     : ");
	a = obj.nextInt();

	System.out.print("Enter a Float Value   : ");
	b = obj.nextFloat();

	System.out.print("Enter a Double Value  : ");
	c = obj.nextDouble();

	System.out.print("Enter a Boolean Value : ");
	d = obj.nextBoolean();

	System.out.print("Enter a String Value  : ");
	e = obj.next();

	System.out.println("\n");

	System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
	System.out.println("d = " + d + "\ne = " + e);
   }
}