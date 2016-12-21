//Demonstration on Array List
import java.util.ArrayList;
class Demo1
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();	//Creates an empty array list.
		System.out.println("Initial Size : " + al.size());
		System.out.println("Is Empty     : " + al.isEmpty() + "\n");	
		
		
		//Add the elements to the ArrayList
		al.add(10);
		al.add(20);
		al.add('A');
		al.add('E');
		al.add('I');
		al.add('O');
		al.add('U');
		al.add(12.36);
		al.add(true);
		al.add("Welcome");
		System.out.println(al);
		System.out.println("Size         : " + al.size());
		System.out.println("Is Empty     : " + al.isEmpty() + "\n");
				
				
		al.add(2,"Vowels");
		System.out.println(al);
		System.out.println("Size         : " + al.size() + "\n");
		
		
		al.remove("Vowels");
		System.out.println(al);
		System.out.println("Size         : " + al.size() + "\n");
		
		
		al.remove(2);
		System.out.println(al);
		System.out.println("Size         : " + al.size() + "\n");

		System.out.println("Containws('I') : " + al.contains('I'));
		System.out.println("Containws(\"K\") : " + al.contains("K") + "\n");
	
		al.clear();
		System.out.println(al);
		System.out.println("Size           : " + al.size() + "\n");		
	}
}
