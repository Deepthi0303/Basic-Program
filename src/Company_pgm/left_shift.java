package Company_pgm;

public class left_shift {
	public static void main(String[] args) {
		int[] arr= {1,1,2,2,4};
		int k=1;
		int j=0;
		k=k%arr.length;
		for (int i = 0; i < arr.length; i++) {
			if(k<arr.length) {
				System.out.print(arr[k++]+" ");
			}else {
				System.out.print(arr[j++]+" ");
			}
		}
	}
}
