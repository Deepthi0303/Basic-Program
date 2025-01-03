package Company_pgm;

public class Small_Big_num {
	public static void main(String[] args) {
		int[] arr= {12,23,44,1,-8,99};
		int small=arr[0];
		int big=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {
			if(arr[i]<small) {
				small=arr[i];
			}
			if(arr[i]>big) {
				big=arr[i];
			}
		}
		}
		System.out.println("Big "+big);
		System.out.println("Small "+small);
	}
}
