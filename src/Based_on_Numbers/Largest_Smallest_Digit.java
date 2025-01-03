package Based_on_Numbers;

public class Largest_Smallest_Digit {
public static void main(String[] args) {
	int num=123456789;
	int max=0;
	int min=0;
	while(num!=0) {
		int rem=num%10;
		if(rem>max) {
			max=rem;
		}else {
			min=rem;
		}
		num/=10;
	}
	System.out.println("Max "+max);
	System.out.println("Min "+min);
}
}
