package Based_on_arrays;

public class Leaders {
public static void main(String[] args) {
	int[] a= {2,3,5,8,1};
	for (int i = 0; i < a.length; i++) {
		{
			boolean flag=true;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					flag=false;
					break;
				}				
			}
			if(flag) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
}
