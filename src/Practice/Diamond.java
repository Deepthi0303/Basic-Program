package Practice;

import java.util.Scanner;

//    3 2 1 0                 3 2 1 0 1 2 3
// 0     *                  0       *  
// 1    * *                 1     *   *
// 2   *   *                2   *       *
// 3  *     *               3 *           *
//     *   *                2   *       *
//      * *                 1     *   *
//       *                  0       *
public class Diamond {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)            //0 1 2 3
		{
			for(int j=n-1;j>=-(n-1);j--)       //3 2 1 0
			{
				if(j==i || j==-i)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=n-2;i>=0;i--)
		{
			for(int j=n-1;j>=-(n-1);j--)       //3 2 1 0
			{
				if(j==i || j==-i)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
