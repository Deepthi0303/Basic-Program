package Based_on_Numbers;

public class Armstrong {
public static void main(String[] args) {
	int num=153;
	int dup=num;
	int org=num;
	int count=0;
	int pow=0;
	while (num!=0) {
		count++;
		num/=10;
	}
	System.out.println(count);
	while(dup!=0) {
		int rem=dup%10;
		pow+=(int) Math.pow(rem,count);
		dup/=10;
	}
	System.out.println(pow);
	System.out.println(org==pow);
}
}
