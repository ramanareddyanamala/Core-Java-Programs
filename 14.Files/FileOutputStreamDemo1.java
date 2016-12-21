import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamDemo1 
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("TestFile1.txt");
		//FileOutputStream fos = new FileOutputStream("D:\\Harsha\\z\\a.txt");

		for(int i=65; i<=90; i++)
		{
			fos.write((char)i);
			fos.write(' ');
		}
		fos.close();
		System.out.println("Data Written to the File Completed Successfully... \n");
	}
}
