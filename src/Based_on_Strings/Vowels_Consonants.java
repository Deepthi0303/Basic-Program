package Based_on_Strings;

public class Vowels_Consonants {
public static void main(String[] args) {
	String str="Deepthi";
	int vcount=0;
	int ccount=0;
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
		{
			vcount++;
		}else {
			ccount++;
		}
	}
	System.out.println("Vowels="+vcount);
	System.out.println("Consonents="+ccount);
}
}
