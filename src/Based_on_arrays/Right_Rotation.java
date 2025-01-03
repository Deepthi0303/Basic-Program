package Based_on_arrays;

public class Right_Rotation {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int k=6;
	k=k%a.length;
	for (int i = 0; i < a.length; i++) {
		if(i<k) {
			System.out.print(a[a.length+i-k]+" ");
		}
		else {
			System.out.print(a[i-k]+" ");
		}
	}
}
}
