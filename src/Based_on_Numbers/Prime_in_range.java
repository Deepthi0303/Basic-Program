package Based_on_Numbers;

public class Prime_in_range {
public static void main(String[] args) {
	int a=10;
	int b=20;
	for (int i = a; i <=b; i++) {
		if(Prime(i)) {
			System.out.print(i+" ");
		}
	}
}

private static boolean Prime(int a) {
	boolean flag=true;
	for (int i = 2; i < a; i++) {
		if(a%i==0) {
			flag=false;
		}
	}
	return flag;
}
}
