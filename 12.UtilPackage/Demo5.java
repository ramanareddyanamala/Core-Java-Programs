import java.util.StringTokenizer;
class Demo5
{
	public static void main(String[] args)
	{
		StringTokenizer obj = new StringTokenizer
			("Welcome@ @to@ @Java@ @Program", "@");

		//@->Delimiter

		while(obj.hasMoreTokens())
		{
			System.out.println(obj.nextToken());
		}
		System.out.println();
	}
}