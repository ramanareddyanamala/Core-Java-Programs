class Demo1 
{
	int a;
	static int b;

	public static void main(String[] args) 
	{		
		Demo1 obj = new Demo1();
		obj.a = 25;
		b = 50;

		System.out.println("a = " + obj.a + "\nb = " + b + "\n");
	}
}
