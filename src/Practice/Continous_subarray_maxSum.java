package Practice;

import java.util.Scanner;

public class Continous_subarray_maxSum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		
		int start=0;
		int end=0;
		int tempStart=0;
		int maxSum=Integer.MIN_VALUE;
		int curSum=0;
		
		for (int i = 0; i < arr.length; i++) {
			curSum+=arr[i];
			
			if(curSum>maxSum)
			{
				maxSum=curSum;
				start=tempStart;
				end=i;
			}
			
			if(curSum<0)
			{
				curSum=0;
				tempStart=i+1;
			}
		}
		System.out.println(maxSum);
		for (int i = start; i <=end; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
//-2 1 -3 4 -1 2 1 -5 4