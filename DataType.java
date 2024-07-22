class DataType{
	public static void main(String[] args){
		int a=10;
		Integer b=Integer.valueOf(a);
		String s=b.getClass().getSimpleName();
		System.out.println(s);
	}
}