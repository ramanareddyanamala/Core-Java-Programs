import java.lang.*;
import java.util.Scanner;
class Demo3
{
   public static void main(String[] str)
   {
	int a,b;
	Scanner s = new Scanner(System.in);

	System.out.println("Enter Two Numbers");
	a = s.nextInt();
	b = s.nextInt();
	System.out.println("\na = " + a + "\nb = " + b + "\n");


	System.out.println("Sum = " + (a+b));
	System.out.println("Sub = " + (a-b));
	System.out.println("Mul = " + (a*b));
	System.out.println("Quo = " + (a/b));
	System.out.println("Rem = " + (a%b));
	System.out.println("\n");


	System.out.println("a = " + a + "\nb = " + b + "\n");	

	a+=b;	//a=a+b;
	System.out.println("a+=b;   a=a+b;");
	System.out.println("a = " + a + "\nb = " + b + "\n");

	a-=b;	//a=a-b;
	System.out.println("a-=b;   a=a-b;");
	System.out.println("a = " + a + "\nb = " + b + "\n");

	a*=b;	//a=a*b;
	System.out.println("a*=b;   a=a*b;");
	System.out.println("a = " + a + "\nb = " + b + "\n");

	a/=b;	//a=a/b;
	System.out.println("a/=b;   a=a/b;");
	System.out.println("a = " + a + "\nb = " + b + "\n");

	a%=b;	//a=a%b;
	System.out.println("a%=b;   a=a%b;");
	System.out.println("a = " + a + "\nb = " + b + "\n");



	System.out.println("\na = " + a + "\n");
	
	a++;
	System.out.println("a++;");
	System.out.println("a = " + a + "\n");

	a--;
	System.out.println("a--;");
	System.out.println("a = " + a + "\n");


	a = 25;
	b = 0;

	System.out.println("\na = " + a + "\nb = " + b + "\n");
	System.out.println("Performing Pre Increment and Decrement");
	System.out.println("**************************************");

	b = ++a;
	System.out.println("b = ++a;");
	System.out.println("a = " + a + "\nb = " + b + "\n");	

	b = --a;
	System.out.println("b = --a;");
	System.out.println("a = " + a + "\nb = " + b + "\n");	



	System.out.println("Performing Post Increment and Decrement");
	System.out.println("***************************************");

	b = a++;
	System.out.println("b = a++;");
	System.out.println("a = " + a + "\nb = " + b + "\n");	

	b = a--;
	System.out.println("b = a--;");
	System.out.println("a = " + a + "\nb = " + b + "\n");
   }
}









