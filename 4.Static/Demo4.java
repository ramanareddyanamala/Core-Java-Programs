class Example4
{
	public void Method1()
	{
		System.out.println("Non-Static Method1()");
	}

	public static void Method2()
	{
		System.out.println("Static Method2()");
	}
}

class Demo4 
{
	public static void main(String[] args) 
	{
		Example4 obj = new Example4();
		obj.Method1();

		obj.Method2();
		Example4.Method2();
	}
}