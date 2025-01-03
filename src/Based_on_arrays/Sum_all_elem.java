package Based_on_arrays;

public class Sum_all_elem {
public static void main(String[] args) {
	int arr[]= {88,8,90,23,100,12};
	int sum=0;
	for (int i = 0; i < arr.length; i++) {
		sum+=arr[i];
	}
	System.out.println(sum);
}
}
