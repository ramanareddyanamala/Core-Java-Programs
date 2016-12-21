class AccessDemo6 extends AccessDemo1
{
	public static void main(String[] args) 
	{
		AccessDemo6 obj = new AccessDemo6();
		obj.M1();	//public
		//obj.M2();	//private
		obj.M3();	//protected
		obj.M4();	//default
	}
}
