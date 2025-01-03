package Based_on_arrays;
//1 2 3      1 2 3
//1 2 3      1 2 3
//1 2 3      1 2 3
public class Sum_Matrix {
public static void main(String[] args) {
	int[][] a= {{1,2,3},{1,2,3},{1,2,3}};
	int[][] b= {{1,2,3},{1,2,3},{1,2,3}};
	int[][] c=new int[a.length][b.length];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < c.length; j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
