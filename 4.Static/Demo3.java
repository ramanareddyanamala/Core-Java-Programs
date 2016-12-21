class Demo3
{
	int a;
	static int b;

	void Method1()
	{
		a = 25;
		b = 50;
		System.out.println("a = " + a + "\nb = " + b + "\n");
	}

	static void Method2()
	{
		Demo3 obj = new Demo3();
		obj.a = 75;
		b = 100;
		System.out.println("a = " + obj.a + "\nb = " + b + "\n");
	}
	public static void main(String[] args) 
	{
		Demo3 obj = new Demo3();
		obj.Method1();
		Method2();
	}
}
