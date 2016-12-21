class Demo11 
{
	public void MyMethod()
	{
		System.out.println("MyMethod() Called...");
	}

	public static void main(String[] args) 
	{		
		//Using Object Support.
		new Demo11().MyMethod();
		new Demo11().MyMethod();
		new Demo11().MyMethod();	
		System.out.println();	
		

		//Using Object Reference
		Demo11 obj1 = new Demo11();
		obj1.MyMethod();
		obj1.MyMethod();
		obj1.MyMethod();
		System.out.println();

		Demo11 obj2;				//obj2 = Variable
		obj2 = new Demo11();		//obj2 = Reference Variable
		obj2.MyMethod();
		obj2.MyMethod();
		obj2.MyMethod();
	}
}