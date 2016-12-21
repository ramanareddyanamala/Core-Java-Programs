//Demonstration on Enumeration

import java.util.Vector;
import java.util.Enumeration;

public class Demo2
{
	public static void main(String args[]) 
	{
		int i = 1;
		Enumeration e;
		Vector v = new Vector();

		v.add("Sunday");
		v.add("Monday");
		v.add("Tuesday");
		v.add("Wednesday");
		v.add("Thursday");
		v.add("Friday");
		v.add("Saturday");

		e = v.elements();

		while(e.hasMoreElements())			
		{
			System.out.println("Day-" + i + " : " + e.nextElement()); 
			i++;
		}
		System.out.println();
	}
}