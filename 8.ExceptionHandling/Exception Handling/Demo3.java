import java.util.*;
class Demo3 
{
	public void Hello()
	{
		System.out.println("Welcome to Hello() Method...");
	}
	public static void main(String[] args) 
	{
		Demo3 obj = new Demo3();
		obj.Hello();
		try
		{
			obj = null;
			obj.Hello();
		}
		catch (NullPointerException ex)
		{
			System.out.println("NullPointerException Occured : " + ex);
		}		
	}
}
