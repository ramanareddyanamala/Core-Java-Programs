class AccessDemo1 
{
	public void M1()
	{
		System.out.println("M1() is Public");
	}
	private void M2()
	{
		System.out.println("M2() is Private");
	}
	protected void M3()
	{
		System.out.println("M3() is Protected");
	}
	void M4()
	{
		System.out.println("M4() is Default");
	}

	public static void main(String[] args) 
	{
		AccessDemo1 obj = new AccessDemo1();
		obj.M1();	//public
		obj.M2();	//private
		obj.M3();	//protected
		obj.M4();	//default
	}
}
