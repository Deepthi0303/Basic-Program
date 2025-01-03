package Based_on_arrays;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int [] a= {4,6,8,2,9};
		int num=10;
		
		HashMap<Integer,Integer> h=new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			h.put(i, a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			int d=num-a[i];   //6    a[i]=4
			if(h.containsValue(d))  {
				System.out.println(h.get(i)+" "+d);
				h.put(i,null);
			}
		}
		
//		int[] a = {4, 6, 8, 2, 9};
//        int num = 10;
//
//        // Create a HashMap to store the value and its index
//        HashMap<Integer, Integer> h = new HashMap<>();
//
//        // Iterate through the array to find the two-sum pairs
//        for (int i = 0; i < a.length; i++) {
//            int d = num - a[i]; // Calculate the complement
//            
//            // Check if the complement exists in the HashMap
//            if (h.containsKey(d)) {
//                System.out.println("Pair found: " + d + " and " + a[i]);
//            }
//
//            // Add the current element to the HashMap
//            h.put(a[i], i);
//        }

	}
}
