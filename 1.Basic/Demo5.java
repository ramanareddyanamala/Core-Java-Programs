import java.lang.*;
class Demo5
{
   public static void main(String[] args)
   {
	int s1,s2,s3,s4,s5,s6;
	float tot,avg;
	java.util.Scanner s = new java.util.Scanner(System.in);
	
	System.out.println("Enter Six Subjects Marks");
	s1 = s.nextInt();
	s2 = s.nextInt();
	s3 = s.nextInt();
	s4 = s.nextInt();
	s5 = s.nextInt();
	s6 = s.nextInt();
	System.out.println();

	System.out.println("Marks of Subject 1 : " + s1);
	System.out.println("Marks of Subject 2 : " + s2);
	System.out.println("Marks of Subject 3 : " + s3);
	System.out.println("Marks of Subject 4 : " + s4);
	System.out.println("Marks of Subject 5 : " + s5);
	System.out.println("Marks of Subject 6 : " + s6);
	System.out.println();

	tot = s1+s2+s3+s4+s5+s6;
	avg = tot/6;

	System.out.println("Total   : " + tot);	
	System.out.println("Average : " + avg);

	if(s1>35 && s2>35 && s3>35 && s4>35 && s5>35 && s6>35)
	{
	   if(avg>=75)
	   {
		System.out.println("Result  : Passed in Distinction");
	   }
	   else if(avg>=60)
	   {
		System.out.println("Result  : Passed in I Division");
	   }
	   else if(avg>=50)
	   {
		System.out.println("Result  : Passed in II Division");
	   }
	   else
	   {
		System.out.println("Result  : Passed in III Division");
	   }
	}
	else
	{
	   System.out.println("Result  : Failed!!!");
	}
	System.out.println("\n");
   }
}