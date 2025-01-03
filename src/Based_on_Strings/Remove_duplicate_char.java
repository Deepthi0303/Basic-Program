package Based_on_Strings;

public class Remove_duplicate_char {
	public static void main(String[] args) {

		String str1 = "Deepthie";
		
//	int arr[]=new int[128];
//	for (int i = 0; i < str1.length(); i++) {
//		char ch=str1.charAt(i);
//		arr[ch]++;
//	}
//	for (int i = 0; i < str1.length(); i++) {
//		char ch=str1.charAt(i);
//		if(arr[ch]==1) {
//			System.out.print(ch);
//			arr[ch]=0;
//		}
//	}


		char[] ch = str1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			{
				boolean flag = true;
				for (int j = 0; j < ch.length; j++) {
					if (ch[i] == ch[j] && i != j) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.print(ch[i]);
				}
			}
		}
	}
}
