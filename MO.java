class A{
	static void disp(){
		System.out.println("Method of class A");
	}
}
class B extends A{
	static void disp(){
		System.out.println("Method of class B");
	}
}
class MO{
	public static void main(String []args){
		A obj=new A();
		A.disp();
	}
}