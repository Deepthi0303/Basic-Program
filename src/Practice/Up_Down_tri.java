package Practice;

//     (changes)                 (changes)  
//  0      *                   0  * * * * *
//  1     * *                  1   * * * *
//  2    * * *                 2    * * *
//  3   * * * *                3     * *
//  4  * * * * *               4      *
//  0   * * * *                0     * *
//  1    * * *                 1    * * *
//  2     * *                  2   * * * * 
//  3      *                   3  * * * * * 

import java.util.Scanner;

public class Up_Down_tri {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

////		Upper Triangle
//		for (int i = 0; i < n; i++) {
//			for (int j = n - 1; j >= 0; j--) {
//				if (j <= i) {
//					System.out.print("* ");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
//		
////	    Lower Triangle
//		for (int i = 0; i <=n-2; i++) {               //loop properly
//			for (int j = 0; j <=n-2; j++) {           //loop properly
//				if(j>=i)
//				{
//					System.out.print(" *");
//				}else {
//					System.out.print(" ");         
//				}
//			}
//			System.out.println(" ");
//	}
		
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
		for (int i = 1; i < n; i++) {        //just changed 0 to 1
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
