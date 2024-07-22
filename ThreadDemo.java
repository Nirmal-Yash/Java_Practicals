class Hii extends Thread{
	public void run(){
		try{for(int i=1;i<=5;i++){
			System.out.println("Hii ");
			Thread.sleep(1000);
		}
		}catch(InterruptedException e){
			
		}
	}
}
class Hello extends Thread{
	public void run(){
		try{for(int i=1;i<=5;i++){
			System.out.println("Hello");
			Thread.sleep(2000);
		}
		}catch(InterruptedException e){
			
		}
	}
}
class ThreadDemo{
	public static void main(String[] args){
		Hii obj=new Hii();
		Hello obj2 =new Hello();
		
		obj.start();
		obj2.start();
	}
}