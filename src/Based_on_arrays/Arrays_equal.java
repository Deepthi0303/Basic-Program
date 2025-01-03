package Based_on_arrays;

import java.util.Arrays;

public class Arrays_equal {
public static void main(String[] args) {
	int[] arr1= {3,6,2,18,10};
	int[] arr2= {10,20,18,6,3};
	if(arr1.length==arr2.length) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Yes Same");
		}else {
			System.out.println("Not Same");
		}
	}else {
		System.out.println("Not Same");
	}
}
}
