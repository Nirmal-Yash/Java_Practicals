import java.util.*;

public class Pr33 extends Thread {
    static int n;
    static int partialSum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values to enter (N):");
        n = sc.nextInt();
        System.out.println("Enter number of threads:");
        int t = sc.nextInt();

        Pr33[] obj = new Pr33[t];
        Thread[] T = new Thread[t];

        for (int i = 0; i < t; i++) {
            obj[i] = new Pr33();
            T[i] = new Thread(obj[i]);
            T[i].start();
        }

        long totalSum = 0;

        for (int i = 0; i < t; i++) {
            try {
                T[i].join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        totalSum = getSum();
        System.out.println("Total Sum: " + totalSum);
    }

    public void run() {
            for (int i = 0; i < n; i++) {
                partialSum += i;
            }
    }

    static int getSum() {
        return partialSum;
    }
}
