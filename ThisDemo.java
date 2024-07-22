class ThisDemo{
	int no;
	String name;
	void Details(String name,int no){
		this.name=name;
		this.no=no;
	}
	void Display(){
		System.out.println(name + "\t" + no);
	}
public static void main(String args[]){
		ThisDemo obj=new ThisDemo();
		obj.Details("Yash",139);
		obj.Display();
}
