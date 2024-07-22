class A{
	void disp(){
		System.out.println("This is Class A.");
	}
}
class B extends A{
	void disp(){
		System.out.println("This is Class B.");
	}
}
class C extends B{
	void disp(){
		System.out.println("This is Class C.");	
	}
}
class Multilevel{
		public static void main(String []args){
		C obj=new C();
		obj.disp();
	}
}
