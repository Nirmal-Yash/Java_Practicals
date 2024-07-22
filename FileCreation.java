import java.io.*;
public class FileCreation
	{
		public static void main(String[] args)
		{
			try
			{
				File file = new File("newfile1.txt");
				if (!file.exists())
					{
						file.createNewFile();
						System.out.println("File created Successfully.");
					}
			}
			catch (IOException e)
			{
				System.out.println("I/O Exception occurred.");
			}
		}
		} 