package Company_pgm;

import java.util.Arrays;

public class sort_array {
	public static void main(String[] args) {
		int[] org= {3, -5, 1, 7, -2, 4};
//		op        1, -5, 3, 4, -2, 7
		
		int index=0;
		int[] a=new int[org.length];
		for (int i = 0; i < org.length; i++) {
			if(org[i]>0) {
				a[index++]=org[i];
			}
		}
		
//		System.out.println(Arrays.toString(a));
		int[] x=Arrays.copyOf(a, index);
		Arrays.sort(x);
//		System.out.println(Arrays.toString(x));
		
		int[] sorted=new int[org.length];
		
		int j=0;
		for (int i = 0; i < org.length; i++) {
			if(org[i]>0) {
				sorted[i]=x[j++];
			}else {
				sorted[i]=org[i];
			}
		}
		System.out.println(Arrays.toString(sorted));
	}
}
