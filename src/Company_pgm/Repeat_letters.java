package Company_pgm;

public class Repeat_letters {
	public static void main(String[] args) {
		String str="Hi-There";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			System.out.print(ch+""+ch+"");
		}
	}
}
