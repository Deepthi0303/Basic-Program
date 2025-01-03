package Based_on_arrays;

import java.util.TreeSet;

public class Union {
public static void main(String[] args) {
	int[] a= {1,4,6,3};
	int[] b= {4,7,3,1};
	int[] c=new int[a.length+b.length];
	int j=0;
	for (int i = 0; i < a.length; i++) {
		c[j++]=a[i];
	}
	for (int i = 0; i < b.length; i++) {
		c[j++]=b[i];
	}
	TreeSet<Integer> t=new TreeSet<Integer>();
	for (int i = 0; i < c.length; i++) {
		t.add(c[i]);
	}
	System.out.println(t);
}
}
