import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamDemo1
{
	public static void main(String[] args) throws IOException
	{
		//FileInputStream fis = new FileInputStream("MyFile1.txt");
		FileInputStream fis = new FileInputStream("D:\\Harsha\\Z\\abc.txt");

		int i = fis.read();
		System.out.println(i);		
		System.out.print((char)i);

		i = fis.read();	
		System.out.print((char)i);

		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
	
		fis.close();
		System.out.println("\n");
	}
}