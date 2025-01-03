package Based_on_Strings;

public class Palindrome {
public static void main(String[] args) {
	String str="malam";
	String ans="";
	for (int i = str.length()-1; i >=0 ; i--) {
		ans+=str.charAt(i);
	}
	if(str.equals(ans)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
}
}
