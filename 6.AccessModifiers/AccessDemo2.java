class AccessDemo2 
{
	public static void main(String[] args) 
	{
		AccessDemo1 obj = new AccessDemo1();

		obj.M1();	//public
		//obj.M2();	//private
		obj.M3();	//protected
		obj.M4();	//default
	}
}
