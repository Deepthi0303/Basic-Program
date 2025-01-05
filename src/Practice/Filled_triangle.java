package Practice;

import java.util.Scanner;

//   0 1 2 3           3 2 1 0          3 2 1 0
//0  *               0       *        0    *
//1  * *             1     * *        1   * *
//2  * * *           2   * * *        2  * * *
//3  * * * *         3 * * * *        3 * * * *
public class Filled_triangle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				if(j<=i)
//				{
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//		}

//		for(int i=0;i<n;i++)
//		{
//			for(int j=n-1;j>=0;j--)
//			{
//				if(j<=i)
//				{
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (j <= i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
