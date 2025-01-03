package Based_on_Numbers;

import java.util.Arrays;

public class Binary_to_Integer {
	public static void main(String[] args) {
		String binary="1011";  
		int num;
		int org=0;
		int inc=0;
		char ch[]=binary.toCharArray();
		System.out.println(Arrays.toString(ch));
		for (int i = ch.length-1; i>=0; i--) {
			num=ch[i]-'0'; 
			if(num==1) {
			org+=Math.pow(2, inc);
			}
			inc++;
		}
		System.out.println(org);
	}
}
