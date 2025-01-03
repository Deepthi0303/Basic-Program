package Based_on_Numbers;

public class Sum_Digits {
public static void main(String[] args) {
	int num=121;
	int rem=0;
	int sum=0;
	while(num!=0) {
		rem=num%10;         
		sum=sum+rem;     
		num/=10;
	}
	System.out.println(sum);
}
}
