import java.io.*;
import java.util.Scanner;
import java.io.IOException;
class FileRW{
	public static void main(String[] args){
		
		File f3=new File("filenew1.txt");
		try{
			
			if(f3.delete())
			System.out.println("Deleted Successfully");
			else
			System.out.println("Error Deleting File");
		}
		catch(IOException e){
			System.out.println("Error Deleting File");
		}
	}
}