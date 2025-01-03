package Based_on_arrays;

public class Count_even_odd {
public static void main(String[] args) {
	int arr[]= {88,8,90,23,100,12};
	int even=0;
	int odd=0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2==0) {
			even++;
		}else {
			odd++;
		}
	}
	System.out.println("Even="+even);
	System.out.println("Odd="+odd);
}
}
