import java.util.Scanner;
public class Pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	float expense[] =new float[30];
	float sum=0;
	
	for(int i=1;i<30;i++){
	System.out.print("Enter the expense of  day " +i +" : "); 
	expense[i]= sc.nextFloat();
	sum=sum+expense[i];
	
	}
	System.out.println("your totel expense is : " +sum);
}
}
