package Based_on_Numbers;

public class Sum_even_odd {
public static void main(String[] args) {
	int num=125617;
	int sum=0;
	while(num!=0) {
		int rem=num%10;
		sum+=rem;
		num/=10;
	}
	if(sum%2==0) {
		System.out.println("Even");
	}else {
		System.out.println("Odd");
	}
}
}
