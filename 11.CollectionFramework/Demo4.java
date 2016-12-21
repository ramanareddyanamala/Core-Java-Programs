//Demonstration on Dictonary class

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class Demo4
{
	//Using Property
	static String newLine = System.getProperty("line.separator");

	public static void main(String[] args)
	{
  
		System.out.print("Dictionary in Java" + newLine);
		System.out.print("------------------" + newLine + newLine);

		
		//dictionary object can be created using HashTable object also as dictionary is an abstract class
		Dictionary d = new Hashtable();

		System.out.println("Is Dictonary Empty  : " + d.isEmpty());
		System.out.println("Dictonary Size      : " + d.size() + "\n");
    
	
		//you add elements to dictionary using put method put(key, value)
		d.put(1,"Java");
		d.put(2,".NET");
		d.put(3,"Javascript");
		d.put(4,"HTML");
				
		System.out.println("Dictonary Size : " + d.size());
		System.out.println("Dictionary Items are \n" + d + newLine);
    	
		//Retrieving Elements by using their keys
		System.out.println("Get Element Using key 1 : " + d.get(1));
		System.out.println("Get Element Using key 2 : " + d.get(2));
		System.out.println("Get Element Using key 3 : " + d.get(3));
		System.out.println("Get Element Using key 4 : " + d.get(4));
		System.out.print(newLine);
		
    
		//elements can be removed using their key
		System.out.println("Removing element from key 2 : " + d.remove(2)); 
		System.out.println(d + newLine);

		System.out.println("Removing element from key 4 : " + d.remove(4));
		System.out.println(d + newLine);

		System.out.println("Is Dictonary Empty : " + d.isEmpty() + "\n");		
  }
}