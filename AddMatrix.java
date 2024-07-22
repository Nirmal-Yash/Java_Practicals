public class AddMatrix{
	public static void main(String[] args) {
		int a[][]={{8,9,3},{5,6,7},{1,2,0}};
		int b[][]={{8,9,3},{5,6,7},{1,2,0}};
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				int c[][]=new int[3][3];
				c[i][j]=a[i][j]+b[i][j];
				System.out.print("c["+i+"]"+"["+j+"]="+c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}