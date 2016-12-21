class Demo2 
{
	void Method1()
	{
		System.out.println("Non-Static Method1() \n");
	}

	static void Method2()
	{
		System.out.println("Static Method2() \n");
	}

	public static void main(String[] args) 
	{
		Demo2 obj = new Demo2();
		obj.Method1();

		Method2();
		obj.Method2();
	}
}
