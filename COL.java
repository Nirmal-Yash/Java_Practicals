class A{
	A(){
		System.out.println("Default Constructor Called !!");
	}
	A(int a){
		System.out.println("Constructor with One Parameter :"+a);
	}
	A(int a,int b){
		System.out.println("Constructor with Two Parameters :"+a+"\t"+b);	
	}
}
class COL{
	public static void main(String []args){
		A obj=new A();
		A obj1=new A(5,10);
		A obj2=new A(100);
	}
}
