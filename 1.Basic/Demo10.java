//Command Line Arguments
class Demo10
{
	public static void main(String[] s)
	{
		/*
		System.out.println("s[0] = " + s[0]);
		System.out.println("s[1] = " + s[1]);
		System.out.println("s[2] = " + s[2]);
		*/

		for(int i=0; i<s.length; i++)
		{
			System.out.println("s["+i+"] = " + s[i]);
		}
	}
}