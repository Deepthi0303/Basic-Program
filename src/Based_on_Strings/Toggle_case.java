package Based_on_Strings;

public class Toggle_case {
	public static void main(String[] args) {
		String name = "Deepthi";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
				System.out.print((char) (name.charAt(i) + 32));
			} else if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
				System.out.print((char) (name.charAt(i) - 32));
			}
		}
	}
}
