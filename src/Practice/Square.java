package Practice;

//  0 1 2 3
//0 * * * *
//1 *     *
//2 *     *
//3 * * * *

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i = 0; i <a; i++) {
			for(int j=0;j<a;j++)
			{
				if(i==0 || i==a-1)
				{
					System.out.print("* ");
				}
				else if(j==0 || j==a-1)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}
