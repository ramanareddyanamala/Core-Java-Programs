import java.lang.*;
import java.util.Scanner;

class Demo8
{
   public static void main(String[] args)
   {
		int i;
		int[] a = new int[5];
	
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
		System.out.println("a[2] = " + a[2]);
		System.out.println("a[3] = " + a[3]);
		System.out.println("a[4] = " + a[4]);
		System.out.println();

		int[] b = new int[]{11,21,31,41,51};
		for(i=0; i<b.length; i++)
		{
			System.out.println("b["+i+"] = " + b[i]);
		}
		System.out.println();

		int[] c = new int[5];
		Scanner s = new Scanner(System.in);
		for(i=0; i<c.length; i++)
		{
			System.out.print("Enter a value for c[" + i + "] : ");
		   c[i] = s.nextInt();
		}
		System.out.println();

		/*

		Syntax of Enhansed for (or foreach) Loop
		****************************************

		for(Datatype Variable : Array/Collection)
		{
			Statements;
		}  
		*/
	
		for(int x : c)
		{
		   System.out.println("x = " + x);
		}
   }
}