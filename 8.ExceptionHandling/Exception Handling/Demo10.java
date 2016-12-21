import java.util.*;
class Demo10
{
	public static String Capitalize(String s) throws NullPointerException
	{
		if(s==null)
		{
			throw new NullPointerException("You have passed a Null Argument");
		}
		else
		{
			Character firstchar = s.charAt(0);
			String RestCharacters = s.substring(1);

			return firstchar.toString().toUpperCase() + "" + RestCharacters;
		}
	}

	public static void main(String[] args) 
	{
		String input = null;

		try
		{
			String str = Capitalize(input);
			System.out.println("str = " + str);
		}
		catch(NullPointerException ex)
		{
			System.out.println("Error : " + ex);
		}
	}
}
