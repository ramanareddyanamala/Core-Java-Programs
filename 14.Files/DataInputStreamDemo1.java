import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class DataInputStreamDemo1
{
	public static void main(String[] args) throws IOException
	{
		/*
		FileInputStream fis = new FileInputStream("Sample1.txt");
		DataInputStream dis = new DataInputStream(fis);
		*/

		DataInputStream dis = 
			new DataInputStream(new FileInputStream("Sample1.txt"));		

	
		byte a = dis.readByte();
		int b = dis.readInt();
		char c = dis.readChar();
		float d = dis.readFloat();
		short e = dis.readShort();
		long f = dis.readLong();
		String g = dis.readLine();

		System.out.println("Byte  Value : " + a);
		System.out.println("Int   Value : " + b);
		System.out.println("Char  Value : " + c);
		System.out.println("Float Value : " + d);
		System.out.println("Short Value : " + e);
		System.out.println("Long  Value : " + f);
		System.out.println("Line  Value : " + g);
		System.out.println("\n");
		
		
	/*
		System.out.println("Byte  Value : " + dis.readByte());
		System.out.println("Int   Value : " + dis.readInt());
		System.out.println("Char  Value : " + dis.readChar());
		System.out.println("Float Value : " + dis.readFloat());
		System.out.println("Short Value : " + dis.readShort());
		System.out.println("Long  Value : " + dis.readLong());
		System.out.println("Line  Value : " + dis.readLine());
		System.out.println("\n");
		*/
		
		dis.close();

		System.out.println("\n\nData Written to the File Completed Successfully...");
	}
}