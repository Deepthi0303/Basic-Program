package Based_on_arrays;

import java.util.Arrays;

public class Ascending_Descending {
public static void main(String[] args) {
	int arr[]= {88,8,90,23,100,88,12};
	int ascending[]=new int[arr.length];
	int descending[]=new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
		ascending[i]=arr[i];
	}
	Arrays.sort(ascending);
	int j=arr.length-1;
	for (int i = 0; i < arr.length; i++) {
		descending[i]=arr[j--];
	}
	System.out.println(Arrays.toString(descending));
	System.out.println(Arrays.toString(ascending));
	
	
}
}
