package Based_on_Strings;

public class Character_freq {
public static void main(String[] args) {
	String str="Happy";
	char[] ch=str.toCharArray();
	int[] freq=new int[128];
	for (int i = 0; i < ch.length; i++) {
		char c=ch[i];
		freq[c]++;
	}
	for (int i = 0; i < freq.length; i++) {
		if(freq[i]>0)
		{
			System.out.println((char)(i)+"->"+freq[i]);
		}
	}
	}
}

