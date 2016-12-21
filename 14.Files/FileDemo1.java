import java.io.File;
import java.util.Date;
import java.io.IOException;

class FileDemo1 
{
	public static void main(String[] args) throws Exception
	{
		//File f = new File("Speech.txt");
		File f = new File("F:\\Java\\14.Files");

		int count=0;

		if(!f.exists())
		{
			System.out.println("The File or Directory Does not Exist");
			System.exit(0);
		}

		if(f.isDirectory())
		{
			System.out.println("It is a Directory... \n");
			
			File files[] = f.listFiles();
			for(int i=0; i<files.length; i++)
			{
				count++;
				System.out.println(files[i]);
			}
			System.out.println("\nTotal No.of Files : " + count + "\n");
		}
		else
		{
			System.out.println("It is a File... \n");
			
			System.out.println("Readable      : " + f.canRead());
			System.out.println("Editable      : " + f.canWrite());
			System.out.println("Is Hidden     : " + f.isHidden());
			
			System.out.println("Last Modified : " + 
				new Date(f.lastModified()));

			System.out.println("Parent        : " + f.getParent());
			System.out.println("Path          : " + f.getPath());
			System.out.println("Absolute Path : " + f.getAbsolutePath());
			System.out.println("Length        : " + f.length());
			System.out.println("\n");
		}

		File d[] = File.listRoots();
		System.out.println("Root Drives");
		for(int i=0; i<d.length; i++)
		{
			System.out.print(d[i] + "  ");
		}
		System.out.println("\n");
	}
}
