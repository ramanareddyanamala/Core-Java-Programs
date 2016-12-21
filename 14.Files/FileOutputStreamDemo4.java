/*Java Program to Copy the contents of one file to another*/

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class FileOutputStreamDemo4
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream  fis = new FileInputStream ("MyFile1.txt");
		FileOutputStream fos = new FileOutputStream("MyFile2.txt");	//("MyFile2.txt",true);	//append mode

		int i;
		while((i=fis.read())!= -1)
		{
			fos.write((char)i);
			System.out.print((char)i);
		}

		fis.close();
		fos.close();
		System.out.println("\nFile Copy Operation Completed Successfully...");
	}
}