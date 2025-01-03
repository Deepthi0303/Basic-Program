package Based_on_Strings;

public class Duplicate_char {
public static void main(String[] args) {
	String str1="Deeptaaaahihh";
	int arr[]=new int[128];
	for (int i = 0; i < str1.length(); i++) {
		char ch=str1.charAt(i);
		arr[ch]++;
	}
	for (int i = 0; i < str1.length(); i++) {
		char ch=str1.charAt(i);
		if(arr[ch]>1) {
			System.out.print((char)ch);
			arr[ch]=0;                                //avoid printing again
		}
	}
	
}
}
