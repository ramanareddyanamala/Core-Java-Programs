import java.lang.*;

class Demo4
{
   public static void main(String[] args)
   {
	int age;
	java.util.Scanner s = new java.util.Scanner(System.in);
	
	System.out.println("Enter Your Age : ");	
	age = s.nextInt();

	if(age>17)
	{
	   System.out.println("You are a Major.");
	   System.out.println("You are Eligible for Voting.");
	}
	else
	{
	   System.out.println("You are a Minor.");
	   System.out.println("You are not Eligible for Voting.");
	}
	System.out.println("\n");


	System.out.println("Enter Three Numbers");
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();

	if(a>b && a>c)
	{
	   System.out.println("a is Greater");
	}
	else if(b>c)
	{
	   System.out.println("b is Greater");
	}
	else
	{
	   System.out.println("c is Greater");
	}

	System.out.println("\n");

	System.out.print("Enter Your Age : ");
	age = s.nextInt();

	if(age>12)
	{
	   if(age<20)
	   {
		System.out.println("You are a Teenager");
	   }
	   else
	   {
		System.out.println("Age>20, You are not a Teenager");
	   }
	}
	else
	{
	   System.out.println("Age<13, You are not a Teenager");
	}
   }
}




