class Demo3
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("10");
		StringBuffer sb3 = new StringBuffer("Hello");

		System.out.println();
		System.out.println("To Convert StringBuffer to String");
		System.out.println("---------------------------------");
		System.out.println("sb1 = " + sb1 +
										 "\nsb2 = " + sb2.toString() + 
										 "\nsb3 = " + sb3.toString() + "\n");



		System.out.println("To Find the Lenght of StringBuffer");
		System.out.println("----------------------------------");
		System.out.println("Lenght of sb1 = " + sb1.length());
		System.out.println("Lenght of sb2 = " + sb2.length());
		System.out.println("Lenght of sb3 = " + sb3.length() + "\n");


		System.out.println("To Find the Capacity of StringBuffer");
		System.out.println("------------------------------------");
		System.out.println("Capacity of sb1 = " + sb1.capacity());
		System.out.println("Capacity of sb2 = " + sb2.capacity());
		System.out.println("Capacity of sb3 = " + sb3.capacity() + "\n");

		sb1.ensureCapacity(50);
		System.out.println("New Capacity of sb1 = " + sb1.capacity());
	}
}