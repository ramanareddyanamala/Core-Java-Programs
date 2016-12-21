//Program to get the Name of the Current Class using its Object.

class Demo4
{
	public static void main(String[] args) 
	{	
		Object o = new Demo4();
		Class c = o.getClass();
		System.out.println("Current Class Name : " + c + "\n");	
	}
}