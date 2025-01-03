package Based_on_Numbers;

public class Strong_number {
public static void main(String[] args) {
	int num=145;
	int copy=num;
	int sum=0;
	while(num!=0) {
		int rem=num%10;
		sum+=factorial(rem);
		num/=10;
	}
	System.out.println(sum);
	if(copy==sum) {
		System.out.println("True");
	}else {
		System.out.println("False");
	}
}

private static int factorial(int rem) {
	int fact=1;
	for (int i = rem; i > 0; i--) {
		fact*=i;
	}
	return fact;
}
}
