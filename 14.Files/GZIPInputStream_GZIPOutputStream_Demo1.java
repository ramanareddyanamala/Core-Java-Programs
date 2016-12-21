import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.Scanner;

public class GZIPInputStream_GZIPOutputStream_Demo1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Path of Source File : ");
		String sf = s.next();

		System.out.print("Enter the Path of Destination File with .gzip as its extension : ");
		String zf = s.next();

		System.out.print("Enter the Path of Destination File : ");
		String df = s.next();		

		byte[] buffer = new byte[1024];
		try 
		{
			FileOutputStream fos  = new FileOutputStream(zf);
			GZIPOutputStream gzos = new GZIPOutputStream(fos);
			FileInputStream fis   = new FileInputStream(sf);

			int i;

			while ((i=fis.read(buffer))>0)
			{
				gzos.write(buffer, 0, i);
			} 

			fis.close(); 
			gzos.finish();
			gzos.close();

			fos=null;
			gzos=null;
			fis=null;         
			System.out.println("The file was compressed successfully!"); 

			fis  = new FileInputStream(zf);
			GZIPInputStream gzis = new GZIPInputStream(fis);
			fos  = new FileOutputStream(df);

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