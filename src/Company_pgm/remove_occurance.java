package Company_pgm;

public class remove_occurance {
	public static void main(String[] args) {
		String org="Australia";
		String word=org.toLowerCase();
		int arr[]=new int[128];
		for (int i = 0; i < word.length(); i++) {
			char ch=word.charAt(i);
			arr[ch]++;
		}
		
		for (int i = 0; i < word.length(); i++) {
			char ch=word.charAt(i);
			if (arr[ch]==1) {
				System.out.print(ch);
			}
		}
	}
}
