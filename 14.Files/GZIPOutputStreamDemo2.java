import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.GZIPOutputStream;

public class GZIPOutputStreamDemo2 
{	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Path of Source File : ");
		String sf = s.next();

		System.out.print("Enter the Paht of Destination File with .gzip as its extension : ");
		String df = s.next(); 

		byte[] buffer = new byte[1024];
		try 
		{
			FileOutputStream fos =new FileOutputStream(df);
			GZIPOutputStream gzos = new GZIPOutputStream(fos);
			FileInputStream fis = new FileInputStream(sf); 

			int i;
			while((i=fis.read(buffer)) > 0) 
			{
				gzos.write(buffer, 0, i);
			}
			fis.close();
			gzos.finish();
			gzos.close();

			System.out.println("The file was compressed successfully!");
		}
		catch (IOException ex) 
		{
            ex.printStackTrace();
		}

		System.out.println("Program Completed... \n");
	} 
}
