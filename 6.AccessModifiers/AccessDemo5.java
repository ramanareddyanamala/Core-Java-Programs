//Demonstration on Relationship (Parent and Child classes)

class Parent5
{
	public void MyMethod()
	{
		System.out.println("MyMethod() from Parent5 Class");
	}
}

class AccessDemo5 extends Parent5
{
	public static void main(String[] args) 
	{
		AccessDemo5 obj = new AccessDemo5();
		obj.MyMethod();
	}
}
