package Based_on_arrays;

import java.util.Arrays;
import java.util.TreeSet;

public class Missing_Number {
public static void main(String[] args) {
	int []arr= {1,4,6,2,8};
	Arrays.sort(arr);
	int start=arr[0];
	int end=arr[arr.length-1];
	TreeSet<Integer> t=new TreeSet<Integer>();
	for (int i = 0; i <arr.length; i++) {
		t.add(arr[i]);
	}
//	System.out.println(Arrays.toString(arr));
//	System.out.println(t);
	for (int i = start; i < end; i++) {
		if(!t.contains(i)) {
			System.out.print(i+" ");
		}
	}
}
}
