package Based_on_arrays;

import java.util.Arrays;

public class K_smallest_elem {
public static void main(String[] args) {
	int[] a= {2,3,5,8,1};
	int k=2;
	Arrays.sort(a);
	System.out.println(a[k-1]);
}
}
