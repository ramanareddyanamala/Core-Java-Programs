class Demo5
{
	public static void main(String[] args)
	{
		Object a = "Hello";
		String b = "Good Bye";
		boolean c = true;
		int d = 7;
		double e = 45.456789;
		
		StringBuffer sb = new StringBuffer();

		sb.append(a);
		sb.append(' ');

		sb.append(b);
		sb.append(' ');

		sb.append(c);
		sb.append(' ');

		sb.append(d);
		sb.append(' ');

		sb.append(e);
		sb.append(' ');

		System.out.println(sb);
	}
}