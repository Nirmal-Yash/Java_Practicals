import java.util.*;
import java.io.*;
class ThreadMatrix extends Thread{
	int[][] A;
	int[][] B;
	int[][] C;
	int row;

	ThreadMatrix(int[][] A,int[][] B, int[][] C,int row){
		this.A=A;
		this.B=B;
		this.C=C;
		this.row=row;
	}

	public void run(){
		for(int i = 0;i<B[0].length;i++){
			C[row][i]=0;
			for(int j=0 ; j<A[0].length;i++){
				C[row][i] += A[row][j] * B[j][i];
			}
		}
	}

	public static void main(String[] args) {
		int row,col;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for Square Matrix  for Ex:(3 => 3 X 3):");
		
		row = col = sc.nextInt();
		int[][] A = new int[row][col];
		int[][] B = new int[row][col];
		int[][] C = new int[row][col];		

		Random rand = new Random ();
		for(int i=0; i<row;i++){
			for(int j = 0; j<col ; j++){
				A[i][j] = rand.nextInt(100);
				B[i][j] = rand.nextInt(100);
			}
		}

		Thread[] t = new Thread[row];

		for(int i=0; i<row; i++){
			t[i] = new ThreadMatrix(A,B,C,i);
			t[i].start();
		}
		for(int i=0; i<row; i++){
			try{
				t[i].join();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}

		for(int i=0; i<C.length;i++){
			for(int j = 0; j<C[i].length ; j++){
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}

	}
}