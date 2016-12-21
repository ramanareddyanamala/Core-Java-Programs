//Passing Array as an Argument and Returning the Array Values
class Demo13 
{
	//Passing Array as an Argument
	public void MyMethod(int[] x)
	{
		for(int i : x)
		{
			System.out.print(i + "  ");
		}
		System.out.println("\n");
	}

	//Returning the Array Values
	public int[] DemoMethod()
	{
		int[] a = new int[]{21,22,23,24,25,26,27,28,29,30};
		return a;
	}

	public static void main(String[] args) 
	{
		int[] a = new int[]{11,12,13,14,15,16,17,18,19,20};

		Demo13 obj = new Demo13();
		obj.MyMethod(a);
		
		int[] j = obj.DemoMethod();
		for(int k : j)
		{
			System.out.print(k + "  ");
		}
		System.out.println();
	}
}
