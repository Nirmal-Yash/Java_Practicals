public class MultiMatrix{
	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{1,2,3}};
		int b[][]={{1,2,3},{4,5,6},{1,2,3}};
		int c[][]=new int[3][3];
		for(int k=0;k<3;k++){
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					c[k][i]+=a[i][j]*b[j][i];
					
				}
			}
			
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print("c["+i+"]"+"["+j+"]="+c[i][j]+ "\t");
			}
			System.out.println();
		}
	}
}