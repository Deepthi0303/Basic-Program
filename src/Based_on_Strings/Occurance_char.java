package Based_on_Strings;

public class Occurance_char {
public static void main(String[] args) {
	String str1="Deepthi";
	char c='e';
	int arr[]=new int[128];
	for (int i = 0; i < str1.length(); i++) {
		char ch=str1.charAt(i);
		arr[ch]++;
	}
//	for (int i = 0; i < arr.length; i++) {
//		if(arr[i]>0) {
//			System.out.println((char)i+"->"+arr[i]);
//		}
//	}
		System.out.println((char)c+"->"+arr[c]);
}
}
