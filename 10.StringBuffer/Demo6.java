class Demo6
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Rama Rao");

		System.out.println("Name : " + sb1);


		sb1.insert(4,"Krishna");
		System.out.println("Name : " + sb1);

		sb1.reverse();
		System.out.println("Name : " + sb1);

		sb1.reverse();
		System.out.println("Name : " + sb1);

		sb1.delete(1,3);
		System.out.println("Name : " + sb1);

		sb1.delete(0, sb1.length());
		System.out.println("Name : " + sb1);
	}
}