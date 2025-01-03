package Based_on_arrays;

import java.util.Arrays;

public class Merge_Arrays {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int[]b= {6,7,8,9};
	int[] c=new int[a.length+b.length];
	int j=0;
	for (int i = 0; i < a.length; i++) {
		c[j++]=a[i];
	}
	for (int i = 0; i < b.length; i++) {
		c[j++]=b[i];
	}
	System.out.println(Arrays.toString(c));
}
}
