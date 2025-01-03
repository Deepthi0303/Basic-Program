package Based_on_arrays;

public class Left_Rotation {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int k=6;
	int j=0;
	k=k%a.length;
	for (int i = 0; i < a.length; i++) {
		if(k<a.length) {
			System.out.print(a[k++]+" ");
		}
		else {
			System.out.print(a[j++]+" ");
		}
	}
	
}
}
