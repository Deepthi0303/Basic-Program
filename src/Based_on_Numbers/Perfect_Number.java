package Based_on_Numbers;

public class Perfect_Number {
public static void main(String[] args) {
	int num=496;
	int sum=0;
	for (int i = 1; i < num; i++) {
		if(num%i==0) {
			sum+=i;
		}
	}
	System.out.println(sum==num);
}
}
