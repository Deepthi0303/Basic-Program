package Based_on_Strings;

import java.util.Arrays;

public class Anagrams {
public static void main(String[] args) {
	String str1="java";
	String str2="avaj";
	if(str1.length()==str2.length()) {
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Yes Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
	}else {
		System.out.println("Not Anagrams");
	}
}
}
