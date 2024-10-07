class Shape{
	void printShape(){
		System.out.println("This is Shape.");
	}
}
class Rectangle extends Shape{
	void printRectangle(){
		System.out.println("This is Rectangular shape.");
	}
}
class Circle extends Shape{
	void printCircle(){
		System.out.println("This is Circular Shape.");
	}
}
class Square extends Rectangle{
	void printSquare(){
		System.out.println("Square is a Rectangle");
	}
}
public class Pr20{
	public static void main(String[] args){
		Square s=new Square();
		s.printRectangle();
		s.printShape();
	}
}