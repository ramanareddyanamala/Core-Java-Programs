//Methods
class Demo12 
{
	public void M1()
	{
		System.out.println("void M1() \n");
	}
	public void M2(int a, char b, float c)
	{
		System.out.println("void M2(int a, char b, float c)");
		System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
		System.out.println();
	}
	public int M3()
	{
		System.out.println("int M3()");
		return 45+55;
	}
	public String M4(String name)
	{
		System.out.println("String M4(String name)");
		return "Welcome " + name;
	}

	public static void main(String[] args) 
	{
		Demo12 obj = new Demo12();
		obj.M1();
		obj.M2(25, '@', 12.36f);

		int a = obj.M3();
		System.out.println("a = " + a + "\n");

		System.out.println("Value = " + obj.M3() + "\n");

		String str = obj.M4("Abhishek");
		System.out.println(str + "\n");

		System.out.println(obj.M4("Ravi"));
	}
}
