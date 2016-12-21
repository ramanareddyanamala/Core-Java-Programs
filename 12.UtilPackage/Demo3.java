import java.util.Random;
class Demo3
{
	public static void main(String[] args)
	{
		Random obj = new Random();
		
		for(int i=1; i<=5; i++)
		{
			System.out.println(obj.nextInt());
		}
		System.out.println("\n");

		for(int i=1; i<=5; i++)
		{
			System.out.println(obj.nextInt(100));
		}
		System.out.println("\n");		
	}
}