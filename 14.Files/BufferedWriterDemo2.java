import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedWriterDemo2
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("Enter the path of the file : ");
		String path = new java.util.Scanner(System.in).nextLine();

		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new FileWriter(path));

		String str = ""; 
		String ch = "";

		do
		{
			System.out.println("Enter Some Data");  
			str = br.readLine(); 

			bw.write(str);

			//bw.write("\n");
			bw.newLine();

			bw.flush();

			System.out.println();
			System.out.print("Do You Want To Enter Another Line (y/n) : ");
			ch = br.readLine();

			System.out.println();
		}    
		while(ch.equals("y"));

		br.close();  
		bw.close();  
	}
}