class Static{
	static int a=10,b=20;
	static void Stat(){
		int x=a+b;
		System.out.println(x);
	}
	public static void main(String args[]){
		Static obj=new Static();
		obj.Stat();
	}
}