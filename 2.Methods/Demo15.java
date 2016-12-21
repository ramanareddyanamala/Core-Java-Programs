//Method overloading
//Implementing Static/Compile Time/Early Binding Ploymorphism
class Demo15 
{
	public void MyMethod()
	{
		System.out.println("MyMethod()");
	}
	public void MyMethod(int a)
	{
		System.out.println("MyMethod(int a)");
	}
	public void MyMethod(char b)
	{
		System.out.println("MyMethod(char b)");
	}
	public void MyMethod(float c)
	{
		System.out.println("MyMethod(float c)");
	}
	public void MyMethod(double d)
	{
		System.out.println("MyMethod(double d)");
	}
	public void MyMethod(int a, int b)
	{
		System.out.println("MyMethod(int a, int b)");
	}
	public void MyMethod(int a, char b)
	{
		System.out.println("MyMethod(int a, char b)");
	}
	public void MyMethod(char a, int b)
	{
		System.out.println("MyMethod(char a, int b)");
	}
	public void MyMethod(int a, int b, int c)
	{
		System.out.println("MyMethod(int a, int b, int c)");
	}
	public void MyMethod(int a, char b, float c)
	{
		System.out.println("MyMethod(int a, char b, float c)");
	}

	public static void main(String[] args) 
	{
		Demo15 obj = new Demo15();
		obj.MyMethod();
		obj.MyMethod(25);
		obj.MyMethod('@');
		obj.MyMethod(1.2f);
		obj.MyMethod(1.2);
		obj.MyMethod(2, 3);
		obj.MyMethod(25, '$');
		obj.MyMethod('#', 45);
		obj.MyMethod(10, 20, 30);
		obj.MyMethod(1, '#', 1.2f);
	}
}
