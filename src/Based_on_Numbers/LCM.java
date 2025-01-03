package Based_on_Numbers;

public class LCM {
public static void main(String[] args) {
	int num1=6;
	int num2=55;
	int big=Math.min(num1, num2);
	int gcd=1;
	for (int i = 1; i <=big; i++) {
		if(num1%i==0 && num2%i==0) {
			gcd=i;
		}
	}
	System.out.println((num1*num2)/gcd);

}
}
