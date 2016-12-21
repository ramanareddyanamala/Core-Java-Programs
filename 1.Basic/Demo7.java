import java.lang.*;
class Demo7
{
   public static void main(String[] args)
   {
	int i=1;

	System.out.println();
	System.out.println("Using While Loop");
	System.out.println("****************");
	while(i<=10)
	{
	   System.out.print(i + "  ");
	   i++;
	}
	System.out.println("\n");


	i=1;
	System.out.println("Using Do While Loop");
	System.out.println("*******************");
	do
	{
	   System.out.print(i + "  ");
	   i++;
	}
	while(i<=10);
	System.out.println("\n");

	System.out.println("Using For Loop");
	System.out.println("**************");
	for(i=10; i>=1; i--)
	{
	   System.out.print(i + "  ");	 
	}
	System.out.println("\n");	
   }
}