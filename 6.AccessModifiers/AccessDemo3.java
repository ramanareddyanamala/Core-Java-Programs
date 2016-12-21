package MyPackage1;
public class AccessDemo3 
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
}
/*
To Compile the above Program:
1. Open Command Prompt, and go to the path of the above Program.
2. compile tha above program using the following command:
	Sysntax:
	javac -d . FileName.java

	Example:
	javac -d . AccessDemo3.java
*/