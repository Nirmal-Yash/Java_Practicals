class Parent{
	void method(){
		System.out.println("This is a Parent Class");
	}
}
class Child extends Parent{
	void method(){
		System.out.println("This is a Child Class");
	}
}
class Pr17{
	public static void main(String[] args){
		Parent obj1= new Parent();
		Child obj2= new Child();
		obj1.method();
		obj2.method();
	}
}