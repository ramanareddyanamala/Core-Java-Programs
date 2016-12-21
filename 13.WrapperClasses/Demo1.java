//Demonstrate on Wrapper Class
class Demo1
{
	public static void main(String[] args) 
	{		
		Short b = Short.parseShort("12");
		Short c = Short.parseShort("45");

		int d = Integer.parseInt("25");
		int e = Integer.parseInt("50");

		Long f = Long.parseLong("12");
		Long g = Long.parseLong("45");

		Float h = Float.parseFloat("1.2");
		Float i = Float.parseFloat("4.5");

		Double j = Double.parseDouble("12.36954");
		Double k = Double.parseDouble("45.345454");

		Boolean b1 = new Boolean(false);
		boolean b2 = b1.booleanValue();
		System.out.println(b2);

		System.out.println("Sum of "+b+" and "+c+" is "+(b+c));
		System.out.println("Sum of "+d+" and "+e+" is "+(d+e));
		System.out.println("Sum of "+f+" and "+g+" is "+(f+g));
		System.out.println("Sum of "+h+" and "+i+" is "+(h+i));
		System.out.println("Sum of "+j+" and "+k+" is "+(j+k));		
	}
}