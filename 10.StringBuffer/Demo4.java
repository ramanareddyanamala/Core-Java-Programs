class Demo4
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Hello World");

		System.out.println("sb1 = " + sb1 + "\n");

		System.out.println("Character at 0 : " + sb1.charAt(0));
		System.out.println("Character at 4 : " + sb1.charAt(4));

		System.out.println("\nsb1 = " + sb1);
		sb1.setCharAt(0,'A');
		sb1.setCharAt(4,'B');
		System.out.println("After Setting the Characters 0 and 4 indexes");
		System.out.println(sb1 + "\n");

		sb1 = new StringBuffer("Rama");	//will replace the previous value.
		System.out.println("New value of sb1 : " + sb1 + "\n");
	}
}