import java.lang.Math.*;
class Shape{
	void area(float radius){
		double area;
		area=radius*radius*Math.PI;
		System.out.println("Area of Circle : "+area);
	}
	void area(float length, float width){
		float area;
		area=length*width;
		System.out.println("Area of Rectangle :"+area);
	}
	public static void main(String []args){
		Shape obj=new Shape();
		obj.area(7);
		obj.area(4,5);
	}
}