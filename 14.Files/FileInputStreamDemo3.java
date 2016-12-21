import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class FileInputStreamDemo3
{
	public static void main(String[] args) throws IOException,InterruptedException
	{
		String path;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the Path of the File : ");
		path = s.nextLine();

		FileInputStream fis = new FileInputStream(path);
		int i;

		System.out.println();
		System.out.println("Contents of : " + path + " file is");
		System.out.println("----------------------------------");

		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
			Thread.sleep(10);
		}
		
		fis.close();
		System.out.println("\n");
	}
}
