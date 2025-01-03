package Based_on_arrays;

import java.util.TreeSet;

public class Remove_duplicates {
public static void main(String[] args) {
	int arr[]= {88,8,90,23,100,88,12};
	TreeSet<Integer> t=new TreeSet<Integer>();
	for (int i = 0; i < arr.length; i++) {
		t.add(arr[i]);
	}
	System.out.println(t);
}
}
