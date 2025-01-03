package Based_on_Strings;

public class Whitespace_removal {
public static void main(String[] args) {
	String str="I love   Programming";
	str=str.replaceAll(" +","");
	System.out.println(str);
}
}
