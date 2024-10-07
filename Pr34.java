import java.io.*;
import java.util.*;

class RandIntGen extends Thread{
	int s;
	Random rand = new Random();
	public void run(){
		try{
			s = rand.nextInt(100);
			System.out.println(s);
			sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public int IntRet(){
		return s;
	}
}
class EvenSq extends Thread{
	int a;
	EvenSq(int a){
		this.a = a;
	}
	public void run(){
		if(a%2 == 0){
			a = a * a;
			System.out.println("The Square is : "+a);
		}
	}
}
class OddCube extends Thread{
	int a;
	OddCube(int a){
		this.a=a;
	}
	public void run(){
		if(a%2 != 0){
			a = a * a * a;
			System.out.println("The Cube is : "+a);
		}
	}
}
public class Pr34 extends Thread{
	public static void main(String[] args){
		try{
				RandIntGen ob1 = new RandIntGen();
				ob1.start();

				EvenSq ob2 = new EvenSq(ob1.IntRet());
				OddCube ob3 = new OddCube(ob1.IntRet());

				ob2.start();
				ob3.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}