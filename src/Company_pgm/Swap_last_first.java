package Company_pgm;

import java.util.Arrays;

public class Swap_last_first {
	public static void main(String[] args) {
//		String str="Milky way is our galaxy";
//		String[] arr=str.split(" ");
//
//		
//		String temp=arr[0];
//		arr[0]=arr[arr.length-1];
//		arr[arr.length-1]=temp;
//		
//		
//		System.out.println(Arrays.toString(arr));
		
		String str="Milky way is our galaxy";
		String[] arr=str.split(" ");
		String a=arr[0];
		String b=arr[arr.length-1];
		
		String temp=a;
		a=b;
		b=temp;
		
		String first=a;
		String last=b;
		System.out.println(a);
		System.out.println(b);
		
		arr[0]=first;
		arr[arr.length-1]=last;
		System.out.println(Arrays.toString(arr));
		
//		String arr[]= {"as","aad","4","5","3"};
//		String a="100";
//		arr[0]=a;
//		arr[arr.length-1]="200";
//		System.out.println(Arrays.toString(arr));
	}
}
