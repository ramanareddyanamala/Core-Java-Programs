import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamDemo2
{
	public static void main(String[] args) throws IOException,InterruptedException
	{
		//FileInputStream fis = new FileInputStream("FileInputStreamDemo2.java");

		//FileInputStream fis = new FileInputStream("D:\\Harsha\\Z\\abc.txt");

		FileInputStream fis = new FileInputStream("MyFile1.txt");

		int i;
		
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
			Thread.sleep(100);
		}
		
		fis.close();
		System.out.println("\n");
	}
}
