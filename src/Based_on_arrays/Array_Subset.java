package Based_on_arrays;

import java.util.HashSet;

public class Array_Subset {
	public static void main(String[] args) {

		int[] a = { 2, 3, 5, 8, 1 };
		int[] b = { 3, 1, 8 };
		if (isSubset(a, b)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static boolean isSubset(int[] arr1, int[] arr2) {
		boolean flag = true;
		HashSet<Integer> h = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			h.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			{
				if (!h.contains(arr2[i])) {
					flag = false;
					break;
				}
			}

		}
		return flag;

	}
}
