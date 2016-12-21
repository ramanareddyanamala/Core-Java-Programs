//Demonstration on Hashtable

import java.util.Hashtable;
import java.util.Enumeration;
class Demo5
{
	public static void main(String[] args) 
	{
		Hashtable ht = new Hashtable();

		ht.put("Nikil", 77);
		ht.put("Ramu",  85);
		ht.put("Ajay",  87.6);
		ht.put("Krish", 91);
		ht.put("Priya", 69);

		//Show all Names from Hashtable
		Enumeration names = ht.keys();
		while(names.hasMoreElements())
		{
			System.out.println(names.nextElement());
		}
		System.out.println();

		System.out.println("Nikil : " + ht.get("Nikil"));		
		System.out.println("Ramu  : " + ht.get("Ramu"));
		System.out.println("Ajay  : " + ht.get("Ajay"));
		System.out.println("Krish : " + ht.get("Krish"));
		System.out.println("Priya : " + ht.get("Priya"));		
		System.out.println();

		System.out.println(ht.hashCode());				
	}
}
