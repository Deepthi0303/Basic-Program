package Company_pgm;

import java.util.Arrays;

public class Sort_even_odd_index {
	public static void main(String[] args) {
		int[] arr= {6,1,9,2,4};
//		op=         4 2 6 1 9
		int[] sorted=new int[arr.length];
		
		int even[]=new int[arr.length];
		int odd[]=new int[arr.length];
		
		int a=0,b=0;
		for (int i = 0; i < arr.length; i++) {
			if (i%2==0) {
				even[a++]=arr[i];
			}else {
				odd[b++]=arr[i];
			}
		}
		
		even=Arrays.copyOf(even, a);
		odd=Arrays.copyOf(odd, b);
		
		int[] oddrev=new int[odd.length];
		int temp=0;
		for (int i = odd.length-1; i >=0; i--) {
			oddrev[temp++]=odd[i];
		}
		
		Arrays.sort(even);
		Arrays.sort(odd);
//		System.out.println(Arrays.toString(even));
//		System.out.println(Arrays.toString(oddrev));
		
		int evenindex=0;
		int oddindex=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (i%2==0) {
				sorted[i]=even[evenindex++];
			}else {
				sorted[i]=oddrev[oddindex++];
			}
		}
		
		System.out.println(Arrays.toString(sorted));
	}
}
