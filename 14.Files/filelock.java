import java.nio.channels.*;
import java.io.*;

public class filelock 
{
	public static void main(String[] args) 
	{
		FileLock lock = null;
		FileChannel fc = null;

		try
		{
			File f = new File("you file name");
			f.setExecutable(false);
			f.setWritable(false);
			f.setReadable(false);

			System.out.println("Is Execute allow : " + f.canExecute());
			System.out.println("Is Write allow : " + f.canWrite());
			System.out.println("Is Read allow : " + f.canRead());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}