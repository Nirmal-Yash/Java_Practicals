public class Maxof3{
	public static void main(String[] args){
		int a=10,b=50,c=70;
		if(a>b && a>c)
		{
			System.out.println("Max = "+ a);
		}
		else if(b>c && b>a)
		{
			System.out.println("Max = "+ b);
		}
		else
		{
			System.out.println("Max = "+ c);
		}
	}
}