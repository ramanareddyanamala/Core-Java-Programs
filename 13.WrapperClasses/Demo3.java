//Demonstration on Implicit Boxing and Un-Boxing

class Demo3
{
	public static void main(String[] args) 
	{	
		int a = 25;
		Integer i = a;		//Auto Boxing
		int b = i;			//Auto Un-Boxing
		
		System.out.println("a = " + a);
		System.out.println("i = " + i);
		System.out.println("b = " + b);
	}
}
