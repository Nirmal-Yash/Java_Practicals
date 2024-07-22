import java.io.*;
public class FileRead
	{
		public static void main(String[] args)
		{
		try
		{
			FileInputStream fin = new FileInputStream("newfile.txt");
			int i;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
	}
}
}
