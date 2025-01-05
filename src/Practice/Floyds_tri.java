package Practice;

import java.util.Scanner;
//                3  2  1 0
//1             0         1             1
//2 3           1       2 3            2 3
//4 5 6         2     4 5 6           3 4 5  
//7 8 9 10      3  7 8 9 10          6 7 8 9
public class Floyds_tri {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int num=0;
//		for(int i=0;i<a;i++)
//		{
//			for(int j=0;j<a;j++)
//			{
//				if(j<=i)
//				{
//					System.out.print(++num+" ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int i=0;i<a;i++)
//		{
//			for(int j=a-1;j>=0;j--)
//			{
//				if(j<=i)
//				{
//					System.out.print(++num +" ");
//				}else {
//					System.out.print("  ");          // there is double space
//				}
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<a;i++)
			{
				for(int j=a-1;j>=0;j--)
				{
					if(j<=i)
					{
						System.out.print(++num +" ");
					}else {
						System.out.print(" ");          // there is single space
					}
				}
				System.out.println();
			}
		
	}
}
