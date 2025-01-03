package Based_on_Strings;

public class String_Rotation {
public static void main(String[] args) {
	String str1="ArisGlobal";
	String str2="isGlobalar";
	String rotation=str1+str1;     //ArisGlobalArisGlobal
	if(rotation.toLowerCase().contains(str2.toLowerCase())) {
		System.out.println("Yes");
	}
	else {
		System.out.println("Noo");
	}
}
}
