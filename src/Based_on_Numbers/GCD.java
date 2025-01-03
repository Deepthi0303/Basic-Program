package Based_on_Numbers;

public class GCD {
public static void main(String[] args) {
	int num1=88;
	int num2=122;
	int small=Math.min(num1, num2);
	int gcd=1;
	for (int i = 1; i <=small; i++) {
		if(num1%i==0 && num2%i==0) {
			gcd=i;
		}
	}
	System.out.println(gcd);
}
}
