class Prog4 
{
	int a;
	char b;
	float c;
	String d;
	boolean e;

	Prog4()
	{
		a = 25;
		b = '@';
		c = 1.2f;
		d = "Welcome";
		e = true;
	}

	Prog4(int a, char b, float c, String d, boolean e)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}

	public static void main(String[] args) 
	{		
		Prog4 obj1 = new Prog4(100, '#', 12.36f, "Thank You", false);
		System.out.println("obj1.a = " + obj1.a);
		System.out.println("obj1.b = " + obj1.b);
		System.out.println("obj1.c = " + obj1.c);
		System.out.println("obj1.d = " + obj1.d);
		System.out.println("obj1.e = " + obj1.e);
		System.out.println("\n");

		Prog4 obj2 = new Prog4();
		System.out.println("obj2.a = " + obj2.a);
		System.out.println("obj2.b = " + obj2.b);
		System.out.println("obj2.c = " + obj2.c);
		System.out.println("obj2.d = " + obj2.d);
		System.out.println("obj2.e = " + obj2.e);
		System.out.println("\n");

		Prog4 obj3 = new Prog4(125, '$', 45.56f, "Hello", true);
		System.out.println("obj3.a = " + obj3.a);
		System.out.println("obj3.b = " + obj3.b);
		System.out.println("obj3.c = " + obj3.c);
		System.out.println("obj3.d = " + obj3.d);
		System.out.println("obj3.e = " + obj3.e);
		System.out.println("\n");
	}
}