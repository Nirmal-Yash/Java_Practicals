import java.io.*;
import java.util.*;

public class Pr27{
	public static void main(String[] args) {
        		for (String file : args) {
            			try {
                				File f = new File(file);
                				if (f.exists()) {
                    				int count = 0;
                    				Scanner fileScanner = new Scanner(f);
                    				while (fileScanner.hasNextLine()) {
                        					fileScanner.nextLine();
                        					count++;
                    				}
                    				System.out.println(file + " has " + count + " lines.");
                				} else {
                   	 			System.out.println("Error: File " + file + " does not exist.");
                				}
            			} catch (IOException e) {
               	 			System.out.println("Error: Unable to read file " + file + ": " + e.getMessage());
            			}
        		}
    	}
}