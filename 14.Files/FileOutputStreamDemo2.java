import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamDemo2 
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("TestFile2.txt");
		//by default write mode
	
		//String str = "Welcome to Java Programming. Thank you.\n";
		String str = "Executing the Program for Second Time";
		byte[] b = str.getBytes();

		fos.write(b);
		fos.close();

		System.out.println("Data Written to the File Completed Successfully... \n");
	}
}
