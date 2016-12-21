import java.util.Date;
class Demo2
{
	public static void main(String[] args)
	{
		Date obj = new Date();
		System.out.println("Current Date and Time : " + obj + "\n");

		System.out.print(obj.getDate() + "-");
		System.out.print((obj.getMonth()+1) + "-");	//as month starting from 0
		System.out.println(obj.getYear() + 1900 + "\n");

		System.out.print(obj.getHours() + ":");
		System.out.print(obj.getMinutes() + ":");
		System.out.print(obj.getSeconds() + "\n");		
	}
}