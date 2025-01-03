package Based_on_arrays;

import java.util.Arrays;

public class Segregate_Even_Odd {
public static void main(String[] args) {
	int[] a= {2,3,5,8,1};
	int e=0;
	int o=0;
	int[] even=new int[a.length];
	int[] odd=new int[a.length];
	for (int i = 0; i < a.length; i++) {
		if(a[i]%2==0) {
			even[e++]=a[i];
		}else {
			odd[o++]=a[i];
		}
	}
	System.out.println(e);
	System.out.println(o);
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		System.out.println("Even numbers: " + Arrays.toString(Arrays.copyOf(even, e)));
        System.out.println("Odd numbers: " + Arrays.toString(Arrays.copyOf(odd, o)));
}
}
