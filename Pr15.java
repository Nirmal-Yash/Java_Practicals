import java.util.*;
class Pr15{
	public static void main(String[] args){
		int len,br; 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length of Rectangle :");
		len = sc.nextInt();
		System.out.print("Enter Breadth of Rectangle :");
		br = sc.nextInt();
		Area obj=new Area(len,br);
		int area = obj.returnArea();
		System.out.println("Area of Rectangle is :"+area);
	}

}
class Area{
	int len,brth;
	Area(int length,int breadth){
		len=length;
		brth=breadth;
	}
	Area(){
		len=0;
		brth=0;
	}
	int returnArea(){
		int area=len*brth;
		return area;
	}
}