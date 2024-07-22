class A{
	void disp(){
		System.out.println("Method With no Parameters");
	}
	void disp(int a){
		System.out.println("Method With single Parameter "+a);	
	}
	void disp(int a, int b){
		System.out.println("Method With 2 Parameters "+a+"\t"+b);
	}
}
class MOL{
	public static void main(String[] args){
		A obj=new A();	
		obj.disp();
		obj.disp(100);
		obj.disp(2 ,4);
	}
}