import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enetr the totel distance in meter :");
	float a= sc.nextFloat();
	System.out.print("Enetr the total time in formet hh:mm:ss :");
	float h=sc.nextFloat();
	float m=sc.nextFloat();
	float s=sc.nextFloat();
	float time_s=(h*60*60)+(m*60)+s;
	float time_m=(h*60)+m+(s/60);
	float time_h=h+(m/60)+(s/3600);
	
	System.out.println("Which format you want speed ");
	System.out.println("1 - for meater per second");
	System.out.println("2 - for km per hour");
	System.out.println("3 - for mile per hour");
	int res=sc.nextInt();
	if (res==1){
	System.out.printf("your speed in m/s is :"+ a/time_s);
	}
	if(res==2){
	System.out.printf("your speed in km/hour is :"+ (a/1000)/time_h );	
}
if (res==3){
	System.out.printf("your speed in mile/hour is :"+(a/1609)/time_h);
} 
	}
}
