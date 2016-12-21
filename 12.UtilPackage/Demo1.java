import java.util.Calendar;
class Demo1
{
	public static void main(String[] args)
	{
		Calendar obj = Calendar.getInstance();

		System.out.println("Date : " + obj.get(Calendar.DATE));		
		
		System.out.println("DAY-OF-WEEK : " + obj.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Day of the Year : " + obj.get(Calendar.DAY_OF_YEAR));

		int hh  = obj.get(Calendar.HOUR);
		int min = obj.get(Calendar.MINUTE);
		int sec = obj.get(Calendar.SECOND);

		System.out.println("Time : " + hh + ":" + min + ":" + sec);
		System.out.println(obj.getTime() + "\n");
	}
}