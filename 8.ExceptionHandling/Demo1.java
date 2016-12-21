/*
	Errors
	******
	1. Compile Time Error
	2. Logical Error
	3. Runtime Error


RunTime Error
*************

1. try
	{
		1. identify the statements which are generating the runtime error and enclose them with in the try block.

		2. identify the statements which are dependent on the statement which is generating the runtime error and enclose them with in the try block.
	}

2. catch(Exception ex)
	{
		Provide the statements that has to be executed if runtime error occurs. (simply we are handling the runtime error)
	}

3. throw
		throw is a keyword which is used to throw the user defined exceptions.

4. throws
		thows is a keyword which is used to throw the unhandled exceptions.

5. finally
	{
		finally is a block which is used to execute the statements irrespective of the application is executed successfully or not.
	}

*/

import java.util.Scanner;
class Demo1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c;

		try
		{
			c = a/b;
			System.out.println("Quotient = " + c + "\n");
		}		
		catch(Exception ex)
		{
			System.out.println("Error Occured:");
			System.out.println(ex);
			System.out.println();
			ex.printStackTrace();
		}		

		System.out.println("Welcome \n");
	}
}
