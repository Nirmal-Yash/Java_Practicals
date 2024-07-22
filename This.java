class This{
	int a;
	void disp(int a){
			this.a=a;
			System.out.println(this.a);
	}
	public static void main(String args[]){
		This obj=new This();
		obj.disp(100);
	}
}