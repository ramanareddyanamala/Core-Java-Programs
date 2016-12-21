//Demonstration on Explicit Boxing and Un-Boxing

class Demo2
{
	public static void main(String[] args) 
	{			
		//Boxing - Converting Premitive type of data to object type
		int a = 25;
		Integer i = new Integer(a);
		
		
		//Un-Boxing - Converting Object to Premitive Type
		int b = i.intValue();

		System.out.println("a = " + a);
		System.out.println("i = " + i);
		System.out.println("b = " + b);
	}
}