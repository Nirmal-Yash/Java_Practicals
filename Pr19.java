class Rectangle{
	int len,brdth;
	Rectangle(int len,int brdth){
		this.len=len;
		this.brdth=brdth;
	}
	void area(){
		System.out.println("Area of Rectangle : "+(len*brdth));
	}
	void Perimeter(){
		System.out.println("Perimeter of Rectangle : "+((len+brdth)*2));
	}
}
class Square extends Rectangle{
	int s;
	Square(int s){
		super(s,s);
	}
	void area(){
		System.out.println("Area of Square : "+(len*len));
	}
	void Perimeter(){
		System.out.println("Perimeter of Square : "+(4*len));
	}
}

public class Pr19{
	public static void main(String[] args){
		Rectangle r[]=new Rectangle[4];
		Square s[]=new Square[4];
		int l[]={4,5,9,0};
		int b[]={7,9,3,0};
		for(int i=0;i<4;i++){
			r[i]= new Rectangle(l[i],b[i]);
			s[i]=new Square(l[i]);
		}
		for(int i=0;i<4;i++){
			r[i].area();
			r[i].Perimeter();
			System.out.println("");
			s[i].area();
			s[i].Perimeter();
			System.out.println("");
		}
	}
}