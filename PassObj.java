class PassObj{
	int a,b;
	void init(int a,int b){
		this.a=a;
		this.b=b;
	}
	void disp(){
		return a*b;
	}
	static void multi(PassObj obj){
			obj.init(10,20);
			obj.disp();
		}
	public static void main(String[] args){
		
		PassObj obj2= new PassObj(obj1);
	}
}