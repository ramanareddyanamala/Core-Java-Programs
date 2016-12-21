//Call by Value
class Demo14 
{
	public void MyMethod(int x)
	{
		System.out.println("x = " + x);
		x++;
		System.out.println("x = " + x + "\n");
	}

	public static void main(String[] args) 
	{
		int a = 25;
		System.out.println("a = " + a + "\n");

		Demo14 obj = new Demo14();
		obj.MyMethod(a);

		System.out.println("a = " + a + "\n");
	}
}
