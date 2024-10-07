import java.util.*;
import java.io.*;
class IncVal extends Thread{
	int val;
	IncVal(int val){
		this.val = val;
	}
	public void run(){
		try{
			for(int i =0; i <10;i++){
				val++;
				sleep(1000);
				System.out.println(val);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
public class Pr35 extends Thread{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		IncVal ob = new IncVal(a);
		Thread t = new Thread(ob);
		t.start();
	}
}