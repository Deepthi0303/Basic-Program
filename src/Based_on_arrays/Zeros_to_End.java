package Based_on_arrays;

import java.util.Arrays;

public class Zeros_to_End {
public static void main(String[] args) {
	int[] a= {0,0,2,3,5,7,43,2,0};
	int[] b=new int[a.length];
	int j=0;
	 for (int i = 0; i < a.length; i++) {
		if(a[i]!=0) {
			b[j++]=a[i];
		}
	}
	 System.out.println(Arrays.toString(b));
}
}
