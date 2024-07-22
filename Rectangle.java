public class Rectangle{
	private int height,weight;
	void Rectangle(int h,int w){
		height=h;
		weight=w;
	}
	void Display(){
		System.out.println("Weight = " + weight + "Kg and Height = " + height + "m");
	}
	public static void main(String[] args){
		Rectangle r=new Rectangle();
		r.Rectangle(50, 70);
		r.Display();
	}
}