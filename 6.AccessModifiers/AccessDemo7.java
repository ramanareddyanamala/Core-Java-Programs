import MyPackage1.AccessDemo3;

class AccessDemo7 extends AccessDemo3
{
	public static void main(String[] args) 
	{
		AccessDemo7 obj = new AccessDemo7();
		obj.M1();	//public
		//obj.M2();	//private
		obj.M3();	//protected
		//obj.M4();	//default
	}
}