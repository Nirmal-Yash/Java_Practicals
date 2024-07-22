interface Runnable{
	public void Run();
}
class Implementation implements Runnable{
	public void Run(){
		System.out.println("Interface Example.");
	}
}
class InterDemo {
	public static void main(String[] args){
		Implementation obj=new Implementation();
		obj.Run();
	}
}