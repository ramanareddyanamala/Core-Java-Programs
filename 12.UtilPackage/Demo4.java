import java.util.Scanner;
class Demo4
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter Your Name   : ");
		String name  = obj.next();

		System.out.print("Enter Your Age    : ");
		int age = obj.nextInt();

		System.out.print("Enter Your Salary : ");
		double sal = obj.nextDouble();

		System.out.println();
		System.out.println("Employee Information");
		System.out.println("--------------------");
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
		System.out.println("Sal  : " + sal);
	}
}