/*Java Program to Copy the contents of one file to another*/

import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class FileOutputStreamDemo5
{
	public static void main(String[] args) throws IOException,InterruptedException
	{
		Scanner s = new Scanner(System.in);		
		
		System.out.print("Enter the Source      File Name : ");
		String SourceFile = s.nextLine();
		
		System.out.print("Enter the Destination File Name : ");
		String DestinationFile = s.nextLine();

		try
		{
			FileInputStream  fis = new FileInputStream (SourceFile);
			FileOutputStream fos = new FileOutputStream(DestinationFile);

			System.out.println();
			System.out.println("Contents of " + SourceFile +" File");
			System.out.println("----------------------------------");

			int i;
			while((i=fis.read())!=-1)
			{
				fos.write((char)i);
				System.out.print((char)i);
				Thread.sleep(100);
			}
			fis.close();
			fos.close();

			System.out.print("\n\nWriting the Contents from " + SourceFile + 
				" to " + DestinationFile);
			for(i=1; i<=5; i++)
			{
				Thread.sleep(1000);
				System.out.print(".");
			}
			System.out.println("\n");

			fis = new FileInputStream (DestinationFile);
			System.out.println();
			System.out.println("Contents of Destination File");
			System.out.println("----------------------------");
			
			while((i=fis.read())!=-1)
			{				
				System.out.print((char)i);
				Thread.sleep(100);
			}
			fis.close();

			System.out.println("\nFile Copy Operation Completed Successfully...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}
}
