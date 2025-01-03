package Based_on_arrays;

public class Majority {
	public static void main(String[] args) {
		int[] a= {2,3,5,8,1,3,5,4,3,3,5,5,5,5};
		int[] arr=new int[10];
		for (int i = 0; i < a.length; i++) {
			arr[a[i]]++;
		}
		int large=arr[0];
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if(large<arr[i]) {
				large=arr[i];
				index=i;
			}
		}
		System.out.println(index);
	}
	
}
