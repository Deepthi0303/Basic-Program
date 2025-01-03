package Based_on_arrays;

public class Frequency_elem {
public static void main(String[] args) {
	int a[]= {88,8,90,23,100,88,12};
	int[] freq=new int[1000];
	for (int i = 0; i < a.length; i++) {
		freq[a[i]]++;
	}
	for (int i = 0; i < a.length; i++) {
		if(freq[a[i]]>0) {
		System.out.println(a[i]+"-->"+freq[a[i]]);
		freq[a[i]]=0;
	 }
	}
}
}
