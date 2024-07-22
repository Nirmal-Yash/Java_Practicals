import java.io.*;
public class FileWrite
	{
		public static void main(String[] args)
		{
		try
		{
			FileOutputStream fout = new FileOutputStream("newfile.txt");
			String s="India is Great";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Writing Complete!");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		}
	}
