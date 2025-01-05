package Practice;

import java.util.Scanner;

//     3 2 1 0 1 2 3
//   0       *  
//   1     *   *
//   2   *       *
//   3 * * * * * * *
public class Traingle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=n-1;j>=-(n-1);j--)
			{
				if(i==j || i==-j)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n+n-1;i++)
		{
			System.out.print("*");
		}
	}
}
