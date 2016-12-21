import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamDemo3
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("TestFile3.txt",true);

		/* FileOutputStream fos = new FileOutputStream("TestFile3.txt",true);
		   ->If we do not specify "true" the old contents will be overriden by new contents
		   ->If we specify "true" the newer contents will be added to the old contents (at the end of the file).	
		*/


		String str = "Welcome to Java Programming. Thank you.\n";
		str = "Executing the Program for Second Time.\n";
		byte[] b = str.getBytes();

		fos.write(b);
		fos.close();

		System.out.println("Data Written to the File Completed Successfully... \n");
	}
}
