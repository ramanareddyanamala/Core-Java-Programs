import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderDemo1
{
	public static void main(String[] args) throws IOException,InterruptedException
	{
		/*
		FileReader fr = new FileReader("BufferedReaderDemo1.java");
		BufferedReader br = new BufferedReader(fr);
		*/

		BufferedReader br = 
			new BufferedReader(new FileReader("1.txt"));

		String s="";

		while((s=br.readLine()) != null)
		{
			System.out.println(s);
			Thread.sleep(50);
		}
		br.close();
	}
}
