package Based_on_arrays;

import java.util.Arrays;

public class Reverse_array {
public static void main(String[] args) {
	int arr[]= {88,8,90,23,100,12};
	int rev[]=new int[arr.length];
	int j=arr.length-1;
	for (int i = 0; i < arr.length; i++) {
		rev[i]=arr[j--];
	}
	System.out.println(Arrays.toString(rev));
}
}
