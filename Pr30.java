import java.util.*;
import java.io.*;

public class Pr30{
	public static void main(String[] args){
		try{
			File f1 = new File("C:\\Users\\NEEL YASH\\Desktop\\JAVA Practicals\\textfile.txt");
			int i;
			String s= "";
			if(f1.exists()){
				FileReader fin = new FileReader(f1);
				
				while((i=fin.read()) != -1){
					s = s+(char)i;
				}
				fin.close();
			}
			System.out.println(s);
			FileWriter fout = new FileWriter("C:\\Users\\NEEL YASH\\Desktop\\JAVA Practicals\\textfile2.txt");
			for(i=0;i<s.length();i++){
				fout.write(s.charAt(i));
			}
			fout.close();
			
		}catch(IOException e){
			System.out.println(e);
		}
	}
}