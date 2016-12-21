import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPInputStreamDemo1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Path of Source File with .gzip as its extension : ");
		String sf = s.next();

		System.out.print("Enter the Path of Destination File  : ");
		String df = s.next(); 

		byte[] buffer = new byte[1024];
		try 
		{
			FileInputStream fis = new FileInputStream(sf);
			GZIPInputStream gzis= new GZIPInputStream(fis);
			FileOutputStream fos = new FileOutputStream(df);

			int i;
			while((i=gzis.read(buffer))>0) 
			{
				fos.write(buffer, 0, i);
			}
			gzis.close();
			fos.close(); 
			System.out.println("The file was decompressed successfully!");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}

		System.out.println("Program Completed... \n");
	}
}
