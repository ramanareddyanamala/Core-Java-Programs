import java.lang.*;
import java.util.Scanner;
class Demo6
{
   public static void main(String[] args)
   {
	Scanner s = new Scanner(System.in);
	System.out.print("Ente a Number in between (1-3): ");
	int a = s.nextInt();

	switch(a)
	{
	   case 1:System.out.println("Entered Value is 1");
	   break;

	   case 2:System.out.println("Entered Value is 2");
	   break;

	   case 3:System.out.println("Entered Value is 3");
	   break;

	   default:System.out.println("Entered Value is other than 1,2,3");
	   break;
	}
   }
}