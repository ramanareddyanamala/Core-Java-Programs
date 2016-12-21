import java.lang.*;
class Demo2
{
	public static void main(String[] args)
	{
		long l1 = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer("");

		for(int i=1; i<=10000; i++)
		{
			sb.append((int)(Math.random()*10+1) + ", ");
			//s1 += (int)(Math.random()*10+1) + " ,";
		}

		long l2 = System.currentTimeMillis();
		System.out.println("Time took : " + (l2-l1) + " ms \n\n");
	}
}