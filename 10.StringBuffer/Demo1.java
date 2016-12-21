import java.lang.*;
class Demo1
{
	public static void main(String[] args)
	{
		long l1 = System.currentTimeMillis();
		String s1 = "";

		for(int i=1; i<=10000; i++)
		{
			s1 += (int)(Math.random()*10+1) + ", ";
		}

		long l2 = System.currentTimeMillis();
		System.out.println("Time took : " + (l2-l1) + " ms");
	}
}