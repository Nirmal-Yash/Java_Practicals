class A{
	void dispA(){System.out.println("Class A Method");}
}
class B extends A{
	void dispB(){
		dispA();
		System.out.println("Class B Method");
	}
}
class C extends A{
	void dispC(){
		dispA();
		System.out.println("Class C Method");
	}
}
class B1 extends B{
	void dispB1(){
		dispB();
		System.out.println("Class B \ti] Method");
	}
}
class B2 extends B{
	void dispB2(){
		dispB();
		System.out.println("Class B \tii] Method \n");
	}		
}
class C1 extends C{
	void dispC1(){
		dispC();
		System.out.println("Class C \ti] Method");
	}	
}
class C2 extends C{
	void dispC2(){
		dispC();
		System.out.println("Class C \tii] Method \n");
	}
}
class Hierar{
	public static void main(String[] args){	
		B1 ob1=new B1();
		B2 ob2=new B2();
		C1 obj1=new C1();
		C2 obj2=new C2();
		ob1.dispB1();
		ob2.dispB2();
		obj2.dispC2();
		obj1.dispC1();
	}
}