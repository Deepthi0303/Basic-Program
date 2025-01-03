package Based_on_Strings;

public class First_non_repeated_char {
public static void main(String[] args) {
	String str="aaxbbcaad";
	int[] arr=new int[128];
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		arr[ch]++;
	}
	for (int i = 0; i < str.length(); i++) {
		if(arr[str.charAt(i)]==1) {
			System.out.println(str.charAt(i));
			break;
		}
	}
}
}
