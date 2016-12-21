//Demonstration on Vector

import java.util.Vector;
class Demo3
{
	public static void main(String[] args) 
	{
		//Vector v = new Vector();	 //Initial Size is 10 and increment is 10

		Vector v = new Vector(3,2); //Initial size is 3 and increment is 2
		System.out.println("isEmpty          : " + v.isEmpty());
		System.out.println("Initial Size     : " + v.size());
		System.out.println("Initial Capacity : " + v.capacity() + "\n");


		v.addElement(1);
		v.addElement(2);
		System.out.println("Initial Size     : " + v.size());
		System.out.println("Initial Capacity : " + v.capacity() + "\n");
		

		v.addElement(3);
		System.out.println("Initial Size     : " + v.size());
		System.out.println("Initial Capacity : " + v.capacity() + "\n");
		
		
		v.addElement(4);
		System.out.println("Initial Size     : " + v.size());
		System.out.println("Initial Capacity : " + v.capacity() + "\n");
		
		
		
		System.out.println(v + "\n");


		v.add(5);
		System.out.println(v + "\n");

		v.add("Hello");
		System.out.println(v + "\n");


		
		System.out.println("First Element : " + v.firstElement());
		System.out.println("Last  Element : " + v.lastElement() + "\n");


		System.out.println("Contains 3 : " + v.contains(3));
		System.out.println("isEmpty    : " + v.isEmpty() + "\n");


		System.out.println("Element at index 2      : " + v.get(2));
		System.out.println("Element 5 index is      : " + v.indexOf(5));
		System.out.println("Element Hello index is  : " + v.indexOf("Hello") + "\n");


		v.remove(3);	//By default integer value will be treated as index value.
		System.out.println(v + "\n");

		v.remove("Hello");
		System.out.println(v + "\n");

		v.clear();
		System.out.println("isEmpty          : " + v.isEmpty());
		System.out.println("Size             : " + v.size());
		System.out.println("Capacity         : " + v.capacity() + "\n");

		v.trimToSize();
		System.out.println("After trimToSize()");
		System.out.println("Capacity         : " + v.capacity() + "\n");	
	}
}
