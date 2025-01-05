package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Xylem_num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int copy=n;
		int i=0;
		int count=0;
		
		while(copy!=0)
		{
			count++;
			copy/=10;
		}
		int[] arr=new int[count];
		
		while(n!=0)
		{
			int num=n%10;
			arr[i++]=num;
		    n/=10;
		}
		System.out.println(Arrays.toString(arr));
		
		int extremes=arr[0]+arr[count-1];
		int instreams=0;
		
		for(int j=1;j<count-1;j++)
		{
			instreams+=arr[j];
		}
		if(extremes==instreams)
		{
			System.out.println("They are Xylem Numbers");
		}else {
			System.out.println("They are not Xylem Numbers");
		}
	}

}
