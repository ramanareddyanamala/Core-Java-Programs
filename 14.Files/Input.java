import java.io.*;
class Input
{
	public static void main(String a[])throws IOException
	{
		//attach the Keyboard to InputStreamReader
		InputStreamReader obj=new InputStreamReader(System.in);

		//attach InputStreamReader to BufferedReader
		BufferedReader br=new BufferedReader(obj);

		System.out.print("Enter any String : ");
		String str = br.readLine();

		//float n=Float.parseFloat(ch);
		//int n=Integer.parseInt(ch);
		System.out.println("U have Entered : " + str + "\n");
	}
}