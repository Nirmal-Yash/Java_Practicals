class Sum{
	void Sum(){
		int a=50,b=50,sum;
		sum=a+b;
		System.out.println(sum);
	}
	void Sum(int a, int b){
		int sum=a+b;
		System.out.println(sum);
	}
	void Sum(int a,int b,int c){
		int sum=a+b+c;
		System.out.println(sum);
	}
	public static void main(String []args){
		Sum obj=new Sum();
		obj.Sum();
		obj.Sum(5,10);
		obj.Sum(20,50,30);
	}
}