import MyPackage1.AccessDemo3;

class AccessDemo4 
{
	public static void main(String[] args) 
	{
		AccessDemo3 obj = new AccessDemo3();
		obj.M1();	//public
		//obj.M2();	//private
		//obj.M3();	//protected
		//obj.M4();	//default
	}
}
