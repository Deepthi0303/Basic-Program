package Based_on_Strings;

public class Only_digits {
public static void main(String[] args) {
	String a="452";
	if(a.matches("[0-9]+")) {
		System.out.println("Yes only digits");
	}else {
		System.out.println("No");
	}
}
}
