package Practice;
//     3 2 1 0         0 1 2 3         0 1 2 3
//  0  * * * *         * * * *         * * * *  
//  1  * * *             * * *          * * *
//  2  * *                 * *           * *
//  3  *                     *            *
import java.util.Scanner;

public class Ulta_filled_triangle {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
//		for (int i = 0; i < n; i++) {
//			for (int j = n-1; j >=0; j--) {
//				if(j>=i)
//				{
//					System.out.print("* ");
//				}
//			}
//			System.out.println(" ");
//			
//		}
		
		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <n; j++) {
//				if(j>=i)
//				{
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");         //2 spaces is given
//				}
//			}
//			System.out.println(" ");
//		}
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				if(j>=i)
				{
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
	}
	}
}
