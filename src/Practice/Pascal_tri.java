package Practice;

import java.util.Scanner;

//    4 3 2 1 0
//  0         1            1
//  1       1 1           1 1
//  2     1 2 1          1 2 1
//  3   1 3 3 1         1 3 2 1
//  4 1 4 6 4 1        1 4 6 4 1 
public class Pascal_tri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] pas = new int[a][a];

		for (int i = 0; i < a; i++) {
			for (int j = a - 1; j >= 0; j--) {
				if (j > i) {
					System.out.print("  ");
				} else {
					if (i == j || j == 0) {
						pas[i][j] = 1;
					} else {
						pas[i][j] = pas[i - 1][j - 1] + pas[i - 1][j];
					}
					System.out.print(pas[i][j] + "  ");
				}
			}
			System.out.println();
		}
//		for (int i = 0; i < pas.length; i++) {
//			for (int j = 0; j < pas.length; j++) {
//				if(pas[i][j]!=0)
//				System.out.print(pas[i][j]+" ");
//				else 
//				System.out.print("  ");
//			}
//			System.out.println();
//		}
	}
}
