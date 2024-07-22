class Throw{
	public static void main(String[] args){
		try{
			int c=divide(10,0);
		}
		catch(ArithmeticException e){
			System.out.println("Error :"+e.getMessage());
		}	
	}
	static int divide(int a,int b){
		if(b==0){
			throw new ArithmeticException("Cannot Divide By Zero.");
		}
		return (a/b);
	}
}