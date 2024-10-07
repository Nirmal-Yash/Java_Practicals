import java.util.*;
public class Pr24{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		try{
			System.out.println(x/y);
		}catch(Exception e){
			System.out.println("Catch block Executed , found an Error " + e);
		}
	}
}