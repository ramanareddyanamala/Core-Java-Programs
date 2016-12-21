import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class DataOutputStreamDemo1
{
	public static void main(String[] args) throws IOException
	{
		/*
		FileOutputStream fos = new FileOutputStream("Sample1.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		*/

		DataOutputStream dos = 
			new DataOutputStream(new FileOutputStream("Sample1.txt"));
		
		dos.writeByte(128);
		dos.writeInt(125);
		dos.writeChar('K');
		dos.writeFloat(12.34f);
		dos.writeShort(456);
		dos.writeLong(1234567890);
		dos.writeChars("ABC");
		
		dos.close();

		System.out.println("Data Written to the File Completed Successfully...");
	}
}
