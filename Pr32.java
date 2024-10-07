import java.lang.*;
class A{
	A(){
		System.out.println("A Class");
	}
}

class B extends A implements Runnable{
	public void run(){
		System.out.println("Hello WORLD!");
	}
}

public class Pr32{
	public static void main(String[] args){
		B obj = new B();
		Thread t=new Thread(obj);
		t.start();
	}
}