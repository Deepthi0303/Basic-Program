package Based_on_arrays;

public class Print_Duplicates {
public static void main(String[] args) {
	int arr[]= {88,8,90,23,100,88,12};
	int[] a=new int[101];
	for (int i = 0; i < arr.length; i++) {
		a[arr[i]]++;
	}
	for (int i = 0; i < arr.length; i++) {
		if(a[arr[i]]>1) {
			System.out.println(arr[i]);
			a[arr[i]]=0;
		}
	}
}
}
