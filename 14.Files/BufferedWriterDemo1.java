import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
 
public class BufferedWriterDemo1 
{
	public static void main(String[] args) throws IOException
	{	
		/*
		FileWriter fw = new FileWriter("BFile1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		*/
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("BFile1.txt"));

		String str = "Welcome to BufferedWriter Demo";
		bw.write(str);			
		bw.close(); 

		System.out.println("Done");
	}
}