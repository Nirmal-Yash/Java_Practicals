interface AdvancedArithmetic{
	public int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
	public int divisor_sum(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		return sum;
	}
}

public class Pr22{
	public static void main(String[] args){
		MyCalculator obj = new MyCalculator();
		int a = obj.divisor_sum(6);
		System.out.println("Sum is :" + a);
	}
}