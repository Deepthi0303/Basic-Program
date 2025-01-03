package Based_on_Strings;

public class Small_Large_words {
public static void main(String[] args) {
	String str="I Love Programming with apple";
	String[] s=str.split(" ");
	String small=s[0];
	String large=s[0];
	
	for (int i = 0; i < s.length; i++) {
		if(small.length()>s[i].length()) {
			small=s[i];
		}
		if(large.length()<s[i].length()) {
			large=s[i];
		}
	}
	System.out.println(small);
	System.out.println(large);
}
}
