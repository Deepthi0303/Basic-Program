package Based_on_arrays;

public class Intersection {
public static void main(String[] args) {
	int[] a= {1,2,5,7,9};
	int[] b= {2,5,9};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if(a[i]==b[j])
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}
}
}
