import java.io.*;
import java.util.*;

public class Pr28{
	public static void main(char arg) {
  		try {
                			File f = new File("C:\\Users\\NEEL YASH\\Desktop\\JAVA Practicals\\xanadu.txt");
               			if (f.exists()) {
				int count = 0;
                 				Scanner sc = new Scanner(f);
                				while (sc.hasNext()) {
                 					if(((char)sc.nextInt())==(Character.toUpperCase(arg))||(sc.next())==(Character.toLowerCase(arg)))
						count++;
				}
                 				System.out.println(file + " has "+ arg+ " character " + count + " times.");
 			}
            		} catch (IOException e) {
	 		System.out.println("Error: Unable to read file :" + e.getMessage());
            		}
        	}
}