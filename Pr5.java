import java.util.*;

public class Pr5 { 
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int price[] = {1000,650,300,100,50};
        double tax[] = {0.08,0.12,0.05,0.075,0.03};
        int bill = 0;
        System.out.println("1 - Motor");
        System.out.println("2 - Fan");
        System.out.println("3 - Tube");
        System.out.println("4 - Wires");
        System.out.println("5 - Other Items");

        System.err.print("Enter number of Items : ");
        int num = s.nextInt();
        int list[] = new int[num];

        System.out.print("Enter Item Number : ");
        for(int i=0  ; i<num ; i++){
            list[i] = s.nextInt();
        }

        for(int i=0 ; i<num ; i++){
            switch(list[i]){
                case 1 : bill += price[0] + price[0]*tax[0];
                break;
                case 2 : bill += price[1] + price[1]*tax[1];
                break;
                case 3 : bill += price[2] + price[2]*tax[2];
                break;
                case 4 : bill += price[3] + price[3]*tax[3];
                break;
                case 5 : bill += price[4] + price[4]*tax[4];
                break;
                default : System.out.println("Enter Valid Product Code");
                break;
            }
            System.out.println("Product Code : " + list[i] + " Price : " + price[list[i]-1] + " Tax : " + tax[list[i]-1]);
        }
        System.out.println("Your Total Bill : " + bill);
    }
}
