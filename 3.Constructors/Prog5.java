class Prog5 
{
	Prog5()
	{
		System.out.println("Prog5()");
	}
	Prog5(int a)
	{
		System.out.println("Prog5(int a)");
	}
	Prog5(int a, char b)
	{
		System.out.println("Prog5(int a, char b)");
	}
	Prog5(int a, char b, float c)
	{
		System.out.println("Prog5(int a, char b, float c)");
	}

	public static void main(String[] args) 
	{
		Prog5 obj1 = new Prog5();
		Prog5 obj2 = new Prog5(25);
		Prog5 obj3 = new Prog5(10, '@');
		Prog5 obj4 = new Prog5(123, '$', 2.3f);
		System.out.println();

		new Prog5();
		new Prog5(45);
		new Prog5(55, '%');
		new Prog5(99, '&', 1.2f);
	}
}
