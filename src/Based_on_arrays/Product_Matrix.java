package Based_on_arrays;

//1 2 3      1 2 3     6 12 18
//1 2 3      1 2 3
//1 2 3      1 2 3
public class Product_Matrix {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] b = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int row1, row2, col1, col2;
		row1 = a.length; // 3 row1 row2
		row2 = b.length; // 3 col1 col2
		col1 = a[0].length; // 3
		col2 = b[0].length; // 2
		int prod[][] = new int[row1][col2];
		if (col1 != row2) {
			System.out.println("Not possible to multiple");
		} else {
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col2; j++) {
					for (int k = 0; k < col1; k++) {
						prod[i][j] = prod[i][j] + a[i][k] * b[k][j];
					}
				}
			}
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col2; j++) {
					System.out.print(prod[i][j] + " ");
				}
				System.out.println();

			}
		}
	}
}
