import java.lang.*;
class A extends Thread{
	public void run(){
		for(int a=1;a<=50;a++){
			if(a%2==0){
				System.out.println(a);
			}
		}
	}
}

class B implements Runnable{
	public void run(){
		for(int i=1;i<=50;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}
}

public class ThreadEvenOdd{
	public static void main(String[] args){
		A obj = new A();
		obj.start();
		B obj2 = new B();
		Thread t = new Thread(obj2);
		t.start();
	}
}