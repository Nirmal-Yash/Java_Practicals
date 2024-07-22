public class Rev{
	public static void main(String[] args) {
		int n=721;
		int rem=0,temp=0;
		while(n!=0)
		{
			rem=n%10;
			temp=temp*10+rem;
			n=n/10;		
		}
		System.out.println("Reversed Number :" + temp);
	}
}