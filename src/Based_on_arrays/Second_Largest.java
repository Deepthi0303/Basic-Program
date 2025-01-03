package Based_on_arrays;

import java.util.Arrays;

public class Second_Largest {
public static void main(String[] args) {
	int arr[]= {88,8,90,23,100,12};
	Arrays.sort(arr);
	System.out.println(arr[arr.length-2]);
}
}
